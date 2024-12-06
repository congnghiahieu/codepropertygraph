package io.shiftleft.codepropertygraph.generated.neighboraccessors

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.language.*

final class AccessNeighborsForMethodParameterIn(val node: nodes.MethodParameterIn) extends AnyVal {

  /** Traverse to ANNOTATION via AST OUT edge.
    */
  def _annotationViaAstOut: Iterator[nodes.Annotation] = astOut.collectAll[nodes.Annotation]

  /** Traverse to CALL via REACHING_DEF OUT edge.
    */
  def _callViaReachingDefOut: Iterator[nodes.Call] = reachingDefOut.collectAll[nodes.Call]

  /** Traverse to CLOSURE_BINDING via CAPTURED_BY OUT edge.
    */
  def _closureBindingViaCapturedByOut: Iterator[nodes.ClosureBinding] = capturedByOut.collectAll[nodes.ClosureBinding]

  /** Traverse to CLOSURE_BINDING via REF IN edge.
    */
  def _closureBindingViaRefIn: Iterator[nodes.ClosureBinding] = refIn.collectAll[nodes.ClosureBinding]

  /** Traverse to IDENTIFIER via REACHING_DEF OUT edge.
    */
  def _identifierViaReachingDefOut: Iterator[nodes.Identifier] = reachingDefOut.collectAll[nodes.Identifier]

  /** Traverse to LIFETIME via AST IN edge.
    */
  def _lifetimeViaAstIn: Iterator[nodes.Lifetime] = astIn.collectAll[nodes.Lifetime]

  /** Traverse to LIFETIME via AST OUT edge.
    */
  def _lifetimeViaAstOut: Iterator[nodes.Lifetime] = astOut.collectAll[nodes.Lifetime]

  /** Traverse to LIFETIME via OUT_LIVE IN edge.
    */
  def _lifetimeViaOutLiveIn: Iterator[nodes.Lifetime] = outLiveIn.collectAll[nodes.Lifetime]

  /** Traverse to LIFETIME via OUT_LIVE OUT edge.
    */
  def _lifetimeViaOutLiveOut: Iterator[nodes.Lifetime] = outLiveOut.collectAll[nodes.Lifetime]

  /** Traverse to LIFETIME_ARGUMENT via AST OUT edge.
    */
  def _lifetimeArgumentViaAstOut: Iterator[nodes.LifetimeArgument] = astOut.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE OUT edge.
    */
  def _lifetimeArgumentViaOutLiveOut: Iterator[nodes.LifetimeArgument] = outLiveOut.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_PARAMETER via AST OUT edge.
    */
  def _lifetimeParameterViaAstOut: Iterator[nodes.LifetimeParameter] = astOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE OUT edge.
    */
  def _lifetimeParameterViaOutLiveOut: Iterator[nodes.LifetimeParameter] =
    outLiveOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to LITERAL via REACHING_DEF OUT edge.
    */
  def _literalViaReachingDefOut: Iterator[nodes.Literal] = reachingDefOut.collectAll[nodes.Literal]

  /** Traverse to METHOD via REACHING_DEF IN edge.
    */
  def _methodViaReachingDefIn: Iterator[nodes.Method] = reachingDefIn.collectAll[nodes.Method]

  /** Traverse to METHOD_PARAMETER_OUT via REACHING_DEF OUT edge.
    */
  def _methodParameterOutViaReachingDefOut: Iterator[nodes.MethodParameterOut] =
    reachingDefOut.collectAll[nodes.MethodParameterOut]

  /** Traverse to METHOD_REF via REACHING_DEF OUT edge.
    */
  def _methodRefViaReachingDefOut: Iterator[nodes.MethodRef] = reachingDefOut.collectAll[nodes.MethodRef]

  /** Traverse to RETURN via REACHING_DEF OUT edge.
    */
  def _returnViaReachingDefOut: Iterator[nodes.Return] = reachingDefOut.collectAll[nodes.Return]

