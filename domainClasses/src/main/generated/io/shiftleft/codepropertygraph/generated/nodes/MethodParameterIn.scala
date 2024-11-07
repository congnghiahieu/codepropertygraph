package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}
import scala.collection.mutable

/** Node base type for compiletime-only checks to improve type safety.
 * EMT stands for: "erased marker trait", i.e. it is erased at runtime */
trait MethodParameterInEMT extends AnyRef with CfgNodeEMT with DeclarationEMT with HasClosureBindingIdEMT with HasDynamicTypeHintFullNameEMT with HasEvaluationStrategyEMT with HasIndexEMT with HasIsVariadicEMT with HasPossibleTypesEMT with HasTypeFullNameEMT

trait MethodParameterInBase extends AbstractNode with CfgNodeBase with DeclarationBase with StaticType[MethodParameterInEMT] {
  
  override def propertiesMap: java.util.Map[String, Any] = {
 import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*
 val res = new java.util.HashMap[String, Any]()
this.closureBindingId.foreach{p => res.put("CLOSURE_BINDING_ID", p )}
if (("<empty>": String) != this.code) res.put("CODE", this.code )
this.columnNumber.foreach{p => res.put("COLUMN_NUMBER", p )}
val tmpDynamicTypeHintFullName = this.dynamicTypeHintFullName; if(tmpDynamicTypeHintFullName.nonEmpty) res.put("DYNAMIC_TYPE_HINT_FULL_NAME", tmpDynamicTypeHintFullName)
if (("<empty>": String) != this.evaluationStrategy) res.put("EVALUATION_STRATEGY", this.evaluationStrategy )
if ((-1: Int) != this.index) res.put("INDEX", this.index )
if ((false: Boolean) != this.isVariadic) res.put("IS_VARIADIC", this.isVariadic )
this.lineNumber.foreach{p => res.put("LINE_NUMBER", p )}
if (("<empty>": String) != this.name) res.put("NAME", this.name )
if ((-1: Int) != this.order) res.put("ORDER", this.order )
val tmpPossibleTypes = this.possibleTypes; if(tmpPossibleTypes.nonEmpty) res.put("POSSIBLE_TYPES", tmpPossibleTypes)
if (("<empty>": String) != this.typeFullName) res.put("TYPE_FULL_NAME", this.typeFullName )
 res
}
}

