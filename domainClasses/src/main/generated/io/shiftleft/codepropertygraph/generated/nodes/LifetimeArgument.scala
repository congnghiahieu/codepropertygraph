package io.shiftleft.codepropertygraph.generated.nodes

import io.shiftleft.codepropertygraph.generated.language.*
import scala.collection.immutable.{IndexedSeq, ArraySeq}
import scala.collection.mutable

/** Node base type for compiletime-only checks to improve type safety.
 * EMT stands for: "erased marker trait", i.e. it is erased at runtime */
trait LifetimeArgumentEMT extends AnyRef

trait LifetimeArgumentBase extends AbstractNode with StaticType[LifetimeArgumentEMT] {
  
  override def propertiesMap: java.util.Map[String, Any] = {
 import io.shiftleft.codepropertygraph.generated.accessors.languagebootstrap.*
 val res = new java.util.HashMap[String, Any]()

 res
}
}

object LifetimeArgument {
  val Label = "LIFETIME_ARGUMENT"
  object PropertyNames {
    
  }
  object Properties {
    
  }
  object PropertyDefaults {
    
  }
}

class LifetimeArgument(graph_4762: flatgraph.Graph, seq_4762: Int) extends StoredNode(graph_4762, 22.toShort , seq_4762) with LifetimeArgumentBase with StaticType[LifetimeArgumentEMT] {
  

  override def productElementName(n: Int): String =
    n match {
      
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      
      case _ => null
    }

  override def productPrefix = "LifetimeArgument"
  override def productArity = 0

  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[LifetimeArgument]
}

object NewLifetimeArgument {
  def apply(): NewLifetimeArgument = new NewLifetimeArgument
  private val outNeighbors: Map[String, Set[String]] = Map()
  private val inNeighbors: Map[String, Set[String]] = Map()

  object InsertionHelpers {
      
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

  
  
  override def countAndVisitProperties(interface: flatgraph.BatchedUpdateInterface): Unit = {

}

  override def copy: this.type = {
    val newInstance = new NewLifetimeArgument
    
    newInstance.asInstanceOf[this.type]
  }

  override def productElementName(n: Int): String =
    n match {
      
      case _ => ""
    }

  override def productElement(n: Int): Any =
    n match {
      
      case _ => null
    }

  override def productPrefix = "NewLifetimeArgument"
  override def productArity = 0
  override def canEqual(that: Any): Boolean = that != null && that.isInstanceOf[NewLifetimeArgument]
}