  /** Traverse to TAG via TAGGED_BY OUT edge.
    */
  def _tagViaTaggedByOut: Iterator[nodes.Tag] = taggedByOut.collectAll[nodes.Tag]

  /** Traverse to TYPE_REF via REACHING_DEF OUT edge.
    */
  def _typeRefViaReachingDefOut: Iterator[nodes.TypeRef] = reachingDefOut.collectAll[nodes.TypeRef]

  /** Traverse to UNKNOWN via AST OUT edge.
    */
  def _unknownViaAstOut: Iterator[nodes.Unknown] = astOut.collectAll[nodes.Unknown]

  /** Places (identifier) where this parameter is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  @deprecated("please use referencingIdentifiers instead")
  def _identifierViaRefIn: Iterator[nodes.Identifier] = referencingIdentifiers

  /** Places (identifier) where this parameter is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  def referencingIdentifiers: Iterator[nodes.Identifier] = refIn.collectAll[nodes.Identifier]

  /** Traverse to corresponding formal output parameter Traverse to METHOD_PARAMETER_OUT via PARAMETER_LINK OUT edge.
    */
  @deprecated("please use asOutput instead")
  def _methodParameterOutViaParameterLinkOut: Iterator[nodes.MethodParameterOut] = asOutput

  /** Traverse to corresponding formal output parameter Traverse to METHOD_PARAMETER_OUT via PARAMETER_LINK OUT edge.
    */
  def asOutput: Iterator[nodes.MethodParameterOut] = parameterLinkOut.collectAll[nodes.MethodParameterOut]

  /** Traverse to method associated with this formal parameter Traverse to METHOD via AST IN edge.
    */
  @deprecated("please use method instead")
  def _methodViaAstIn: nodes.Method = method

  /** Traverse to method associated with this formal parameter Traverse to METHOD via AST IN edge.
    */
  def method: nodes.Method = {
    try { astIn.collectAll[nodes.Method].next() }
    catch {
      case e: java.util.NoSuchElementException =>
        val nodeInfo = String.format("id=%d, (seq=%d)", node.id, node.seq)
        throw new flatgraph.SchemaViolationException(
          "IN edge with label AST to an adjacent METHOD is mandatory, but not defined for this METHOD_PARAMETER_IN node with " + nodeInfo,
          e
        )
    }
  }

  /** Traverse to parameter type Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  @deprecated("please use typ instead")
  def _typeViaEvalTypeOut: nodes.Type = typ

  /** Traverse to parameter type Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  def typ: nodes.Type = {
    try { evalTypeOut.collectAll[nodes.Type].next() }
    catch {
      case e: java.util.NoSuchElementException =>
        val nodeInfo = String.format("id=%d, (seq=%d)", node.id, node.seq)
        throw new flatgraph.SchemaViolationException(
          "OUT edge with label EVAL_TYPE to an adjacent TYPE is mandatory, but not defined for this METHOD_PARAMETER_IN node with " + nodeInfo,
          e
        )
    }
  }

  def astIn: Iterator[nodes.AstNode] = node._astIn.cast[nodes.AstNode]

  def astOut: Iterator[nodes.AstNode] = node._astOut.cast[nodes.AstNode]

  def capturedByOut: Iterator[nodes.ClosureBinding] = node._capturedByOut.cast[nodes.ClosureBinding]

  def evalTypeOut: Iterator[nodes.Type] = node._evalTypeOut.cast[nodes.Type]

  def outLiveIn: Iterator[nodes.Lifetime] = node._outLiveIn.cast[nodes.Lifetime]

  def outLiveOut: Iterator[nodes.AstNode] = node._outLiveOut.cast[nodes.AstNode]

  def parameterLinkOut: Iterator[nodes.MethodParameterOut] = node._parameterLinkOut.cast[nodes.MethodParameterOut]

  def reachingDefIn: Iterator[nodes.Method] = node._reachingDefIn.cast[nodes.Method]

  def reachingDefOut: Iterator[nodes.CfgNode] = node._reachingDefOut.cast[nodes.CfgNode]

  def refIn: Iterator[nodes.StoredNode] = node._refIn.cast[nodes.StoredNode]

  def taggedByOut: Iterator[nodes.Tag] = node._taggedByOut.cast[nodes.Tag]
}

final class AccessNeighborsForMethodParameterInTraversal(val traversal: Iterator[nodes.MethodParameterIn])
    extends AnyVal {

  /** Traverse to ANNOTATION via AST OUT edge.
    */
  def _annotationViaAstOut: Iterator[nodes.Annotation] = traversal.flatMap(_._annotationViaAstOut)