object MethodParameterIn {
  val Label = "METHOD_PARAMETER_IN"
  object PropertyNames {
    /** Identifier which uniquely describes a CLOSURE_BINDING. This property is used to match captured LOCAL nodes with the corresponding CLOSURE_BINDING nodes */
val ClosureBindingId = "CLOSURE_BINDING_ID" 
/** This field holds the code snippet that the node represents. */
val Code = "CODE" 
/** This optional fields provides the column number of the program construct
represented by the node. */
val ColumnNumber = "COLUMN_NUMBER" 
/** Type hint for the dynamic type. These are observed to be verifiable at runtime. */
val DynamicTypeHintFullName = "DYNAMIC_TYPE_HINT_FULL_NAME" 
/** For formal method input parameters, output parameters, and return parameters,
this field holds the evaluation strategy, which is one of the following:
1) `BY_REFERENCE` indicates that the parameter is passed by reference, 2)
`BY_VALUE` indicates that it is passed by value, that is, a copy is made,
3) `BY_SHARING` the parameter is a pointer/reference and it is shared with
the caller/callee. While a copy of the pointer is made, a copy of the object
that it points to is not made. */
val EvaluationStrategy = "EVALUATION_STRATEGY" 
/** Specifies an index, e.g., for a parameter or argument.
 Explicit parameters are numbered from 1 to N, while index 0 is reserved for implicit
 self / this parameter. */
val Index = "INDEX" 
/** Specifies whether a parameter is the variadic argument handling parameter of
a variadic method. Only one parameter of a method is allowed to have this
property set to true. */
val IsVariadic = "IS_VARIADIC" 
/** This optional field provides the line number of the program construct
represented by the node. */
val LineNumber = "LINE_NUMBER" 
/** Name of represented object, e.g., method name (e.g. "run") */
val Name = "NAME" 
/** This integer indicates the position of the node among
its siblings in the AST. The left-most child has an
order of 0. */
val Order = "ORDER" 
/** Similar to `DYNAMIC_TYPE_HINT_FULL_NAME`, but that this makes no guarantee that types within this property are correct. This property is used to capture observations between node interactions during a 'may-analysis'. */
val PossibleTypes = "POSSIBLE_TYPES" 
/** This field contains the fully-qualified static type name of the program
construct represented by a node. It is the name of an instantiated type, e.g.,
`java.util.List<Integer>`, rather than `java.util.List[T]`. If the type
cannot be determined, this field should be set to the empty string. */
val TypeFullName = "TYPE_FULL_NAME" 
  }
  object Properties {
    /** Identifier which uniquely describes a CLOSURE_BINDING. This property is used to match captured LOCAL nodes with the corresponding CLOSURE_BINDING nodes */
val ClosureBindingId = flatgraph.OptionalPropertyKey[String](kind = 8, name = "CLOSURE_BINDING_ID")
/** This field holds the code snippet that the node represents. */
val Code = flatgraph.SinglePropertyKey[String](kind = 10, name = "CODE", default = "<empty>")
/** This optional fields provides the column number of the program construct
represented by the node. */
val ColumnNumber = flatgraph.OptionalPropertyKey[Int](kind = 11, name = "COLUMN_NUMBER")
/** Type hint for the dynamic type. These are observed to be verifiable at runtime. */
val DynamicTypeHintFullName = flatgraph.MultiPropertyKey[String](kind = 18, name = "DYNAMIC_TYPE_HINT_FULL_NAME")
/** For formal method input parameters, output parameters, and return parameters,
this field holds the evaluation strategy, which is one of the following:
1) `BY_REFERENCE` indicates that the parameter is passed by reference, 2)
`BY_VALUE` indicates that it is passed by value, that is, a copy is made,
3) `BY_SHARING` the parameter is a pointer/reference and it is shared with
the caller/callee. While a copy of the pointer is made, a copy of the object
that it points to is not made. */
val EvaluationStrategy = flatgraph.SinglePropertyKey[String](kind = 19, name = "EVALUATION_STRATEGY", default = "<empty>")
/** Specifies an index, e.g., for a parameter or argument.
 Explicit parameters are numbered from 1 to N, while index 0 is reserved for implicit
 self / this parameter. */
val Index = flatgraph.SinglePropertyKey[Int](kind = 26, name = "INDEX", default = -1: Int)
/** Specifies whether a parameter is the variadic argument handling parameter of
a variadic method. Only one parameter of a method is allowed to have this
property set to true. */
val IsVariadic = flatgraph.SinglePropertyKey[Boolean](kind = 30, name = "IS_VARIADIC", default = false)
/** This optional field provides the line number of the program construct
represented by the node. */
val LineNumber = flatgraph.OptionalPropertyKey[Int](kind = 34, name = "LINE_NUMBER")
/** Name of represented object, e.g., method name (e.g. "run") */
val Name = flatgraph.SinglePropertyKey[String](kind = 39, name = "NAME", default = "<empty>")
/** This integer indicates the position of the node among
its siblings in the AST. The left-most child has an
order of 0. */
val Order = flatgraph.SinglePropertyKey[Int](kind = 43, name = "ORDER", default = -1: Int)
/** Similar to `DYNAMIC_TYPE_HINT_FULL_NAME`, but that this makes no guarantee that types within this property are correct. This property is used to capture observations between node interactions during a 'may-analysis'. */
val PossibleTypes = flatgraph.MultiPropertyKey[String](kind = 47, name = "POSSIBLE_TYPES")
/** This field contains the fully-qualified static type name of the program
construct represented by a node. It is the name of an instantiated type, e.g.,
`java.util.List<Integer>`, rather than `java.util.List[T]`. If the type
cannot be determined, this field should be set to the empty string. */
val TypeFullName = flatgraph.SinglePropertyKey[String](kind = 52, name = "TYPE_FULL_NAME", default = "<empty>")
  }
  object PropertyDefaults {
    val Code = "<empty>"
val EvaluationStrategy = "<empty>"
val Index = -1: Int
val IsVariadic = false
val Name = "<empty>"
val Order = -1: Int
val TypeFullName = "<empty>"
  }
}

class MethodParameterIn(graph_4762: flatgraph.Graph, seq_4762: Int) extends StoredNode(graph_4762, 30.toShort , seq_4762) with MethodParameterInBase with CfgNode with Declaration with StaticType[MethodParameterInEMT] {
  

