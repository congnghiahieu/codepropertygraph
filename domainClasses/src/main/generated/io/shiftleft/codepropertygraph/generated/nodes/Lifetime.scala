package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}
import scala.collection.mutable

/** Node base type for compiletime-only checks to improve type safety.
 * EMT stands for: "erased marker trait", i.e. it is erased at runtime */
trait LifetimeEMT extends AnyRef with HasFullNameEMT with HasNameEMT with HasTypeDeclFullNameEMT

trait LifetimeBase extends AbstractNode with StaticType[LifetimeEMT] {
  
  override def propertiesMap: java.util.Map[String, Any] = {
 import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*
 val res = new java.util.HashMap[String, Any]()
if (("<empty>": String) != this.fullName) res.put("FULL_NAME", this.fullName )
if (("<empty>": String) != this.name) res.put("NAME", this.name )
if (("<empty>": String) != this.typeDeclFullName) res.put("TYPE_DECL_FULL_NAME", this.typeDeclFullName )
 res
}
}

object Lifetime {
  val Label = "LIFETIME"
  object PropertyNames {
    /** This is the fully-qualified name of an entity, e.g., the fully-qualified
name of a method or type. The details of what constitutes a fully-qualified
name are language specific. This field SHOULD be human readable. */
val FullName = "FULL_NAME" 
/** Name of represented object, e.g., method name (e.g. "run") */
val Name = "NAME" 
/** The static type decl of a TYPE. This property is matched against the FULL_NAME
of TYPE_DECL nodes. It is required to have exactly one TYPE_DECL for each
different TYPE_DECL_FULL_NAME */
val TypeDeclFullName = "TYPE_DECL_FULL_NAME" 
  }
  object Properties {
    /** This is the fully-qualified name of an entity, e.g., the fully-qualified
name of a method or type. The details of what constitutes a fully-qualified
name are language specific. This field SHOULD be human readable. */
val FullName = flatgraph.SinglePropertyKey[String](kind = 22, name = "FULL_NAME", default = "<empty>")
/** Name of represented object, e.g., method name (e.g. "run") */
val Name = flatgraph.SinglePropertyKey[String](kind = 39, name = "NAME", default = "<empty>")
/** The static type decl of a TYPE. This property is matched against the FULL_NAME
of TYPE_DECL nodes. It is required to have exactly one TYPE_DECL for each
different TYPE_DECL_FULL_NAME */
val TypeDeclFullName = flatgraph.SinglePropertyKey[String](kind = 51, name = "TYPE_DECL_FULL_NAME", default = "<empty>")
  }
  object PropertyDefaults {
    val FullName = "<empty>"
val Name = "<empty>"
val TypeDeclFullName = "<empty>"
  }
}

class Lifetime(graph_4762: flatgraph.Graph, seq_4762: Int) extends StoredNode(graph_4762, 21.toShort , seq_4762) with LifetimeBase with StaticType[LifetimeEMT] {
  

  override def productElementName(n: Int): String =
    n match {
      case 0 => "fullName"
case 1 => "name"
case 2 => "typeDeclFullName"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.fullName
case 1 => this.name
case 2 => this.typeDeclFullName
      case _ => null
    }

  override def productPrefix = "Lifetime"
  override def productArity = 3

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[Lifetime]
}

object NewLifetime {
  def apply(): NewLifetime = new NewLifetime
  private val outNeighbors: Map[String, Set[String]] = Map()
  private val inNeighbors: Map[String, Set[String]] = Map()

  object InsertionHelpers {
      object NewNodeInserter_Lifetime_fullName extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewLifetime =>
            dstCast(offset) = generated.fullName
            offset += 1
          case _ =>
        }
        assert(seq + idx == nn.storedRef.get.seq(), "internal consistency check")
        idx += 1
        offsets(idx + seq) = offset
     }
  }
}
object NewNodeInserter_Lifetime_name extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewLifetime =>
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
object NewNodeInserter_Lifetime_typeDeclFullName extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewLifetime =>
            dstCast(offset) = generated.typeDeclFullName
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

class NewLifetime extends NewNode(21.toShort) with LifetimeBase {
  override type StoredNodeType = Lifetime
  override def label: String = "LIFETIME"

  override def isValidOutNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewLifetime.outNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }
  override def isValidInNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewLifetime.inNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }

  var fullName: String = "<empty>": String
var name: String = "<empty>": String
var typeDeclFullName: String = "<empty>": String
  def fullName(value: String): this.type = {this.fullName = value; this }
def name(value: String): this.type = {this.name = value; this }
def typeDeclFullName(value: String): this.type = {this.typeDeclFullName = value; this }
  override def countAndVisitProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {
interface.countProperty(this, 22, 1)
interface.countProperty(this, 39, 1)
interface.countProperty(this, 51, 1)
}

  override def copy: this.type = {
    val newInstance = new NewLifetime
    newInstance.fullName = this.fullName
newInstance.name = this.name
newInstance.typeDeclFullName = this.typeDeclFullName
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "fullName"
case 1 => "name"
case 2 => "typeDeclFullName"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.fullName
case 1 => this.name
case 2 => this.typeDeclFullName
      case _ => null
    }

  override def productPrefix = "NewLifetime"
  override def productArity = 3
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLifetime]
}