  /** Traverse to CALL via REACHING_DEF OUT edge.
    */
  def _callViaReachingDefOut: Iterator[nodes.Call] = traversal.flatMap(_._callViaReachingDefOut)

  /** Traverse to CLOSURE_BINDING via CAPTURED_BY OUT edge.
    */
  def _closureBindingViaCapturedByOut: Iterator[nodes.ClosureBinding] =
    traversal.flatMap(_._closureBindingViaCapturedByOut)

  /** Traverse to CLOSURE_BINDING via REF IN edge.
    */
  def _closureBindingViaRefIn: Iterator[nodes.ClosureBinding] = traversal.flatMap(_._closureBindingViaRefIn)

  /** Traverse to IDENTIFIER via REACHING_DEF OUT edge.
    */
  def _identifierViaReachingDefOut: Iterator[nodes.Identifier] = traversal.flatMap(_._identifierViaReachingDefOut)

  /** Traverse to LIFETIME via AST IN edge.
    */
  def _lifetimeViaAstIn: Iterator[nodes.Lifetime] = traversal.flatMap(_._lifetimeViaAstIn)

  /** Traverse to LIFETIME via AST OUT edge.
    */
  def _lifetimeViaAstOut: Iterator[nodes.Lifetime] = traversal.flatMap(_._lifetimeViaAstOut)

  /** Traverse to LIFETIME via OUT_LIVE IN edge.
    */
  def _lifetimeViaOutLiveIn: Iterator[nodes.Lifetime] = traversal.flatMap(_._lifetimeViaOutLiveIn)

  /** Traverse to LIFETIME via OUT_LIVE OUT edge.
    */
  def _lifetimeViaOutLiveOut: Iterator[nodes.Lifetime] = traversal.flatMap(_._lifetimeViaOutLiveOut)

  /** Traverse to LIFETIME_ARGUMENT via AST OUT edge.
    */
  def _lifetimeArgumentViaAstOut: Iterator[nodes.LifetimeArgument] = traversal.flatMap(_._lifetimeArgumentViaAstOut)

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE OUT edge.
    */
  def _lifetimeArgumentViaOutLiveOut: Iterator[nodes.LifetimeArgument] =
    traversal.flatMap(_._lifetimeArgumentViaOutLiveOut)

