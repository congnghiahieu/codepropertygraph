package io.shiftleft.codepropertygraph.schema

import io.shiftleft.codepropertygraph.schema.CpgSchema.PropertyDefaults
import flatgraph.schema.Property.ValueType
import flatgraph.schema.{NodeType, SchemaBuilder, SchemaInfo}

object Extend extends SchemaBase {

  def apply(
    builder: SchemaBuilder,
    base: Base.Schema,
    methodSchema: Method.Schema,
    typeDecl: Type.Schema,
    ast: Ast.Schema,
    cfg: Cfg.Schema,
    fs: FileSystem.Schema,
    callGraph: CallGraph.Schema,
    pdg: Pdg.Schema,
    tags: TagsAndLocation.Schema,
    shortcuts: Shortcuts.Schema
  ) = new Schema(builder, base, methodSchema, typeDecl, ast, cfg, fs, callGraph, pdg, tags, shortcuts)

  def docIndex: Int                        = Int.MaxValue - 1
  override def providedByFrontend: Boolean = true

  override def description: String =
    """""".stripMargin

  class Schema(
    builder: SchemaBuilder,
    base: Base.Schema,
    methodSchema: Method.Schema,
    typeDeclSchema: Type.Schema,
    astSchema: Ast.Schema,
    cfgSchema: Cfg.Schema,
    fsSchema: FileSystem.Schema,
    callGraph: CallGraph.Schema,
    pdg: Pdg.Schema,
    tags: TagsAndLocation.Schema,
    shortcuts: Shortcuts.Schema
  ) {

    import base._
    import methodSchema._
    import astSchema._
    import fsSchema._
    import callGraph._
    import typeDeclSchema._
    import pdg._
    import tags._
    import shortcuts._

    implicit private val schemaInfo: SchemaInfo = SchemaInfo.forClass(getClass)

    val lifetimeParameter: NodeType = builder
      .addNodeType(
        name = "LIFETIME_PARAMETER",
        comment = """Actual lifetime parameter (use for Rust only).""".stripMargin
      )
      .protoId(400)
      .addProperties(name, code)

    val lifetimeArgument: NodeType = builder
      .addNodeType(
        name = "LIFETIME_ARGUMENT",
        comment = """Actual lifetime argument (use for Rust only).""".stripMargin
      )
      .protoId(401)
      .addProperties(name, code)

    val lifetime: NodeType = builder
      .addNodeType(
        name = "LIFETIME",
        comment = """This node represents a lifetime instance (use for Rust only).""".stripMargin
      )
      .protoId(402)
      .addProperties(name, fullName, typeDeclFullName)
      .starterName("lifetime")
      .primaryKey(name)

    val outLive = builder
      .addEdgeType(
        name = "OUT_LIVE",
        comment = """Edge used for LIFETIME_PARAMETER, LIFETIME_ARGUMENT, LIFETIME""".stripMargin
      )
      .protoId(403)

    lifetime.extendz(astNode)
    lifetime.addOutEdge(edge = ast, inNode = lifetimeParameter)
    lifetime.addOutEdge(edge = ast, inNode = lifetimeArgument)
    lifetime.addOutEdge(edge = ast, inNode = unknown)
    lifetime.addOutEdge(edge = ast, inNode = methodParameterIn)
    lifetime.addOutEdge(edge = ast, inNode = method)
    lifetime.addOutEdge(edge = outLive, inNode = lifetimeParameter)
    lifetime.addOutEdge(edge = outLive, inNode = lifetimeArgument)
    lifetime.addOutEdge(edge = outLive, inNode = unknown)
    lifetime.addOutEdge(edge = outLive, inNode = methodParameterIn)
    lifetime.addOutEdge(edge = outLive, inNode = method)
    lifetime.addOutEdge(edge = ref, inNode = lifetimeParameter)

    lifetimeParameter.extendz(astNode)
    lifetimeParameter.addOutEdge(edge = ast, inNode = lifetime)
    lifetimeParameter.addOutEdge(edge = ast, inNode = lifetimeArgument)
    lifetimeParameter.addOutEdge(edge = ast, inNode = method)
    lifetimeParameter.addOutEdge(edge = outLive, inNode = lifetime)
    lifetimeParameter.addOutEdge(edge = outLive, inNode = lifetimeArgument)
    lifetimeParameter.addOutEdge(edge = outLive, inNode = method)
    lifetimeParameter.addOutEdge(edge = ref, inNode = lifetime)

    lifetimeArgument.extendz(astNode)
    lifetimeArgument.addOutEdge(edge = ast, inNode = lifetime)
    lifetimeArgument.addOutEdge(edge = ast, inNode = lifetimeParameter)
    lifetimeArgument.addOutEdge(edge = outLive, inNode = lifetime)
    lifetimeArgument.addOutEdge(edge = outLive, inNode = lifetimeParameter)
    lifetimeArgument.addOutEdge(edge = bindsTo, inNode = lifetimeParameter)

    unknown.addOutEdge(edge = ast, inNode = lifetime)
    unknown.addOutEdge(edge = ast, inNode = lifetimeParameter)
    unknown.addOutEdge(edge = ast, inNode = lifetimeArgument)
    unknown.addOutEdge(edge = outLive, inNode = lifetime)
    unknown.addOutEdge(edge = outLive, inNode = lifetimeParameter)
    unknown.addOutEdge(edge = outLive, inNode = lifetimeArgument)

    methodParameterIn.addOutEdge(edge = ast, inNode = lifetime)
    methodParameterIn.addOutEdge(edge = ast, inNode = lifetimeParameter)
    methodParameterIn.addOutEdge(edge = ast, inNode = lifetimeArgument)
    methodParameterIn.addOutEdge(edge = outLive, inNode = lifetime)
    methodParameterIn.addOutEdge(edge = outLive, inNode = lifetimeParameter)
    methodParameterIn.addOutEdge(edge = outLive, inNode = lifetimeArgument)
  }
}