  override def productElementName(n: Int): String =
    n match {
      case 0 => "closureBindingId"
case 1 => "code"
case 2 => "columnNumber"
case 3 => "dynamicTypeHintFullName"
case 4 => "evaluationStrategy"
case 5 => "index"
case 6 => "isVariadic"
case 7 => "lineNumber"
case 8 => "name"
case 9 => "order"
case 10 => "possibleTypes"
case 11 => "typeFullName"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.closureBindingId
case 1 => this.code
case 2 => this.columnNumber
case 3 => this.dynamicTypeHintFullName
case 4 => this.evaluationStrategy
case 5 => this.index
case 6 => this.isVariadic
case 7 => this.lineNumber
case 8 => this.name
case 9 => this.order
case 10 => this.possibleTypes
case 11 => this.typeFullName
      case _ => null
    }

  override def productPrefix = "MethodParameterIn"
  override def productArity = 12

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[MethodParameterIn]
}

object NewMethodParameterIn {
  def apply(): NewMethodParameterIn = new NewMethodParameterIn
  private val outNeighbors: Map[String, Set[String]] = Map("ALIAS_OF" -> Set("TYPE"), "ARGUMENT" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "AST" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "BINDS" -> Set("BINDING"), "BINDS_TO" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CALL" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CAPTURE" -> Set("CLOSURE_BINDING"), "CAPTURED_BY" -> Set("CLOSURE_BINDING"), "CDG" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CFG" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CONDITION" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CONTAINS" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "DOMINATE" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "EVAL_TYPE" -> Set("TYPE"), "IMPORTS" -> Set("DEPENDENCY"), "INHERITS_FROM" -> Set("TYPE"), "IS_CALL_FOR_IMPORT" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "PARAMETER_LINK" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "POST_DOMINATE" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "REACHING_DEF" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "RECEIVER" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "REF" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "SOURCE_FILE" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "TAGGED_BY" -> Set("TAG"))
  private val inNeighbors: Map[String, Set[String]] = Map("ARGUMENT" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "AST" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "BINDS_TO" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CALL" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CDG" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CFG" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CONDITION" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "CONTAINS" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "DOMINATE" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "IS_CALL_FOR_IMPORT" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "PARAMETER_LINK" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "POST_DOMINATE" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "REACHING_DEF" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "RECEIVER" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "REF" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BINDING", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "CLOSURE_BINDING", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"), "SOURCE_FILE" -> Set("ANNOTATION", "ANNOTATION_LITERAL", "ANNOTATION_PARAMETER", "ANNOTATION_PARAMETER_ASSIGN", "ARRAY_INITIALIZER", "BLOCK", "CALL", "CALL_REPR", "CFG_NODE", "COMMENT", "CONTROL_STRUCTURE", "EXPRESSION", "FIELD_IDENTIFIER", "FILE", "IDENTIFIER", "IMPORT", "JUMP_LABEL", "JUMP_TARGET", "LITERAL", "LOCAL", "MEMBER", "METHOD", "METHOD_PARAMETER_IN", "METHOD_PARAMETER_OUT", "METHOD_REF", "METHOD_RETURN", "MODIFIER", "NAMESPACE", "NAMESPACE_BLOCK", "RETURN", "TEMPLATE_DOM", "TYPE_ARGUMENT", "TYPE_DECL", "TYPE_PARAMETER", "TYPE_REF", "UNKNOWN"))

  object InsertionHelpers {
      object NewNodeInserter_MethodParameterIn_closureBindingId extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            generated.closureBindingId match {
              case Some(item) =>
                dstCast(offset) = item
                offset += 1
              case _ =>
            }
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_code extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.code
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_columnNumber extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[Int]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            generated.columnNumber match {
              case Some(item) =>
                dstCast(offset) = item
                offset += 1
              case _ =>
            }
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_dynamicTypeHintFullName extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            for(item <- generated.dynamicTypeHintFullName){
              dstCast(offset) = item
              offset += 1
            }
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_evaluationStrategy extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.evaluationStrategy
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_index extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[Int]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.index
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_isVariadic extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[Boolean]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.isVariadic
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_lineNumber extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[Int]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            generated.lineNumber match {
              case Some(item) =>
                dstCast(offset) = item
                offset += 1
              case _ =>
            }
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_name extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.name
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_order extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[Int]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.order
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_possibleTypes extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            for(item <- generated.possibleTypes){
              dstCast(offset) = item
              offset += 1
            }
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_MethodParameterIn_typeFullName extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewMethodParameterIn =>
            dstCast(offset) = generated.typeFullName
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
  }
}