  /** Traverse to LIFETIME_PARAMETER via AST OUT edge.
    */
  def _lifetimeParameterViaAstOut: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaAstOut)

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE OUT edge.
    */
  def _lifetimeParameterViaOutLiveOut: Iterator[nodes.LifetimeParameter] =
    traversal.flatMap(_._lifetimeParameterViaOutLiveOut)

  /** Traverse to LITERAL via REACHING_DEF OUT edge.
    */
  def _literalViaReachingDefOut: Iterator[nodes.Literal] = traversal.flatMap(_._literalViaReachingDefOut)

  /** Traverse to METHOD via REACHING_DEF IN edge.
    */
  def _methodViaReachingDefIn: Iterator[nodes.Method] = traversal.flatMap(_._methodViaReachingDefIn)

  /** Traverse to METHOD_PARAMETER_OUT via REACHING_DEF OUT edge.
    */
  def _methodParameterOutViaReachingDefOut: Iterator[nodes.MethodParameterOut] =
    traversal.flatMap(_._methodParameterOutViaReachingDefOut)

  /** Traverse to METHOD_REF via REACHING_DEF OUT edge.
    */
  def _methodRefViaReachingDefOut: Iterator[nodes.MethodRef] = traversal.flatMap(_._methodRefViaReachingDefOut)

  /** Traverse to RETURN via REACHING_DEF OUT edge.
    */
  def _returnViaReachingDefOut: Iterator[nodes.Return] = traversal.flatMap(_._returnViaReachingDefOut)

  /** Traverse to TAG via TAGGED_BY OUT edge.
    */
  def _tagViaTaggedByOut: Iterator[nodes.Tag] = traversal.flatMap(_._tagViaTaggedByOut)

  /** Traverse to TYPE_REF via REACHING_DEF OUT edge.
    */
  def _typeRefViaReachingDefOut: Iterator[nodes.TypeRef] = traversal.flatMap(_._typeRefViaReachingDefOut)

  /** Traverse to UNKNOWN via AST OUT edge.
    */
  def _unknownViaAstOut: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaAstOut)

  /** Places (identifier) where this parameter is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  def referencingIdentifiers: Iterator[nodes.Identifier] = traversal.flatMap(_.referencingIdentifiers)

  /** Places (identifier) where this parameter is being referenced Traverse to IDENTIFIER via REF IN edge.
    */
  @deprecated("please use referencingIdentifiers instead")
  def _identifierViaRefIn: Iterator[nodes.Identifier] = traversal.flatMap(_._identifierViaRefIn)

  /** Traverse to corresponding formal output parameter Traverse to METHOD_PARAMETER_OUT via PARAMETER_LINK OUT edge.
    */
  def asOutput: Iterator[nodes.MethodParameterOut] = traversal.flatMap(_.asOutput)

  /** Traverse to corresponding formal output parameter Traverse to METHOD_PARAMETER_OUT via PARAMETER_LINK OUT edge.
    */
  @deprecated("please use asOutput instead")
  def _methodParameterOutViaParameterLinkOut: Iterator[nodes.MethodParameterOut] =
    traversal.flatMap(_._methodParameterOutViaParameterLinkOut)

  /** Traverse to method associated with this formal parameter Traverse to METHOD via AST IN edge.
    */
  def method: Iterator[nodes.Method] = traversal.map(_.method)

  /** Traverse to method associated with this formal parameter Traverse to METHOD via AST IN edge.
    */
  @deprecated("please use method instead")
  def _methodViaAstIn: Iterator[nodes.Method] = traversal.map(_._methodViaAstIn)

  /** Traverse to parameter type Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  def typ: Iterator[nodes.Type] = traversal.map(_.typ)

  /** Traverse to parameter type Traverse to TYPE via EVAL_TYPE OUT edge.
    */
  @deprecated("please use typ instead")
  def _typeViaEvalTypeOut: Iterator[nodes.Type] = traversal.map(_._typeViaEvalTypeOut)

  def astIn: Iterator[nodes.AstNode] = traversal.flatMap(_.astIn)

  def astOut: Iterator[nodes.AstNode] = traversal.flatMap(_.astOut)

  def capturedByOut: Iterator[nodes.ClosureBinding] = traversal.flatMap(_.capturedByOut)

  def evalTypeOut: Iterator[nodes.Type] = traversal.flatMap(_.evalTypeOut)

  def outLiveIn: Iterator[nodes.Lifetime] = traversal.flatMap(_.outLiveIn)

  def outLiveOut: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveOut)

  def parameterLinkOut: Iterator[nodes.MethodParameterOut] = traversal.flatMap(_.parameterLinkOut)

  def reachingDefIn: Iterator[nodes.Method] = traversal.flatMap(_.reachingDefIn)

  def reachingDefOut: Iterator[nodes.CfgNode] = traversal.flatMap(_.reachingDefOut)

  def refIn: Iterator[nodes.StoredNode] = traversal.flatMap(_.refIn)

  def taggedByOut: Iterator[nodes.Tag] = traversal.flatMap(_.taggedByOut)
}
