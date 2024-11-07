package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}
import scala.collection.mutable

/** Node base type for compiletime-only checks to improve type safety.
 * EMT stands for: "erased marker trait", i.e. it is erased at runtime */
trait LifetimeArgumentEMT extends AnyRef with HasCodeEMT with HasNameEMT

trait LifetimeArgumentBase extends AbstractNode with StaticType[LifetimeArgumentEMT] {
  
  override def propertiesMap: java.util.Map[String, Any] = {
 import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*
 val res = new java.util.HashMap[String, Any]()
if (("<empty>": String) != this.code) res.put("CODE", this.code )
if (("<empty>": String) != this.name) res.put("NAME", this.name )
 res
}
}

object LifetimeArgument {
  val Label = "LIFETIME_ARGUMENT"
  object PropertyNames {
    /** This field holds the code snippet that the node represents. */
val Code = "CODE" 
/** Name of represented object, e.g., method name (e.g. "run") */
val Name = "NAME" 
  }
  object Properties {
    /** This field holds the code snippet that the node represents. */
val Code = flatgraph.SinglePropertyKey[String](kind = 10, name = "CODE", default = "<empty>")
/** Name of represented object, e.g., method name (e.g. "run") */
val Name = flatgraph.SinglePropertyKey[String](kind = 39, name = "NAME", default = "<empty>")
  }
  object PropertyDefaults {
    val Code = "<empty>"
val Name = "<empty>"
  }
}

class LifetimeArgument(graph_4762: flatgraph.Graph, seq_4762: Int) extends StoredNode(graph_4762, 22.toShort , seq_4762) with LifetimeArgumentBase with StaticType[LifetimeArgumentEMT] {
  

  override def productElementName(n: Int): String =
    n match {
      case 0 => "code"
case 1 => "name"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.code
case 1 => this.name
      case _ => null
    }

  override def productPrefix = "LifetimeArgument"
  override def productArity = 2

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[LifetimeArgument]
}

object NewLifetimeArgument {
  def apply(): NewLifetimeArgument = new NewLifetimeArgument
  private val outNeighbors: Map[String, Set[String]] = Map()
  private val inNeighbors: Map[String, Set[String]] = Map()

  object InsertionHelpers {
      object NewNodeInserter_LifetimeArgument_code extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewLifetimeArgument =>
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
object NewNodeInserter_LifetimeArgument_name extends flatgraph.NewNodePropertyInsertionHelper {
  override def insertNewNodeProperties(newNodes: mutable.ArrayBuffer[flatgraph.DNode], dst: AnyRef, offsets: Array[Int]): Unit = {
     if(newNodes.isEmpty) return
     val dstCast = dst.asInstanceOf[Array[String]]
     val seq = newNodes.head.storedRef.get.seq()
     var offset = offsets(seq)
     var idx = 0
     while(idx < newNodes.length){
        val nn = newNodes(idx)
        nn match {
          case generated: NewLifetimeArgument =>
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
  }
}

class NewLifetimeArgument extends NewNode(22.toShort) with LifetimeArgumentBase {
  override type StoredNodeType = LifetimeArgument
  override def label: String = "LIFETIME_ARGUMENT"

  override def isValidOutNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewLifetimeArgument.outNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }
  override def isValidInNeighbor(edgeLabel: String, n: NewNode): Boolean = {
    NewLifetimeArgument.inNeighbors.getOrElse(edgeLabel, Set.empty).contains(n.label)
  }

  var code: String = "<empty>": String
var name: String = "<empty>": String
  def code(value: String): this.type = {this.code = value; this }
def name(value: String): this.type = {this.name = value; this }
  override def countAndVisitProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {
interface.countProperty(this, 10, 1)
interface.countProperty(this, 39, 1)
}

  override def copy: this.type = {
    val newInstance = new NewLifetimeArgument
    newInstance.code = this.code
newInstance.name = this.name
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      case 0 => "code"
case 1 => "name"
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      case 0 => this.code
case 1 => this.name
      case _ => null
    }

  override def productPrefix = "NewLifetimeArgument"
  override def productArity = 2
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLifetimeArgument]
}