class NewMethodParameterIn extends NewNode(30.toShort) with MethodParameterInBase with AstNodeNew with CfgNodeNew with DeclarationNew {
  override type StoredNodeType = MethodParameterIn
  override def label: String = "METHOD_PARAMETER_IN"

  override def isValidOutNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewMethodParameterIn.outNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }
  override def isValidInNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewMethodParameterIn.inNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }

  var closureBindingId: Option[String] = None
var code: String = "<empty>": String
var columnNumber: Option[Int] = None
var dynamicTypeHintFullName: IndexedSeq[String] = ArraySeq.empty
var evaluationStrategy: String = "<empty>": String
var index: Int = -1: Int
var isVariadic: Boolean = false: Boolean
var lineNumber: Option[Int] = None
var name: String = "<empty>": String
var order: Int = -1: Int
var possibleTypes: IndexedSeq[String] = ArraySeq.empty
var typeFullName: String = "<empty>": String
  def closureBindingId(value: Option[String]): this.type = {this.closureBindingId = value; this }
def closureBindingId(value: String): this.type = {this.closureBindingId = Option(value); this }
def code(value: String): this.type = {this.code = value; this }
def columnNumber(value: Int): this.type = {this.columnNumber = Option(value); this }
def columnNumber(value: Option[Int]): this.type = {this.columnNumber = value; this }
def dynamicTypeHintFullName(value: IterableOnce[String]): this.type = {this.dynamicTypeHintFullName = value.iterator.to(ArraySeq); this }
def evaluationStrategy(value: String): this.type = {this.evaluationStrategy = value; this }
def index(value: Int): this.type = {this.index = value; this }
def isVariadic(value: Boolean): this.type = {this.isVariadic = value; this }
def lineNumber(value: Int): this.type = {this.lineNumber = Option(value); this }
def lineNumber(value: Option[Int]): this.type = {this.lineNumber = value; this }
def name(value: String): this.type = {this.name = value; this }
def order(value: Int): this.type = {this.order = value; this }
def possibleTypes(value: IterableOnce[String]): this.type = {this.possibleTypes = value.iterator.to(ArraySeq); this }
def typeFullName(value: String): this.type = {this.typeFullName = value; this }
  override def countAndVisitProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {
interface.countProperty(this, 8, closureBindingId.size)
interface.countProperty(this, 10, 1)
interface.countProperty(this, 11, columnNumber.size)
interface.countProperty(this, 18, dynamicTypeHintFullName.size)
interface.countProperty(this, 19, 1)
interface.countProperty(this, 26, 1)
interface.countProperty(this, 30, 1)
interface.countProperty(this, 34, lineNumber.size)
interface.countProperty(this, 39, 1)
interface.countProperty(this, 43, 1)
interface.countProperty(this, 47, possibleTypes.size)
interface.countProperty(this, 52, 1)
}

  override def copy: this.type = {
    val newInstance = new NewMethodParameterIn
    newInstance.closureBindingId = this.closureBindingId
newInstance.code = this.code
newInstance.columnNumber = this.columnNumber
newInstance.dynamicTypeHintFullName = this.dynamicTypeHintFullName
newInstance.evaluationStrategy = this.evaluationStrategy
newInstance.index = this.index
newInstance.isVariadic = this.isVariadic
newInstance.lineNumber = this.lineNumber
newInstance.name = this.name
newInstance.order = this.order
newInstance.possibleTypes = this.possibleTypes
newInstance.typeFullName = this.typeFullName
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "closureBindingId"
case 1 => "code"
case 2 => "columnNumber"
case 3 => "dynamicTypeHintFullName"
case 4 => "evaluationStrategy"
case 5 => "index"
case 6 => "isVariadic"
case 7 => "lineNumber"
case 8 => "name"
case 9 => "order"
case 10 => "possibleTypes"
case 11 => "typeFullName"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.closureBindingId
case 1 => this.code
case 2 => this.columnNumber
case 3 => this.dynamicTypeHintFullName
case 4 => this.evaluationStrategy
case 5 => this.index
case 6 => this.isVariadic
case 7 => this.lineNumber
case 8 => this.name
case 9 => this.order
case 10 => this.possibleTypes
case 11 => this.typeFullName
      case _ => null
    }

  override def productPrefix = "NewMethodParameterIn"
  override def productArity = 12
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewMethodParameterIn]
}
