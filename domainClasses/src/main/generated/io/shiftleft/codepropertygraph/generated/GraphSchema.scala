package io.shiftleft.codepropertygraph.generated

import flatgraph.FormalQtyType

object GraphSchema extends flatgraph.Schema {
  private val nodeLabels = IndexedSeq(
    "ANNOTATION",
    "ANNOTATION_LITERAL",
    "ANNOTATION_PARAMETER",
    "ANNOTATION_PARAMETER_ASSIGN",
    "ARRAY_INITIALIZER",
    "BINDING",
    "BLOCK",
    "CALL",
    "CLOSURE_BINDING",
    "COMMENT",
    "CONFIG_FILE",
    "CONTROL_STRUCTURE",
    "DEPENDENCY",
    "FIELD_IDENTIFIER",
    "FILE",
    "FINDING",
    "IDENTIFIER",
    "IMPORT",
    "JUMP_LABEL",
    "JUMP_TARGET",
    "KEY_VALUE_PAIR",
    "LIFETIME",
    "LIFETIME_ARGUMENT",
    "LIFETIME_PARAMETER",
    "LITERAL",
    "LOCAL",
    "LOCATION",
    "MEMBER",
    "META_DATA",
    "METHOD",
    "METHOD_PARAMETER_IN",
    "METHOD_PARAMETER_OUT",
    "METHOD_REF",
    "METHOD_RETURN",
    "MODIFIER",
    "NAMESPACE",
    "NAMESPACE_BLOCK",
    "RETURN",
    "TAG",
    "TAG_NODE_PAIR",
    "TEMPLATE_DOM",
    "TYPE",
    "TYPE_ARGUMENT",
    "TYPE_DECL",
    "TYPE_PARAMETER",
    "TYPE_REF",
    "UNKNOWN"
  )
  val nodeKindByLabel = nodeLabels.zipWithIndex.toMap
  val edgeLabels: Array[String] = Array(
    "ALIAS_OF",
    "ARGUMENT",
    "AST",
    "BINDS",
    "BINDS_TO",
    "CALL",
    "CAPTURE",
    "CAPTURED_BY",
    "CDG",
    "CFG",
    "CONDITION",
    "CONTAINS",
    "DOMINATE",
    "EVAL_TYPE",
    "IMPORTS",
    "INHERITS_FROM",
    "IS_CALL_FOR_IMPORT",
    "PARAMETER_LINK",
    "POST_DOMINATE",
    "REACHING_DEF",
    "RECEIVER",
    "REF",
    "SOURCE_FILE",
    "TAGGED_BY"
  )
  val edgeKindByLabel = edgeLabels.zipWithIndex.toMap
  val edgePropertyAllocators: Array[Int => Array[?]] = Array(
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => null,
    size => Array.fill(size)("<empty>") /* label = REACHING_DEF, id = 19 */,
    size => null,
    size => null,
    size => null,
    size => null
  )
  val nodeFactories: Array[(flatgraph.Graph, Int) => nodes.StoredNode] = Array(
    (g, seq) => new nodes.Annotation(g, seq),
    (g, seq) => new nodes.AnnotationLiteral(g, seq),
    (g, seq) => new nodes.AnnotationParameter(g, seq),
    (g, seq) => new nodes.AnnotationParameterAssign(g, seq),
    (g, seq) => new nodes.ArrayInitializer(g, seq),
    (g, seq) => new nodes.Binding(g, seq),
    (g, seq) => new nodes.Block(g, seq),
    (g, seq) => new nodes.Call(g, seq),
    (g, seq) => new nodes.ClosureBinding(g, seq),
    (g, seq) => new nodes.Comment(g, seq),
    (g, seq) => new nodes.ConfigFile(g, seq),
    (g, seq) => new nodes.ControlStructure(g, seq),
    (g, seq) => new nodes.Dependency(g, seq),
    (g, seq) => new nodes.FieldIdentifier(g, seq),
    (g, seq) => new nodes.File(g, seq),
    (g, seq) => new nodes.Finding(g, seq),
    (g, seq) => new nodes.Identifier(g, seq),
    (g, seq) => new nodes.Import(g, seq),
    (g, seq) => new nodes.JumpLabel(g, seq),
    (g, seq) => new nodes.JumpTarget(g, seq),
    (g, seq) => new nodes.KeyValuePair(g, seq),
    (g, seq) => new nodes.Lifetime(g, seq),
    (g, seq) => new nodes.LifetimeArgument(g, seq),
    (g, seq) => new nodes.LifetimeParameter(g, seq),
    (g, seq) => new nodes.Literal(g, seq),
    (g, seq) => new nodes.Local(g, seq),
    (g, seq) => new nodes.Location(g, seq),
    (g, seq) => new nodes.Member(g, seq),
    (g, seq) => new nodes.MetaData(g, seq),
    (g, seq) => new nodes.Method(g, seq),
    (g, seq) => new nodes.MethodParameterIn(g, seq),
    (g, seq) => new nodes.MethodParameterOut(g, seq),
    (g, seq) => new nodes.MethodRef(g, seq),
    (g, seq) => new nodes.MethodReturn(g, seq),
    (g, seq) => new nodes.Modifier(g, seq),
    (g, seq) => new nodes.Namespace(g, seq),
    (g, seq) => new nodes.NamespaceBlock(g, seq),
    (g, seq) => new nodes.Return(g, seq),
    (g, seq) => new nodes.Tag(g, seq),
    (g, seq) => new nodes.TagNodePair(g, seq),
    (g, seq) => new nodes.TemplateDom(g, seq),
    (g, seq) => new nodes.Type(g, seq),
    (g, seq) => new nodes.TypeArgument(g, seq),
    (g, seq) => new nodes.TypeDecl(g, seq),
    (g, seq) => new nodes.TypeParameter(g, seq),
    (g, seq) => new nodes.TypeRef(g, seq),
    (g, seq) => new nodes.Unknown(g, seq)
  )
  val edgeFactories: Array[(flatgraph.GNode, flatgraph.GNode, Int, Any) => flatgraph.Edge] = Array(
    (s, d, subseq, p) => new edges.AliasOf(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Argument(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ast(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Binds(s, d, subseq, p),
    (s, d, subseq, p) => new edges.BindsTo(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Call(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Capture(s, d, subseq, p),
    (s, d, subseq, p) => new edges.CapturedBy(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cdg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Cfg(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Condition(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Contains(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Dominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.EvalType(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Imports(s, d, subseq, p),
    (s, d, subseq, p) => new edges.InheritsFrom(s, d, subseq, p),
    (s, d, subseq, p) => new edges.IsCallForImport(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ParameterLink(s, d, subseq, p),
    (s, d, subseq, p) => new edges.PostDominate(s, d, subseq, p),
    (s, d, subseq, p) => new edges.ReachingDef(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Receiver(s, d, subseq, p),
    (s, d, subseq, p) => new edges.Ref(s, d, subseq, p),
    (s, d, subseq, p) => new edges.SourceFile(s, d, subseq, p),
    (s, d, subseq, p) => new edges.TaggedBy(s, d, subseq, p)
  )
  val nodePropertyAllocators: Array[Int => Array[?]] = Array(
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[Boolean](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[Int](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[String](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size),
    size => new Array[flatgraph.GNode](size)
  )
  val normalNodePropertyNames: Array[String] = Array(
    "ALIAS_TYPE_FULL_NAME",
    "ARGUMENT_INDEX",
    "ARGUMENT_NAME",
    "AST_PARENT_FULL_NAME",
    "AST_PARENT_TYPE",
    "CANONICAL_NAME",
    "CLASS_NAME",
    "CLASS_SHORT_NAME",
    "CLOSURE_BINDING_ID",
    "CLOSURE_ORIGINAL_NAME",
    "CODE",
    "COLUMN_NUMBER",
    "COLUMN_NUMBER_END",
    "CONTAINED_REF",
    "CONTENT",
    "CONTROL_STRUCTURE_TYPE",
    "DEPENDENCY_GROUP_ID",
    "DISPATCH_TYPE",
    "DYNAMIC_TYPE_HINT_FULL_NAME",
    "EVALUATION_STRATEGY",
    "EXPLICIT_AS",
    "FILENAME",
    "FULL_NAME",
    "HASH",
    "IMPORTED_AS",
    "IMPORTED_ENTITY",
    "INDEX",
    "INHERITS_FROM_TYPE_FULL_NAME",
    "IS_EXPLICIT",
    "IS_EXTERNAL",
    "IS_VARIADIC",
    "IS_WILDCARD",
    "KEY",
    "LANGUAGE",
    "LINE_NUMBER",
    "LINE_NUMBER_END",
    "METHOD_FULL_NAME",
    "METHOD_SHORT_NAME",
    "MODIFIER_TYPE",
    "NAME",
    "NODE_LABEL",
    "OFFSET",
    "OFFSET_END",
    "ORDER",
    "OVERLAYS",
    "PACKAGE_NAME",
    "PARSER_TYPE_NAME",
    "POSSIBLE_TYPES",
    "ROOT",
    "SIGNATURE",
    "SYMBOL",
    "TYPE_DECL_FULL_NAME",
    "TYPE_FULL_NAME",
    "VALUE",
    "VERSION"
  )
  val nodePropertyByLabel = normalNodePropertyNames.zipWithIndex.toMap
    .updated("evidence", 55)
    .updated("keyValuePairs", 56)
    .updated("node", 57)
    .updated("tag", 58)
  val nodePropertyDescriptors: Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType] = {
    val nodePropertyDescriptors = new Array[FormalQtyType.FormalQuantity | FormalQtyType.FormalType](5546)
    for (idx <- Range(0, 5546)) {
      nodePropertyDescriptors(idx) =
        if ((idx & 1) == 0) FormalQtyType.NothingType
        else FormalQtyType.QtyNone
    }

    nodePropertyDescriptors(94) = FormalQtyType.IntType // ANNOTATION.ARGUMENT_INDEX
    nodePropertyDescriptors(95) = FormalQtyType.QtyOne
    nodePropertyDescriptors(188) = FormalQtyType.StringType // ANNOTATION.ARGUMENT_NAME
    nodePropertyDescriptors(189) = FormalQtyType.QtyOption
    nodePropertyDescriptors(940) = FormalQtyType.StringType // ANNOTATION.CODE
    nodePropertyDescriptors(941) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1034) = FormalQtyType.IntType // ANNOTATION.COLUMN_NUMBER
    nodePropertyDescriptors(1035) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2068) = FormalQtyType.StringType // ANNOTATION.FULL_NAME
    nodePropertyDescriptors(2069) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3196) = FormalQtyType.IntType // ANNOTATION.LINE_NUMBER
    nodePropertyDescriptors(3197) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3666) = FormalQtyType.StringType // ANNOTATION.NAME
    nodePropertyDescriptors(3667) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4042) = FormalQtyType.IntType // ANNOTATION.ORDER
    nodePropertyDescriptors(4043) = FormalQtyType.QtyOne
    nodePropertyDescriptors(96) = FormalQtyType.IntType // ANNOTATION_LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(97) = FormalQtyType.QtyOne
    nodePropertyDescriptors(190) = FormalQtyType.StringType // ANNOTATION_LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(191) = FormalQtyType.QtyOption
    nodePropertyDescriptors(942) = FormalQtyType.StringType // ANNOTATION_LITERAL.CODE
    nodePropertyDescriptors(943) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1036) = FormalQtyType.IntType // ANNOTATION_LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(1037) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3198) = FormalQtyType.IntType // ANNOTATION_LITERAL.LINE_NUMBER
    nodePropertyDescriptors(3199) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3668) = FormalQtyType.StringType // ANNOTATION_LITERAL.NAME
    nodePropertyDescriptors(3669) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4044) = FormalQtyType.IntType // ANNOTATION_LITERAL.ORDER
    nodePropertyDescriptors(4045) = FormalQtyType.QtyOne
    nodePropertyDescriptors(944) = FormalQtyType.StringType // ANNOTATION_PARAMETER.CODE
    nodePropertyDescriptors(945) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1038) = FormalQtyType.IntType // ANNOTATION_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(1039) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3200) = FormalQtyType.IntType // ANNOTATION_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(3201) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4046) = FormalQtyType.IntType // ANNOTATION_PARAMETER.ORDER
    nodePropertyDescriptors(4047) = FormalQtyType.QtyOne
    nodePropertyDescriptors(946) = FormalQtyType.StringType // ANNOTATION_PARAMETER_ASSIGN.CODE
    nodePropertyDescriptors(947) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1040) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.COLUMN_NUMBER
    nodePropertyDescriptors(1041) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3202) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.LINE_NUMBER
    nodePropertyDescriptors(3203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4048) = FormalQtyType.IntType // ANNOTATION_PARAMETER_ASSIGN.ORDER
    nodePropertyDescriptors(4049) = FormalQtyType.QtyOne
    nodePropertyDescriptors(102) = FormalQtyType.IntType // ARRAY_INITIALIZER.ARGUMENT_INDEX
    nodePropertyDescriptors(103) = FormalQtyType.QtyOne
    nodePropertyDescriptors(196) = FormalQtyType.StringType // ARRAY_INITIALIZER.ARGUMENT_NAME
    nodePropertyDescriptors(197) = FormalQtyType.QtyOption
    nodePropertyDescriptors(948) = FormalQtyType.StringType // ARRAY_INITIALIZER.CODE
    nodePropertyDescriptors(949) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1042) = FormalQtyType.IntType // ARRAY_INITIALIZER.COLUMN_NUMBER
    nodePropertyDescriptors(1043) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3204) = FormalQtyType.IntType // ARRAY_INITIALIZER.LINE_NUMBER
    nodePropertyDescriptors(3205) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4050) = FormalQtyType.IntType // ARRAY_INITIALIZER.ORDER
    nodePropertyDescriptors(4051) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3394) = FormalQtyType.StringType // BINDING.METHOD_FULL_NAME
    nodePropertyDescriptors(3395) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3676) = FormalQtyType.StringType // BINDING.NAME
    nodePropertyDescriptors(3677) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4616) = FormalQtyType.StringType // BINDING.SIGNATURE
    nodePropertyDescriptors(4617) = FormalQtyType.QtyOne
    nodePropertyDescriptors(106) = FormalQtyType.IntType // BLOCK.ARGUMENT_INDEX
    nodePropertyDescriptors(107) = FormalQtyType.QtyOne
    nodePropertyDescriptors(200) = FormalQtyType.StringType // BLOCK.ARGUMENT_NAME
    nodePropertyDescriptors(201) = FormalQtyType.QtyOption
    nodePropertyDescriptors(952) = FormalQtyType.StringType // BLOCK.CODE
    nodePropertyDescriptors(953) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1046) = FormalQtyType.IntType // BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(1047) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1704) = FormalQtyType.StringType // BLOCK.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1705) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3208) = FormalQtyType.IntType // BLOCK.LINE_NUMBER
    nodePropertyDescriptors(3209) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4054) = FormalQtyType.IntType // BLOCK.ORDER
    nodePropertyDescriptors(4055) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4430) = FormalQtyType.StringType // BLOCK.POSSIBLE_TYPES
    nodePropertyDescriptors(4431) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4900) = FormalQtyType.StringType // BLOCK.TYPE_FULL_NAME
    nodePropertyDescriptors(4901) = FormalQtyType.QtyOne
    nodePropertyDescriptors(108) = FormalQtyType.IntType // CALL.ARGUMENT_INDEX
    nodePropertyDescriptors(109) = FormalQtyType.QtyOne
    nodePropertyDescriptors(202) = FormalQtyType.StringType // CALL.ARGUMENT_NAME
    nodePropertyDescriptors(203) = FormalQtyType.QtyOption
    nodePropertyDescriptors(954) = FormalQtyType.StringType // CALL.CODE
    nodePropertyDescriptors(955) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1048) = FormalQtyType.IntType // CALL.COLUMN_NUMBER
    nodePropertyDescriptors(1049) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1612) = FormalQtyType.StringType // CALL.DISPATCH_TYPE
    nodePropertyDescriptors(1613) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1706) = FormalQtyType.StringType // CALL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1707) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3210) = FormalQtyType.IntType // CALL.LINE_NUMBER
    nodePropertyDescriptors(3211) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3398) = FormalQtyType.StringType // CALL.METHOD_FULL_NAME
    nodePropertyDescriptors(3399) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3680) = FormalQtyType.StringType // CALL.NAME
    nodePropertyDescriptors(3681) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4056) = FormalQtyType.IntType // CALL.ORDER
    nodePropertyDescriptors(4057) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4432) = FormalQtyType.StringType // CALL.POSSIBLE_TYPES
    nodePropertyDescriptors(4433) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4620) = FormalQtyType.StringType // CALL.SIGNATURE
    nodePropertyDescriptors(4621) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4902) = FormalQtyType.StringType // CALL.TYPE_FULL_NAME
    nodePropertyDescriptors(4903) = FormalQtyType.QtyOne
    nodePropertyDescriptors(768) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_BINDING_ID
    nodePropertyDescriptors(769) = FormalQtyType.QtyOption
    nodePropertyDescriptors(862) = FormalQtyType.StringType // CLOSURE_BINDING.CLOSURE_ORIGINAL_NAME
    nodePropertyDescriptors(863) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1802) = FormalQtyType.StringType // CLOSURE_BINDING.EVALUATION_STRATEGY
    nodePropertyDescriptors(1803) = FormalQtyType.QtyOne
    nodePropertyDescriptors(958) = FormalQtyType.StringType // COMMENT.CODE
    nodePropertyDescriptors(959) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1052) = FormalQtyType.IntType // COMMENT.COLUMN_NUMBER
    nodePropertyDescriptors(1053) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1992) = FormalQtyType.StringType // COMMENT.FILENAME
    nodePropertyDescriptors(1993) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3214) = FormalQtyType.IntType // COMMENT.LINE_NUMBER
    nodePropertyDescriptors(3215) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4060) = FormalQtyType.IntType // COMMENT.ORDER
    nodePropertyDescriptors(4061) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1336) = FormalQtyType.StringType // CONFIG_FILE.CONTENT
    nodePropertyDescriptors(1337) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3686) = FormalQtyType.StringType // CONFIG_FILE.NAME
    nodePropertyDescriptors(3687) = FormalQtyType.QtyOne
    nodePropertyDescriptors(116) = FormalQtyType.IntType // CONTROL_STRUCTURE.ARGUMENT_INDEX
    nodePropertyDescriptors(117) = FormalQtyType.QtyOne
    nodePropertyDescriptors(210) = FormalQtyType.StringType // CONTROL_STRUCTURE.ARGUMENT_NAME
    nodePropertyDescriptors(211) = FormalQtyType.QtyOption
    nodePropertyDescriptors(962) = FormalQtyType.StringType // CONTROL_STRUCTURE.CODE
    nodePropertyDescriptors(963) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1056) = FormalQtyType.IntType // CONTROL_STRUCTURE.COLUMN_NUMBER
    nodePropertyDescriptors(1057) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1432) = FormalQtyType.StringType // CONTROL_STRUCTURE.CONTROL_STRUCTURE_TYPE
    nodePropertyDescriptors(1433) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3218) = FormalQtyType.IntType // CONTROL_STRUCTURE.LINE_NUMBER
    nodePropertyDescriptors(3219) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4064) = FormalQtyType.IntType // CONTROL_STRUCTURE.ORDER
    nodePropertyDescriptors(4065) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4346) = FormalQtyType.StringType // CONTROL_STRUCTURE.PARSER_TYPE_NAME
    nodePropertyDescriptors(4347) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1528) = FormalQtyType.StringType // DEPENDENCY.DEPENDENCY_GROUP_ID
    nodePropertyDescriptors(1529) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3690) = FormalQtyType.StringType // DEPENDENCY.NAME
    nodePropertyDescriptors(3691) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5100) = FormalQtyType.StringType // DEPENDENCY.VERSION
    nodePropertyDescriptors(5101) = FormalQtyType.QtyOne
    nodePropertyDescriptors(120) = FormalQtyType.IntType // FIELD_IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(121) = FormalQtyType.QtyOne
    nodePropertyDescriptors(214) = FormalQtyType.StringType // FIELD_IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(215) = FormalQtyType.QtyOption
    nodePropertyDescriptors(496) = FormalQtyType.StringType // FIELD_IDENTIFIER.CANONICAL_NAME
    nodePropertyDescriptors(497) = FormalQtyType.QtyOne
    nodePropertyDescriptors(966) = FormalQtyType.StringType // FIELD_IDENTIFIER.CODE
    nodePropertyDescriptors(967) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1060) = FormalQtyType.IntType // FIELD_IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1061) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3222) = FormalQtyType.IntType // FIELD_IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(3223) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4068) = FormalQtyType.IntType // FIELD_IDENTIFIER.ORDER
    nodePropertyDescriptors(4069) = FormalQtyType.QtyOne
    nodePropertyDescriptors(968) = FormalQtyType.StringType // FILE.CODE
    nodePropertyDescriptors(969) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1062) = FormalQtyType.IntType // FILE.COLUMN_NUMBER
    nodePropertyDescriptors(1063) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1344) = FormalQtyType.StringType // FILE.CONTENT
    nodePropertyDescriptors(1345) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2190) = FormalQtyType.StringType // FILE.HASH
    nodePropertyDescriptors(2191) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3224) = FormalQtyType.IntType // FILE.LINE_NUMBER
    nodePropertyDescriptors(3225) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3694) = FormalQtyType.StringType // FILE.NAME
    nodePropertyDescriptors(3695) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4070) = FormalQtyType.IntType // FILE.ORDER
    nodePropertyDescriptors(4071) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5200) = FormalQtyType.RefType // FINDING.evidence
    nodePropertyDescriptors(5201) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(5294) = FormalQtyType.RefType // FINDING.keyValuePairs
    nodePropertyDescriptors(5295) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(126) = FormalQtyType.IntType // IDENTIFIER.ARGUMENT_INDEX
    nodePropertyDescriptors(127) = FormalQtyType.QtyOne
    nodePropertyDescriptors(220) = FormalQtyType.StringType // IDENTIFIER.ARGUMENT_NAME
    nodePropertyDescriptors(221) = FormalQtyType.QtyOption
    nodePropertyDescriptors(972) = FormalQtyType.StringType // IDENTIFIER.CODE
    nodePropertyDescriptors(973) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1066) = FormalQtyType.IntType // IDENTIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1067) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1724) = FormalQtyType.StringType // IDENTIFIER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1725) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3228) = FormalQtyType.IntType // IDENTIFIER.LINE_NUMBER
    nodePropertyDescriptors(3229) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3698) = FormalQtyType.StringType // IDENTIFIER.NAME
    nodePropertyDescriptors(3699) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4074) = FormalQtyType.IntType // IDENTIFIER.ORDER
    nodePropertyDescriptors(4075) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4450) = FormalQtyType.StringType // IDENTIFIER.POSSIBLE_TYPES
    nodePropertyDescriptors(4451) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4920) = FormalQtyType.StringType // IDENTIFIER.TYPE_FULL_NAME
    nodePropertyDescriptors(4921) = FormalQtyType.QtyOne
    nodePropertyDescriptors(974) = FormalQtyType.StringType // IMPORT.CODE
    nodePropertyDescriptors(975) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1068) = FormalQtyType.IntType // IMPORT.COLUMN_NUMBER
    nodePropertyDescriptors(1069) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1914) = FormalQtyType.BoolType // IMPORT.EXPLICIT_AS
    nodePropertyDescriptors(1915) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2290) = FormalQtyType.StringType // IMPORT.IMPORTED_AS
    nodePropertyDescriptors(2291) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2384) = FormalQtyType.StringType // IMPORT.IMPORTED_ENTITY
    nodePropertyDescriptors(2385) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2666) = FormalQtyType.BoolType // IMPORT.IS_EXPLICIT
    nodePropertyDescriptors(2667) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2948) = FormalQtyType.BoolType // IMPORT.IS_WILDCARD
    nodePropertyDescriptors(2949) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3230) = FormalQtyType.IntType // IMPORT.LINE_NUMBER
    nodePropertyDescriptors(3231) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4076) = FormalQtyType.IntType // IMPORT.ORDER
    nodePropertyDescriptors(4077) = FormalQtyType.QtyOne
    nodePropertyDescriptors(976) = FormalQtyType.StringType // JUMP_LABEL.CODE
    nodePropertyDescriptors(977) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1070) = FormalQtyType.IntType // JUMP_LABEL.COLUMN_NUMBER
    nodePropertyDescriptors(1071) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3232) = FormalQtyType.IntType // JUMP_LABEL.LINE_NUMBER
    nodePropertyDescriptors(3233) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3702) = FormalQtyType.StringType // JUMP_LABEL.NAME
    nodePropertyDescriptors(3703) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4078) = FormalQtyType.IntType // JUMP_LABEL.ORDER
    nodePropertyDescriptors(4079) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4360) = FormalQtyType.StringType // JUMP_LABEL.PARSER_TYPE_NAME
    nodePropertyDescriptors(4361) = FormalQtyType.QtyOne
    nodePropertyDescriptors(132) = FormalQtyType.IntType // JUMP_TARGET.ARGUMENT_INDEX
    nodePropertyDescriptors(133) = FormalQtyType.QtyOne
    nodePropertyDescriptors(978) = FormalQtyType.StringType // JUMP_TARGET.CODE
    nodePropertyDescriptors(979) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1072) = FormalQtyType.IntType // JUMP_TARGET.COLUMN_NUMBER
    nodePropertyDescriptors(1073) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3234) = FormalQtyType.IntType // JUMP_TARGET.LINE_NUMBER
    nodePropertyDescriptors(3235) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3704) = FormalQtyType.StringType // JUMP_TARGET.NAME
    nodePropertyDescriptors(3705) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4080) = FormalQtyType.IntType // JUMP_TARGET.ORDER
    nodePropertyDescriptors(4081) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4362) = FormalQtyType.StringType // JUMP_TARGET.PARSER_TYPE_NAME
    nodePropertyDescriptors(4363) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3048) = FormalQtyType.StringType // KEY_VALUE_PAIR.KEY
    nodePropertyDescriptors(3049) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5022) = FormalQtyType.StringType // KEY_VALUE_PAIR.VALUE
    nodePropertyDescriptors(5023) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2110) = FormalQtyType.StringType // LIFETIME.FULL_NAME
    nodePropertyDescriptors(2111) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3708) = FormalQtyType.StringType // LIFETIME.NAME
    nodePropertyDescriptors(3709) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4836) = FormalQtyType.StringType // LIFETIME.TYPE_DECL_FULL_NAME
    nodePropertyDescriptors(4837) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3712) = FormalQtyType.StringType // LIFETIME_PARAMETER.NAME
    nodePropertyDescriptors(3713) = FormalQtyType.QtyOne
    nodePropertyDescriptors(142) = FormalQtyType.IntType // LITERAL.ARGUMENT_INDEX
    nodePropertyDescriptors(143) = FormalQtyType.QtyOne
    nodePropertyDescriptors(236) = FormalQtyType.StringType // LITERAL.ARGUMENT_NAME
    nodePropertyDescriptors(237) = FormalQtyType.QtyOption
    nodePropertyDescriptors(988) = FormalQtyType.StringType // LITERAL.CODE
    nodePropertyDescriptors(989) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1082) = FormalQtyType.IntType // LITERAL.COLUMN_NUMBER
    nodePropertyDescriptors(1083) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1740) = FormalQtyType.StringType // LITERAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1741) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3244) = FormalQtyType.IntType // LITERAL.LINE_NUMBER
    nodePropertyDescriptors(3245) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4090) = FormalQtyType.IntType // LITERAL.ORDER
    nodePropertyDescriptors(4091) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4466) = FormalQtyType.StringType // LITERAL.POSSIBLE_TYPES
    nodePropertyDescriptors(4467) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4936) = FormalQtyType.StringType // LITERAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4937) = FormalQtyType.QtyOne
    nodePropertyDescriptors(802) = FormalQtyType.StringType // LOCAL.CLOSURE_BINDING_ID
    nodePropertyDescriptors(803) = FormalQtyType.QtyOption
    nodePropertyDescriptors(990) = FormalQtyType.StringType // LOCAL.CODE
    nodePropertyDescriptors(991) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1084) = FormalQtyType.IntType // LOCAL.COLUMN_NUMBER
    nodePropertyDescriptors(1085) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1742) = FormalQtyType.StringType // LOCAL.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1743) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3246) = FormalQtyType.IntType // LOCAL.LINE_NUMBER
    nodePropertyDescriptors(3247) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3716) = FormalQtyType.StringType // LOCAL.NAME
    nodePropertyDescriptors(3717) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4092) = FormalQtyType.IntType // LOCAL.ORDER
    nodePropertyDescriptors(4093) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4468) = FormalQtyType.StringType // LOCAL.POSSIBLE_TYPES
    nodePropertyDescriptors(4469) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4938) = FormalQtyType.StringType // LOCAL.TYPE_FULL_NAME
    nodePropertyDescriptors(4939) = FormalQtyType.QtyOne
    nodePropertyDescriptors(616) = FormalQtyType.StringType // LOCATION.CLASS_NAME
    nodePropertyDescriptors(617) = FormalQtyType.QtyOne
    nodePropertyDescriptors(710) = FormalQtyType.StringType // LOCATION.CLASS_SHORT_NAME
    nodePropertyDescriptors(711) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2026) = FormalQtyType.StringType // LOCATION.FILENAME
    nodePropertyDescriptors(2027) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3248) = FormalQtyType.IntType // LOCATION.LINE_NUMBER
    nodePropertyDescriptors(3249) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3436) = FormalQtyType.StringType // LOCATION.METHOD_FULL_NAME
    nodePropertyDescriptors(3437) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3530) = FormalQtyType.StringType // LOCATION.METHOD_SHORT_NAME
    nodePropertyDescriptors(3531) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3812) = FormalQtyType.StringType // LOCATION.NODE_LABEL
    nodePropertyDescriptors(3813) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4282) = FormalQtyType.StringType // LOCATION.PACKAGE_NAME
    nodePropertyDescriptors(4283) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4752) = FormalQtyType.StringType // LOCATION.SYMBOL
    nodePropertyDescriptors(4753) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5410) = FormalQtyType.RefType // LOCATION.node
    nodePropertyDescriptors(5411) = FormalQtyType.QtyOption
    nodePropertyDescriptors(336) = FormalQtyType.StringType // MEMBER.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(337) = FormalQtyType.QtyOne
    nodePropertyDescriptors(430) = FormalQtyType.StringType // MEMBER.AST_PARENT_TYPE
    nodePropertyDescriptors(431) = FormalQtyType.QtyOne
    nodePropertyDescriptors(994) = FormalQtyType.StringType // MEMBER.CODE
    nodePropertyDescriptors(995) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1088) = FormalQtyType.IntType // MEMBER.COLUMN_NUMBER
    nodePropertyDescriptors(1089) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1746) = FormalQtyType.StringType // MEMBER.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1747) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3250) = FormalQtyType.IntType // MEMBER.LINE_NUMBER
    nodePropertyDescriptors(3251) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3720) = FormalQtyType.StringType // MEMBER.NAME
    nodePropertyDescriptors(3721) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4096) = FormalQtyType.IntType // MEMBER.ORDER
    nodePropertyDescriptors(4097) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4472) = FormalQtyType.StringType // MEMBER.POSSIBLE_TYPES
    nodePropertyDescriptors(4473) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4942) = FormalQtyType.StringType // MEMBER.TYPE_FULL_NAME
    nodePropertyDescriptors(4943) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2218) = FormalQtyType.StringType // META_DATA.HASH
    nodePropertyDescriptors(2219) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3158) = FormalQtyType.StringType // META_DATA.LANGUAGE
    nodePropertyDescriptors(3159) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4192) = FormalQtyType.StringType // META_DATA.OVERLAYS
    nodePropertyDescriptors(4193) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4568) = FormalQtyType.StringType // META_DATA.ROOT
    nodePropertyDescriptors(4569) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5132) = FormalQtyType.StringType // META_DATA.VERSION
    nodePropertyDescriptors(5133) = FormalQtyType.QtyOne
    nodePropertyDescriptors(340) = FormalQtyType.StringType // METHOD.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(341) = FormalQtyType.QtyOne
    nodePropertyDescriptors(434) = FormalQtyType.StringType // METHOD.AST_PARENT_TYPE
    nodePropertyDescriptors(435) = FormalQtyType.QtyOne
    nodePropertyDescriptors(998) = FormalQtyType.StringType // METHOD.CODE
    nodePropertyDescriptors(999) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1092) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER
    nodePropertyDescriptors(1093) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1186) = FormalQtyType.IntType // METHOD.COLUMN_NUMBER_END
    nodePropertyDescriptors(1187) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2032) = FormalQtyType.StringType // METHOD.FILENAME
    nodePropertyDescriptors(2033) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2126) = FormalQtyType.StringType // METHOD.FULL_NAME
    nodePropertyDescriptors(2127) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2220) = FormalQtyType.StringType // METHOD.HASH
    nodePropertyDescriptors(2221) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2784) = FormalQtyType.BoolType // METHOD.IS_EXTERNAL
    nodePropertyDescriptors(2785) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3254) = FormalQtyType.IntType // METHOD.LINE_NUMBER
    nodePropertyDescriptors(3255) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3348) = FormalQtyType.IntType // METHOD.LINE_NUMBER_END
    nodePropertyDescriptors(3349) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3724) = FormalQtyType.StringType // METHOD.NAME
    nodePropertyDescriptors(3725) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3912) = FormalQtyType.IntType // METHOD.OFFSET
    nodePropertyDescriptors(3913) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4006) = FormalQtyType.IntType // METHOD.OFFSET_END
    nodePropertyDescriptors(4007) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4100) = FormalQtyType.IntType // METHOD.ORDER
    nodePropertyDescriptors(4101) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4664) = FormalQtyType.StringType // METHOD.SIGNATURE
    nodePropertyDescriptors(4665) = FormalQtyType.QtyOne
    nodePropertyDescriptors(812) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CLOSURE_BINDING_ID
    nodePropertyDescriptors(813) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1000) = FormalQtyType.StringType // METHOD_PARAMETER_IN.CODE
    nodePropertyDescriptors(1001) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1094) = FormalQtyType.IntType // METHOD_PARAMETER_IN.COLUMN_NUMBER
    nodePropertyDescriptors(1095) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1752) = FormalQtyType.StringType // METHOD_PARAMETER_IN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1753) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1846) = FormalQtyType.StringType // METHOD_PARAMETER_IN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1847) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2504) = FormalQtyType.IntType // METHOD_PARAMETER_IN.INDEX
    nodePropertyDescriptors(2505) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2880) = FormalQtyType.BoolType // METHOD_PARAMETER_IN.IS_VARIADIC
    nodePropertyDescriptors(2881) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3256) = FormalQtyType.IntType // METHOD_PARAMETER_IN.LINE_NUMBER
    nodePropertyDescriptors(3257) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3726) = FormalQtyType.StringType // METHOD_PARAMETER_IN.NAME
    nodePropertyDescriptors(3727) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4102) = FormalQtyType.IntType // METHOD_PARAMETER_IN.ORDER
    nodePropertyDescriptors(4103) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4478) = FormalQtyType.StringType // METHOD_PARAMETER_IN.POSSIBLE_TYPES
    nodePropertyDescriptors(4479) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4948) = FormalQtyType.StringType // METHOD_PARAMETER_IN.TYPE_FULL_NAME
    nodePropertyDescriptors(4949) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1002) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.CODE
    nodePropertyDescriptors(1003) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1096) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.COLUMN_NUMBER
    nodePropertyDescriptors(1097) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1848) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.EVALUATION_STRATEGY
    nodePropertyDescriptors(1849) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2506) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.INDEX
    nodePropertyDescriptors(2507) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2882) = FormalQtyType.BoolType // METHOD_PARAMETER_OUT.IS_VARIADIC
    nodePropertyDescriptors(2883) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3258) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.LINE_NUMBER
    nodePropertyDescriptors(3259) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3728) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.NAME
    nodePropertyDescriptors(3729) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4104) = FormalQtyType.IntType // METHOD_PARAMETER_OUT.ORDER
    nodePropertyDescriptors(4105) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4950) = FormalQtyType.StringType // METHOD_PARAMETER_OUT.TYPE_FULL_NAME
    nodePropertyDescriptors(4951) = FormalQtyType.QtyOne
    nodePropertyDescriptors(158) = FormalQtyType.IntType // METHOD_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(159) = FormalQtyType.QtyOne
    nodePropertyDescriptors(252) = FormalQtyType.StringType // METHOD_REF.ARGUMENT_NAME
    nodePropertyDescriptors(253) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1004) = FormalQtyType.StringType // METHOD_REF.CODE
    nodePropertyDescriptors(1005) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1098) = FormalQtyType.IntType // METHOD_REF.COLUMN_NUMBER
    nodePropertyDescriptors(1099) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1756) = FormalQtyType.StringType // METHOD_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1757) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3260) = FormalQtyType.IntType // METHOD_REF.LINE_NUMBER
    nodePropertyDescriptors(3261) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3448) = FormalQtyType.StringType // METHOD_REF.METHOD_FULL_NAME
    nodePropertyDescriptors(3449) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4106) = FormalQtyType.IntType // METHOD_REF.ORDER
    nodePropertyDescriptors(4107) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4482) = FormalQtyType.StringType // METHOD_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(4483) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4952) = FormalQtyType.StringType // METHOD_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4953) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1006) = FormalQtyType.StringType // METHOD_RETURN.CODE
    nodePropertyDescriptors(1007) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1100) = FormalQtyType.IntType // METHOD_RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(1101) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1758) = FormalQtyType.StringType // METHOD_RETURN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1759) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(1852) = FormalQtyType.StringType // METHOD_RETURN.EVALUATION_STRATEGY
    nodePropertyDescriptors(1853) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3262) = FormalQtyType.IntType // METHOD_RETURN.LINE_NUMBER
    nodePropertyDescriptors(3263) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4108) = FormalQtyType.IntType // METHOD_RETURN.ORDER
    nodePropertyDescriptors(4109) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4484) = FormalQtyType.StringType // METHOD_RETURN.POSSIBLE_TYPES
    nodePropertyDescriptors(4485) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4954) = FormalQtyType.StringType // METHOD_RETURN.TYPE_FULL_NAME
    nodePropertyDescriptors(4955) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1008) = FormalQtyType.StringType // MODIFIER.CODE
    nodePropertyDescriptors(1009) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1102) = FormalQtyType.IntType // MODIFIER.COLUMN_NUMBER
    nodePropertyDescriptors(1103) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3264) = FormalQtyType.IntType // MODIFIER.LINE_NUMBER
    nodePropertyDescriptors(3265) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3640) = FormalQtyType.StringType // MODIFIER.MODIFIER_TYPE
    nodePropertyDescriptors(3641) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4110) = FormalQtyType.IntType // MODIFIER.ORDER
    nodePropertyDescriptors(4111) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1010) = FormalQtyType.StringType // NAMESPACE.CODE
    nodePropertyDescriptors(1011) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1104) = FormalQtyType.IntType // NAMESPACE.COLUMN_NUMBER
    nodePropertyDescriptors(1105) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3266) = FormalQtyType.IntType // NAMESPACE.LINE_NUMBER
    nodePropertyDescriptors(3267) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3736) = FormalQtyType.StringType // NAMESPACE.NAME
    nodePropertyDescriptors(3737) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4112) = FormalQtyType.IntType // NAMESPACE.ORDER
    nodePropertyDescriptors(4113) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1012) = FormalQtyType.StringType // NAMESPACE_BLOCK.CODE
    nodePropertyDescriptors(1013) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1106) = FormalQtyType.IntType // NAMESPACE_BLOCK.COLUMN_NUMBER
    nodePropertyDescriptors(1107) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2046) = FormalQtyType.StringType // NAMESPACE_BLOCK.FILENAME
    nodePropertyDescriptors(2047) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2140) = FormalQtyType.StringType // NAMESPACE_BLOCK.FULL_NAME
    nodePropertyDescriptors(2141) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3268) = FormalQtyType.IntType // NAMESPACE_BLOCK.LINE_NUMBER
    nodePropertyDescriptors(3269) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3738) = FormalQtyType.StringType // NAMESPACE_BLOCK.NAME
    nodePropertyDescriptors(3739) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4114) = FormalQtyType.IntType // NAMESPACE_BLOCK.ORDER
    nodePropertyDescriptors(4115) = FormalQtyType.QtyOne
    nodePropertyDescriptors(168) = FormalQtyType.IntType // RETURN.ARGUMENT_INDEX
    nodePropertyDescriptors(169) = FormalQtyType.QtyOne
    nodePropertyDescriptors(262) = FormalQtyType.StringType // RETURN.ARGUMENT_NAME
    nodePropertyDescriptors(263) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1014) = FormalQtyType.StringType // RETURN.CODE
    nodePropertyDescriptors(1015) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1108) = FormalQtyType.IntType // RETURN.COLUMN_NUMBER
    nodePropertyDescriptors(1109) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3270) = FormalQtyType.IntType // RETURN.LINE_NUMBER
    nodePropertyDescriptors(3271) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4116) = FormalQtyType.IntType // RETURN.ORDER
    nodePropertyDescriptors(4117) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3742) = FormalQtyType.StringType // TAG.NAME
    nodePropertyDescriptors(3743) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5058) = FormalQtyType.StringType // TAG.VALUE
    nodePropertyDescriptors(5059) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5436) = FormalQtyType.RefType // TAG_NODE_PAIR.node
    nodePropertyDescriptors(5437) = FormalQtyType.QtyOne
    nodePropertyDescriptors(5530) = FormalQtyType.RefType // TAG_NODE_PAIR.tag
    nodePropertyDescriptors(5531) = FormalQtyType.QtyOne
    nodePropertyDescriptors(174) = FormalQtyType.IntType // TEMPLATE_DOM.ARGUMENT_INDEX
    nodePropertyDescriptors(175) = FormalQtyType.QtyOne
    nodePropertyDescriptors(268) = FormalQtyType.StringType // TEMPLATE_DOM.ARGUMENT_NAME
    nodePropertyDescriptors(269) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1020) = FormalQtyType.StringType // TEMPLATE_DOM.CODE
    nodePropertyDescriptors(1021) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1114) = FormalQtyType.IntType // TEMPLATE_DOM.COLUMN_NUMBER
    nodePropertyDescriptors(1115) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3276) = FormalQtyType.IntType // TEMPLATE_DOM.LINE_NUMBER
    nodePropertyDescriptors(3277) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3746) = FormalQtyType.StringType // TEMPLATE_DOM.NAME
    nodePropertyDescriptors(3747) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4122) = FormalQtyType.IntType // TEMPLATE_DOM.ORDER
    nodePropertyDescriptors(4123) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2150) = FormalQtyType.StringType // TYPE.FULL_NAME
    nodePropertyDescriptors(2151) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3748) = FormalQtyType.StringType // TYPE.NAME
    nodePropertyDescriptors(3749) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4876) = FormalQtyType.StringType // TYPE.TYPE_DECL_FULL_NAME
    nodePropertyDescriptors(4877) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1024) = FormalQtyType.StringType // TYPE_ARGUMENT.CODE
    nodePropertyDescriptors(1025) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1118) = FormalQtyType.IntType // TYPE_ARGUMENT.COLUMN_NUMBER
    nodePropertyDescriptors(1119) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3280) = FormalQtyType.IntType // TYPE_ARGUMENT.LINE_NUMBER
    nodePropertyDescriptors(3281) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4126) = FormalQtyType.IntType // TYPE_ARGUMENT.ORDER
    nodePropertyDescriptors(4127) = FormalQtyType.QtyOne
    nodePropertyDescriptors(86) = FormalQtyType.StringType // TYPE_DECL.ALIAS_TYPE_FULL_NAME
    nodePropertyDescriptors(87) = FormalQtyType.QtyOption
    nodePropertyDescriptors(368) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_FULL_NAME
    nodePropertyDescriptors(369) = FormalQtyType.QtyOne
    nodePropertyDescriptors(462) = FormalQtyType.StringType // TYPE_DECL.AST_PARENT_TYPE
    nodePropertyDescriptors(463) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1026) = FormalQtyType.StringType // TYPE_DECL.CODE
    nodePropertyDescriptors(1027) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1120) = FormalQtyType.IntType // TYPE_DECL.COLUMN_NUMBER
    nodePropertyDescriptors(1121) = FormalQtyType.QtyOption
    nodePropertyDescriptors(2060) = FormalQtyType.StringType // TYPE_DECL.FILENAME
    nodePropertyDescriptors(2061) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2154) = FormalQtyType.StringType // TYPE_DECL.FULL_NAME
    nodePropertyDescriptors(2155) = FormalQtyType.QtyOne
    nodePropertyDescriptors(2624) = FormalQtyType.StringType // TYPE_DECL.INHERITS_FROM_TYPE_FULL_NAME
    nodePropertyDescriptors(2625) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(2812) = FormalQtyType.BoolType // TYPE_DECL.IS_EXTERNAL
    nodePropertyDescriptors(2813) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3282) = FormalQtyType.IntType // TYPE_DECL.LINE_NUMBER
    nodePropertyDescriptors(3283) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3752) = FormalQtyType.StringType // TYPE_DECL.NAME
    nodePropertyDescriptors(3753) = FormalQtyType.QtyOne
    nodePropertyDescriptors(3940) = FormalQtyType.IntType // TYPE_DECL.OFFSET
    nodePropertyDescriptors(3941) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4034) = FormalQtyType.IntType // TYPE_DECL.OFFSET_END
    nodePropertyDescriptors(4035) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4128) = FormalQtyType.IntType // TYPE_DECL.ORDER
    nodePropertyDescriptors(4129) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1028) = FormalQtyType.StringType // TYPE_PARAMETER.CODE
    nodePropertyDescriptors(1029) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1122) = FormalQtyType.IntType // TYPE_PARAMETER.COLUMN_NUMBER
    nodePropertyDescriptors(1123) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3284) = FormalQtyType.IntType // TYPE_PARAMETER.LINE_NUMBER
    nodePropertyDescriptors(3285) = FormalQtyType.QtyOption
    nodePropertyDescriptors(3754) = FormalQtyType.StringType // TYPE_PARAMETER.NAME
    nodePropertyDescriptors(3755) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4130) = FormalQtyType.IntType // TYPE_PARAMETER.ORDER
    nodePropertyDescriptors(4131) = FormalQtyType.QtyOne
    nodePropertyDescriptors(184) = FormalQtyType.IntType // TYPE_REF.ARGUMENT_INDEX
    nodePropertyDescriptors(185) = FormalQtyType.QtyOne
    nodePropertyDescriptors(278) = FormalQtyType.StringType // TYPE_REF.ARGUMENT_NAME
    nodePropertyDescriptors(279) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1030) = FormalQtyType.StringType // TYPE_REF.CODE
    nodePropertyDescriptors(1031) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1124) = FormalQtyType.IntType // TYPE_REF.COLUMN_NUMBER
    nodePropertyDescriptors(1125) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1782) = FormalQtyType.StringType // TYPE_REF.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1783) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3286) = FormalQtyType.IntType // TYPE_REF.LINE_NUMBER
    nodePropertyDescriptors(3287) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4132) = FormalQtyType.IntType // TYPE_REF.ORDER
    nodePropertyDescriptors(4133) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4508) = FormalQtyType.StringType // TYPE_REF.POSSIBLE_TYPES
    nodePropertyDescriptors(4509) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4978) = FormalQtyType.StringType // TYPE_REF.TYPE_FULL_NAME
    nodePropertyDescriptors(4979) = FormalQtyType.QtyOne
    nodePropertyDescriptors(186) = FormalQtyType.IntType // UNKNOWN.ARGUMENT_INDEX
    nodePropertyDescriptors(187) = FormalQtyType.QtyOne
    nodePropertyDescriptors(280) = FormalQtyType.StringType // UNKNOWN.ARGUMENT_NAME
    nodePropertyDescriptors(281) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1032) = FormalQtyType.StringType // UNKNOWN.CODE
    nodePropertyDescriptors(1033) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1126) = FormalQtyType.IntType // UNKNOWN.COLUMN_NUMBER
    nodePropertyDescriptors(1127) = FormalQtyType.QtyOption
    nodePropertyDescriptors(1314) = FormalQtyType.StringType // UNKNOWN.CONTAINED_REF
    nodePropertyDescriptors(1315) = FormalQtyType.QtyOne
    nodePropertyDescriptors(1784) = FormalQtyType.StringType // UNKNOWN.DYNAMIC_TYPE_HINT_FULL_NAME
    nodePropertyDescriptors(1785) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(3288) = FormalQtyType.IntType // UNKNOWN.LINE_NUMBER
    nodePropertyDescriptors(3289) = FormalQtyType.QtyOption
    nodePropertyDescriptors(4134) = FormalQtyType.IntType // UNKNOWN.ORDER
    nodePropertyDescriptors(4135) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4416) = FormalQtyType.StringType // UNKNOWN.PARSER_TYPE_NAME
    nodePropertyDescriptors(4417) = FormalQtyType.QtyOne
    nodePropertyDescriptors(4510) = FormalQtyType.StringType // UNKNOWN.POSSIBLE_TYPES
    nodePropertyDescriptors(4511) = FormalQtyType.QtyMulti
    nodePropertyDescriptors(4980) = FormalQtyType.StringType // UNKNOWN.TYPE_FULL_NAME
    nodePropertyDescriptors(4981) = FormalQtyType.QtyOne
    nodePropertyDescriptors
  }
  private val newNodeInsertionHelpers: Array[flatgraph.NewNodePropertyInsertionHelper] = {
    val _newNodeInserters = new Array[flatgraph.NewNodePropertyInsertionHelper](5546)
    _newNodeInserters(94) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_argumentIndex
    _newNodeInserters(188) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_argumentName
    _newNodeInserters(940) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_code
    _newNodeInserters(1034) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_columnNumber
    _newNodeInserters(2068) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_fullName
    _newNodeInserters(3196) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_lineNumber
    _newNodeInserters(3666) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_name
    _newNodeInserters(4042) = nodes.NewAnnotation.InsertionHelpers.NewNodeInserter_Annotation_order
    _newNodeInserters(96) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_argumentIndex
    _newNodeInserters(190) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_argumentName
    _newNodeInserters(942) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_code
    _newNodeInserters(1036) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_columnNumber
    _newNodeInserters(3198) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_lineNumber
    _newNodeInserters(3668) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_name
    _newNodeInserters(4044) = nodes.NewAnnotationLiteral.InsertionHelpers.NewNodeInserter_AnnotationLiteral_order
    _newNodeInserters(944) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_code
    _newNodeInserters(1038) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_columnNumber
    _newNodeInserters(3200) =
      nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_lineNumber
    _newNodeInserters(4046) = nodes.NewAnnotationParameter.InsertionHelpers.NewNodeInserter_AnnotationParameter_order
    _newNodeInserters(946) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_code
    _newNodeInserters(1040) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_columnNumber
    _newNodeInserters(3202) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_lineNumber
    _newNodeInserters(4048) =
      nodes.NewAnnotationParameterAssign.InsertionHelpers.NewNodeInserter_AnnotationParameterAssign_order
    _newNodeInserters(102) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_argumentIndex
    _newNodeInserters(196) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_argumentName
    _newNodeInserters(948) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_code
    _newNodeInserters(1042) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_columnNumber
    _newNodeInserters(3204) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_lineNumber
    _newNodeInserters(4050) = nodes.NewArrayInitializer.InsertionHelpers.NewNodeInserter_ArrayInitializer_order
    _newNodeInserters(3394) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_methodFullName
    _newNodeInserters(3676) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_name
    _newNodeInserters(4616) = nodes.NewBinding.InsertionHelpers.NewNodeInserter_Binding_signature
    _newNodeInserters(106) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_argumentIndex
    _newNodeInserters(200) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_argumentName
    _newNodeInserters(952) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_code
    _newNodeInserters(1046) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_columnNumber
    _newNodeInserters(1704) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_dynamicTypeHintFullName
    _newNodeInserters(3208) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_lineNumber
    _newNodeInserters(4054) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_order
    _newNodeInserters(4430) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_possibleTypes
    _newNodeInserters(4900) = nodes.NewBlock.InsertionHelpers.NewNodeInserter_Block_typeFullName
    _newNodeInserters(108) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_argumentIndex
    _newNodeInserters(202) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_argumentName
    _newNodeInserters(954) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_code
    _newNodeInserters(1048) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_columnNumber
    _newNodeInserters(1612) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_dispatchType
    _newNodeInserters(1706) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_dynamicTypeHintFullName
    _newNodeInserters(3210) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_lineNumber
    _newNodeInserters(3398) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_methodFullName
    _newNodeInserters(3680) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_name
    _newNodeInserters(4056) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_order
    _newNodeInserters(4432) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_possibleTypes
    _newNodeInserters(4620) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_signature
    _newNodeInserters(4902) = nodes.NewCall.InsertionHelpers.NewNodeInserter_Call_typeFullName
    _newNodeInserters(768) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_closureBindingId
    _newNodeInserters(862) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_closureOriginalName
    _newNodeInserters(1802) = nodes.NewClosureBinding.InsertionHelpers.NewNodeInserter_ClosureBinding_evaluationStrategy
    _newNodeInserters(958) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_code
    _newNodeInserters(1052) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_columnNumber
    _newNodeInserters(1992) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_filename
    _newNodeInserters(3214) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_lineNumber
    _newNodeInserters(4060) = nodes.NewComment.InsertionHelpers.NewNodeInserter_Comment_order
    _newNodeInserters(1336) = nodes.NewConfigFile.InsertionHelpers.NewNodeInserter_ConfigFile_content
    _newNodeInserters(3686) = nodes.NewConfigFile.InsertionHelpers.NewNodeInserter_ConfigFile_name
    _newNodeInserters(116) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_argumentIndex
    _newNodeInserters(210) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_argumentName
    _newNodeInserters(962) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_code
    _newNodeInserters(1056) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_columnNumber
    _newNodeInserters(1432) =
      nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_controlStructureType
    _newNodeInserters(3218) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_lineNumber
    _newNodeInserters(4064) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_order
    _newNodeInserters(4346) = nodes.NewControlStructure.InsertionHelpers.NewNodeInserter_ControlStructure_parserTypeName
    _newNodeInserters(1528) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_dependencyGroupId
    _newNodeInserters(3690) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_name
    _newNodeInserters(5100) = nodes.NewDependency.InsertionHelpers.NewNodeInserter_Dependency_version
    _newNodeInserters(120) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_argumentIndex
    _newNodeInserters(214) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_argumentName
    _newNodeInserters(496) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_canonicalName
    _newNodeInserters(966) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_code
    _newNodeInserters(1060) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_columnNumber
    _newNodeInserters(3222) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_lineNumber
    _newNodeInserters(4068) = nodes.NewFieldIdentifier.InsertionHelpers.NewNodeInserter_FieldIdentifier_order
    _newNodeInserters(968) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_code
    _newNodeInserters(1062) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_columnNumber
    _newNodeInserters(1344) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_content
    _newNodeInserters(2190) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_hash
    _newNodeInserters(3224) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_lineNumber
    _newNodeInserters(3694) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_name
    _newNodeInserters(4070) = nodes.NewFile.InsertionHelpers.NewNodeInserter_File_order
    _newNodeInserters(5200) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_evidence
    _newNodeInserters(5294) = nodes.NewFinding.InsertionHelpers.NewNodeInserter_Finding_keyValuePairs
    _newNodeInserters(126) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_argumentIndex
    _newNodeInserters(220) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_argumentName
    _newNodeInserters(972) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_code
    _newNodeInserters(1066) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_columnNumber
    _newNodeInserters(1724) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_dynamicTypeHintFullName
    _newNodeInserters(3228) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_lineNumber
    _newNodeInserters(3698) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_name
    _newNodeInserters(4074) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_order
    _newNodeInserters(4450) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_possibleTypes
    _newNodeInserters(4920) = nodes.NewIdentifier.InsertionHelpers.NewNodeInserter_Identifier_typeFullName
    _newNodeInserters(974) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_code
    _newNodeInserters(1068) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_columnNumber
    _newNodeInserters(1914) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_explicitAs
    _newNodeInserters(2290) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_importedAs
    _newNodeInserters(2384) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_importedEntity
    _newNodeInserters(2666) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_isExplicit
    _newNodeInserters(2948) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_isWildcard
    _newNodeInserters(3230) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_lineNumber
    _newNodeInserters(4076) = nodes.NewImport.InsertionHelpers.NewNodeInserter_Import_order
    _newNodeInserters(976) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_code
    _newNodeInserters(1070) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_columnNumber
    _newNodeInserters(3232) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_lineNumber
    _newNodeInserters(3702) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_name
    _newNodeInserters(4078) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_order
    _newNodeInserters(4360) = nodes.NewJumpLabel.InsertionHelpers.NewNodeInserter_JumpLabel_parserTypeName
    _newNodeInserters(132) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_argumentIndex
    _newNodeInserters(978) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_code
    _newNodeInserters(1072) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_columnNumber
    _newNodeInserters(3234) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_lineNumber
    _newNodeInserters(3704) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_name
    _newNodeInserters(4080) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_order
    _newNodeInserters(4362) = nodes.NewJumpTarget.InsertionHelpers.NewNodeInserter_JumpTarget_parserTypeName
    _newNodeInserters(3048) = nodes.NewKeyValuePair.InsertionHelpers.NewNodeInserter_KeyValuePair_key
    _newNodeInserters(5022) = nodes.NewKeyValuePair.InsertionHelpers.NewNodeInserter_KeyValuePair_value
    _newNodeInserters(2110) = nodes.NewLifetime.InsertionHelpers.NewNodeInserter_Lifetime_fullName
    _newNodeInserters(3708) = nodes.NewLifetime.InsertionHelpers.NewNodeInserter_Lifetime_name
    _newNodeInserters(4836) = nodes.NewLifetime.InsertionHelpers.NewNodeInserter_Lifetime_typeDeclFullName
    _newNodeInserters(3712) = nodes.NewLifetimeParameter.InsertionHelpers.NewNodeInserter_LifetimeParameter_name
    _newNodeInserters(142) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_argumentIndex
    _newNodeInserters(236) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_argumentName
    _newNodeInserters(988) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_code
    _newNodeInserters(1082) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_columnNumber
    _newNodeInserters(1740) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_dynamicTypeHintFullName
    _newNodeInserters(3244) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_lineNumber
    _newNodeInserters(4090) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_order
    _newNodeInserters(4466) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_possibleTypes
    _newNodeInserters(4936) = nodes.NewLiteral.InsertionHelpers.NewNodeInserter_Literal_typeFullName
    _newNodeInserters(802) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_closureBindingId
    _newNodeInserters(990) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_code
    _newNodeInserters(1084) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_columnNumber
    _newNodeInserters(1742) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_dynamicTypeHintFullName
    _newNodeInserters(3246) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_lineNumber
    _newNodeInserters(3716) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_name
    _newNodeInserters(4092) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_order
    _newNodeInserters(4468) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_possibleTypes
    _newNodeInserters(4938) = nodes.NewLocal.InsertionHelpers.NewNodeInserter_Local_typeFullName
    _newNodeInserters(616) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_className
    _newNodeInserters(710) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_classShortName
    _newNodeInserters(2026) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_filename
    _newNodeInserters(3248) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_lineNumber
    _newNodeInserters(3436) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_methodFullName
    _newNodeInserters(3530) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_methodShortName
    _newNodeInserters(3812) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_nodeLabel
    _newNodeInserters(4282) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_packageName
    _newNodeInserters(4752) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_symbol
    _newNodeInserters(5410) = nodes.NewLocation.InsertionHelpers.NewNodeInserter_Location_node
    _newNodeInserters(336) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_astParentFullName
    _newNodeInserters(430) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_astParentType
    _newNodeInserters(994) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_code
    _newNodeInserters(1088) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_columnNumber
    _newNodeInserters(1746) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_dynamicTypeHintFullName
    _newNodeInserters(3250) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_lineNumber
    _newNodeInserters(3720) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_name
    _newNodeInserters(4096) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_order
    _newNodeInserters(4472) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_possibleTypes
    _newNodeInserters(4942) = nodes.NewMember.InsertionHelpers.NewNodeInserter_Member_typeFullName
    _newNodeInserters(2218) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_hash
    _newNodeInserters(3158) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_language
    _newNodeInserters(4192) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_overlays
    _newNodeInserters(4568) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_root
    _newNodeInserters(5132) = nodes.NewMetaData.InsertionHelpers.NewNodeInserter_MetaData_version
    _newNodeInserters(340) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_astParentFullName
    _newNodeInserters(434) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_astParentType
    _newNodeInserters(998) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_code
    _newNodeInserters(1092) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_columnNumber
    _newNodeInserters(1186) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_columnNumberEnd
    _newNodeInserters(2032) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_filename
    _newNodeInserters(2126) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_fullName
    _newNodeInserters(2220) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_hash
    _newNodeInserters(2784) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_isExternal
    _newNodeInserters(3254) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_lineNumber
    _newNodeInserters(3348) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_lineNumberEnd
    _newNodeInserters(3724) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_name
    _newNodeInserters(3912) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_offset
    _newNodeInserters(4006) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_offsetEnd
    _newNodeInserters(4100) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_order
    _newNodeInserters(4664) = nodes.NewMethod.InsertionHelpers.NewNodeInserter_Method_signature
    _newNodeInserters(812) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_closureBindingId
    _newNodeInserters(1000) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_code
    _newNodeInserters(1094) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_columnNumber
    _newNodeInserters(1752) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_dynamicTypeHintFullName
    _newNodeInserters(1846) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_evaluationStrategy
    _newNodeInserters(2504) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_index
    _newNodeInserters(2880) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_isVariadic
    _newNodeInserters(3256) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_lineNumber
    _newNodeInserters(3726) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_name
    _newNodeInserters(4102) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_order
    _newNodeInserters(4478) =
      nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_possibleTypes
    _newNodeInserters(4948) = nodes.NewMethodParameterIn.InsertionHelpers.NewNodeInserter_MethodParameterIn_typeFullName
    _newNodeInserters(1002) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_code
    _newNodeInserters(1096) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_columnNumber
    _newNodeInserters(1848) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_evaluationStrategy
    _newNodeInserters(2506) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_index
    _newNodeInserters(2882) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_isVariadic
    _newNodeInserters(3258) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_lineNumber
    _newNodeInserters(3728) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_name
    _newNodeInserters(4104) = nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_order
    _newNodeInserters(4950) =
      nodes.NewMethodParameterOut.InsertionHelpers.NewNodeInserter_MethodParameterOut_typeFullName
    _newNodeInserters(158) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_argumentIndex
    _newNodeInserters(252) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_argumentName
    _newNodeInserters(1004) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_code
    _newNodeInserters(1098) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_columnNumber
    _newNodeInserters(1756) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_dynamicTypeHintFullName
    _newNodeInserters(3260) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_lineNumber
    _newNodeInserters(3448) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_methodFullName
    _newNodeInserters(4106) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_order
    _newNodeInserters(4482) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_possibleTypes
    _newNodeInserters(4952) = nodes.NewMethodRef.InsertionHelpers.NewNodeInserter_MethodRef_typeFullName
    _newNodeInserters(1006) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_code
    _newNodeInserters(1100) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_columnNumber
    _newNodeInserters(1758) =
      nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_dynamicTypeHintFullName
    _newNodeInserters(1852) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_evaluationStrategy
    _newNodeInserters(3262) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_lineNumber
    _newNodeInserters(4108) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_order
    _newNodeInserters(4484) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_possibleTypes
    _newNodeInserters(4954) = nodes.NewMethodReturn.InsertionHelpers.NewNodeInserter_MethodReturn_typeFullName
    _newNodeInserters(1008) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_code
    _newNodeInserters(1102) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_columnNumber
    _newNodeInserters(3264) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_lineNumber
    _newNodeInserters(3640) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_modifierType
    _newNodeInserters(4110) = nodes.NewModifier.InsertionHelpers.NewNodeInserter_Modifier_order
    _newNodeInserters(1010) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_code
    _newNodeInserters(1104) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_columnNumber
    _newNodeInserters(3266) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_lineNumber
    _newNodeInserters(3736) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_name
    _newNodeInserters(4112) = nodes.NewNamespace.InsertionHelpers.NewNodeInserter_Namespace_order
    _newNodeInserters(1012) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_code
    _newNodeInserters(1106) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_columnNumber
    _newNodeInserters(2046) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_filename
    _newNodeInserters(2140) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_fullName
    _newNodeInserters(3268) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_lineNumber
    _newNodeInserters(3738) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_name
    _newNodeInserters(4114) = nodes.NewNamespaceBlock.InsertionHelpers.NewNodeInserter_NamespaceBlock_order
    _newNodeInserters(168) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_argumentIndex
    _newNodeInserters(262) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_argumentName
    _newNodeInserters(1014) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_code
    _newNodeInserters(1108) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_columnNumber
    _newNodeInserters(3270) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_lineNumber
    _newNodeInserters(4116) = nodes.NewReturn.InsertionHelpers.NewNodeInserter_Return_order
    _newNodeInserters(3742) = nodes.NewTag.InsertionHelpers.NewNodeInserter_Tag_name
    _newNodeInserters(5058) = nodes.NewTag.InsertionHelpers.NewNodeInserter_Tag_value
    _newNodeInserters(5436) = nodes.NewTagNodePair.InsertionHelpers.NewNodeInserter_TagNodePair_node
    _newNodeInserters(5530) = nodes.NewTagNodePair.InsertionHelpers.NewNodeInserter_TagNodePair_tag
    _newNodeInserters(174) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_argumentIndex
    _newNodeInserters(268) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_argumentName
    _newNodeInserters(1020) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_code
    _newNodeInserters(1114) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_columnNumber
    _newNodeInserters(3276) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_lineNumber
    _newNodeInserters(3746) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_name
    _newNodeInserters(4122) = nodes.NewTemplateDom.InsertionHelpers.NewNodeInserter_TemplateDom_order
    _newNodeInserters(2150) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_fullName
    _newNodeInserters(3748) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_name
    _newNodeInserters(4876) = nodes.NewType.InsertionHelpers.NewNodeInserter_Type_typeDeclFullName
    _newNodeInserters(1024) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_code
    _newNodeInserters(1118) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_columnNumber
    _newNodeInserters(3280) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_lineNumber
    _newNodeInserters(4126) = nodes.NewTypeArgument.InsertionHelpers.NewNodeInserter_TypeArgument_order
    _newNodeInserters(86) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_aliasTypeFullName
    _newNodeInserters(368) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_astParentFullName
    _newNodeInserters(462) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_astParentType
    _newNodeInserters(1026) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_code
    _newNodeInserters(1120) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_columnNumber
    _newNodeInserters(2060) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_filename
    _newNodeInserters(2154) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_fullName
    _newNodeInserters(2624) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_inheritsFromTypeFullName
    _newNodeInserters(2812) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_isExternal
    _newNodeInserters(3282) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_lineNumber
    _newNodeInserters(3752) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_name
    _newNodeInserters(3940) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_offset
    _newNodeInserters(4034) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_offsetEnd
    _newNodeInserters(4128) = nodes.NewTypeDecl.InsertionHelpers.NewNodeInserter_TypeDecl_order
    _newNodeInserters(1028) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_code
    _newNodeInserters(1122) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_columnNumber
    _newNodeInserters(3284) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_lineNumber
    _newNodeInserters(3754) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_name
    _newNodeInserters(4130) = nodes.NewTypeParameter.InsertionHelpers.NewNodeInserter_TypeParameter_order
    _newNodeInserters(184) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_argumentIndex
    _newNodeInserters(278) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_argumentName
    _newNodeInserters(1030) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_code
    _newNodeInserters(1124) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_columnNumber
    _newNodeInserters(1782) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_dynamicTypeHintFullName
    _newNodeInserters(3286) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_lineNumber
    _newNodeInserters(4132) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_order
    _newNodeInserters(4508) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_possibleTypes
    _newNodeInserters(4978) = nodes.NewTypeRef.InsertionHelpers.NewNodeInserter_TypeRef_typeFullName
    _newNodeInserters(186) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_argumentIndex
    _newNodeInserters(280) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_argumentName
    _newNodeInserters(1032) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_code
    _newNodeInserters(1126) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_columnNumber
    _newNodeInserters(1314) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_containedRef
    _newNodeInserters(1784) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_dynamicTypeHintFullName
    _newNodeInserters(3288) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_lineNumber
    _newNodeInserters(4134) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_order
    _newNodeInserters(4416) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_parserTypeName
    _newNodeInserters(4510) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_possibleTypes
    _newNodeInserters(4980) = nodes.NewUnknown.InsertionHelpers.NewNodeInserter_Unknown_typeFullName
    _newNodeInserters
  }
  override def getNumberOfNodeKinds: Int              = 47
  override def getNumberOfEdgeKinds: Int              = 24
  override def getNodeLabel(nodeKind: Int): String    = nodeLabels(nodeKind)
  override def getNodeKindByLabel(label: String): Int = nodeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getEdgeLabel(nodeKind: Int, edgeKind: Int): String = edgeLabels(edgeKind)
  override def getEdgeKindByLabel(label: String): Int = edgeKindByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNodePropertyNames(nodeLabel: String): Set[String] = {
    nodeLabel match {
      case "ANNOTATION" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "FULL_NAME", "LINE_NUMBER", "NAME", "ORDER")
      case "ANNOTATION_LITERAL" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "ANNOTATION_PARAMETER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "ANNOTATION_PARAMETER_ASSIGN" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "ARRAY_INITIALIZER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "BINDING" => Set("METHOD_FULL_NAME", "NAME", "SIGNATURE")
      case "BLOCK" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "CALL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DISPATCH_TYPE",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "SIGNATURE",
          "TYPE_FULL_NAME"
        )
      case "CLOSURE_BINDING" => Set("CLOSURE_BINDING_ID", "CLOSURE_ORIGINAL_NAME", "EVALUATION_STRATEGY")
      case "COMMENT"         => Set("CODE", "COLUMN_NUMBER", "FILENAME", "LINE_NUMBER", "ORDER")
      case "CONFIG_FILE"     => Set("CONTENT", "NAME")
      case "CONTROL_STRUCTURE" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTROL_STRUCTURE_TYPE",
          "LINE_NUMBER",
          "ORDER",
          "PARSER_TYPE_NAME"
        )
      case "DEPENDENCY" => Set("DEPENDENCY_GROUP_ID", "NAME", "VERSION")
      case "FIELD_IDENTIFIER" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CANONICAL_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "FILE"    => Set("CODE", "COLUMN_NUMBER", "CONTENT", "HASH", "LINE_NUMBER", "NAME", "ORDER")
      case "FINDING" => Set()
      case "IDENTIFIER" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "IMPORT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EXPLICIT_AS",
          "IMPORTED_AS",
          "IMPORTED_ENTITY",
          "IS_EXPLICIT",
          "IS_WILDCARD",
          "LINE_NUMBER",
          "ORDER"
        )
      case "JUMP_LABEL" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER", "PARSER_TYPE_NAME")
      case "JUMP_TARGET" =>
        Set("ARGUMENT_INDEX", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER", "PARSER_TYPE_NAME")
      case "KEY_VALUE_PAIR"     => Set("KEY", "VALUE")
      case "LIFETIME"           => Set("FULL_NAME", "NAME", "TYPE_DECL_FULL_NAME")
      case "LIFETIME_ARGUMENT"  => Set()
      case "LIFETIME_PARAMETER" => Set("NAME")
      case "LITERAL" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCAL" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "LOCATION" =>
        Set(
          "CLASS_NAME",
          "CLASS_SHORT_NAME",
          "FILENAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "METHOD_SHORT_NAME",
          "NODE_LABEL",
          "PACKAGE_NAME",
          "SYMBOL"
        )
      case "MEMBER" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "META_DATA" => Set("HASH", "LANGUAGE", "OVERLAYS", "ROOT", "VERSION")
      case "METHOD" =>
        Set(
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "COLUMN_NUMBER_END",
          "FILENAME",
          "FULL_NAME",
          "HASH",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "LINE_NUMBER_END",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER",
          "SIGNATURE"
        )
      case "METHOD_PARAMETER_IN" =>
        Set(
          "CLOSURE_BINDING_ID",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_PARAMETER_OUT" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "EVALUATION_STRATEGY",
          "INDEX",
          "IS_VARIADIC",
          "LINE_NUMBER",
          "NAME",
          "ORDER",
          "TYPE_FULL_NAME"
        )
      case "METHOD_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "METHOD_FULL_NAME",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "METHOD_RETURN" =>
        Set(
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "EVALUATION_STRATEGY",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "MODIFIER"        => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "MODIFIER_TYPE", "ORDER")
      case "NAMESPACE"       => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "NAMESPACE_BLOCK" => Set("CODE", "COLUMN_NUMBER", "FILENAME", "FULL_NAME", "LINE_NUMBER", "NAME", "ORDER")
      case "RETURN"          => Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "TAG"             => Set("NAME", "VALUE")
      case "TAG_NODE_PAIR"   => Set()
      case "TEMPLATE_DOM" =>
        Set("ARGUMENT_INDEX", "ARGUMENT_NAME", "CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "TYPE"          => Set("FULL_NAME", "NAME", "TYPE_DECL_FULL_NAME")
      case "TYPE_ARGUMENT" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "ORDER")
      case "TYPE_DECL" =>
        Set(
          "ALIAS_TYPE_FULL_NAME",
          "AST_PARENT_FULL_NAME",
          "AST_PARENT_TYPE",
          "CODE",
          "COLUMN_NUMBER",
          "FILENAME",
          "FULL_NAME",
          "INHERITS_FROM_TYPE_FULL_NAME",
          "IS_EXTERNAL",
          "LINE_NUMBER",
          "NAME",
          "OFFSET",
          "OFFSET_END",
          "ORDER"
        )
      case "TYPE_PARAMETER" => Set("CODE", "COLUMN_NUMBER", "LINE_NUMBER", "NAME", "ORDER")
      case "TYPE_REF" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case "UNKNOWN" =>
        Set(
          "ARGUMENT_INDEX",
          "ARGUMENT_NAME",
          "CODE",
          "COLUMN_NUMBER",
          "CONTAINED_REF",
          "DYNAMIC_TYPE_HINT_FULL_NAME",
          "LINE_NUMBER",
          "ORDER",
          "PARSER_TYPE_NAME",
          "POSSIBLE_TYPES",
          "TYPE_FULL_NAME"
        )
      case _ => Set.empty
    }
  }
  override def getEdgePropertyName(label: String): Option[String] = {
    label match {
      case "REACHING_DEF" => Some("VARIABLE")
      case _              => None
    }
  }

  override def getPropertyLabel(nodeKind: Int, propertyKind: Int): String = {
    if (propertyKind < 55) normalNodePropertyNames(propertyKind)
    else if (propertyKind == 55 && nodeKind == 15) "evidence"      /*on node FINDING*/
    else if (propertyKind == 56 && nodeKind == 15) "keyValuePairs" /*on node FINDING*/
    else if (propertyKind == 57 && nodeKind == 26) "node"          /*on node LOCATION*/
    else if (propertyKind == 57 && nodeKind == 39) "node"          /*on node TAG_NODE_PAIR*/
    else if (propertyKind == 58 && nodeKind == 39) "tag"           /*on node TAG_NODE_PAIR*/
    else null
  }

  override def getPropertyKindByName(label: String): Int =
    nodePropertyByLabel.getOrElse(label, flatgraph.Schema.UndefinedKind)
  override def getNumberOfPropertyKinds: Int = 59
  override def makeNode(graph: flatgraph.Graph, nodeKind: Short, seq: Int): nodes.StoredNode =
    nodeFactories(nodeKind)(graph, seq)
  override def makeEdge(
    src: flatgraph.GNode,
    dst: flatgraph.GNode,
    edgeKind: Short,
    subSeq: Int,
    property: Any
  ): flatgraph.Edge = edgeFactories(edgeKind)(src, dst, subSeq, property)
  override def allocateEdgeProperty(
    nodeKind: Int,
    direction: flatgraph.Edge.Direction,
    edgeKind: Int,
    size: Int
  ): Array[?] = edgePropertyAllocators(edgeKind)(size)
  override def getNodePropertyFormalType(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalType =
    nodePropertyDescriptors(propertyOffsetArrayIndex(nodeKind, propertyKind)).asInstanceOf[FormalQtyType.FormalType]
  override def getNodePropertyFormalQuantity(nodeKind: Int, propertyKind: Int): FormalQtyType.FormalQuantity =
    nodePropertyDescriptors(1 + propertyOffsetArrayIndex(nodeKind, propertyKind))
      .asInstanceOf[FormalQtyType.FormalQuantity]

  override def getNewNodePropertyInserter(nodeKind: Int, propertyKind: Int): flatgraph.NewNodePropertyInsertionHelper =
    newNodeInsertionHelpers(propertyOffsetArrayIndex(nodeKind, propertyKind))
}
