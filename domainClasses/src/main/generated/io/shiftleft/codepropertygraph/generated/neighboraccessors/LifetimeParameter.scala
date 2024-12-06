package io.shiftleft.codepropertygraph.generated.neighboraccessors

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.language.*

final class AccessNeighborsForLifetimeParameter(val node: nodes.LifetimeParameter) extends AnyVal {

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

  /** Traverse to LIFETIME via REF IN edge.
    */
  def _lifetimeViaRefIn: Iterator[nodes.Lifetime] = refIn.collectAll[nodes.Lifetime]

  /** Traverse to LIFETIME via REF OUT edge.
    */
  def _lifetimeViaRefOut: Iterator[nodes.Lifetime] = refOut.collectAll[nodes.Lifetime]

  /** Traverse to LIFETIME_ARGUMENT via AST IN edge.
    */
  def _lifetimeArgumentViaAstIn: Iterator[nodes.LifetimeArgument] = astIn.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via AST OUT edge.
    */
  def _lifetimeArgumentViaAstOut: Iterator[nodes.LifetimeArgument] = astOut.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via BINDS_TO IN edge.
    */
  def _lifetimeArgumentViaBindsToIn: Iterator[nodes.LifetimeArgument] = bindsToIn.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE IN edge.
    */
  def _lifetimeArgumentViaOutLiveIn: Iterator[nodes.LifetimeArgument] = outLiveIn.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE OUT edge.
    */
  def _lifetimeArgumentViaOutLiveOut: Iterator[nodes.LifetimeArgument] = outLiveOut.collectAll[nodes.LifetimeArgument]

  /** Traverse to METHOD via AST OUT edge.
    */
  def _methodViaAstOut: Iterator[nodes.Method] = astOut.collectAll[nodes.Method]

  /** Traverse to METHOD via OUT_LIVE OUT edge.
    */
  def _methodViaOutLiveOut: Iterator[nodes.Method] = outLiveOut.collectAll[nodes.Method]

  /** Traverse to METHOD_PARAMETER_IN via AST IN edge.
    */
  def _methodParameterInViaAstIn: Iterator[nodes.MethodParameterIn] = astIn.collectAll[nodes.MethodParameterIn]

  /** Traverse to METHOD_PARAMETER_IN via OUT_LIVE IN edge.
    */
  def _methodParameterInViaOutLiveIn: Iterator[nodes.MethodParameterIn] = outLiveIn.collectAll[nodes.MethodParameterIn]

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def _unknownViaAstIn: Iterator[nodes.Unknown] = astIn.collectAll[nodes.Unknown]

  /** Traverse to UNKNOWN via OUT_LIVE IN edge.
    */
  def _unknownViaOutLiveIn: Iterator[nodes.Unknown] = outLiveIn.collectAll[nodes.Unknown]

  def astIn: Iterator[nodes.AstNode] = node._astIn.cast[nodes.AstNode]

  def astOut: Iterator[nodes.AstNode] = node._astOut.cast[nodes.AstNode]

  def bindsToIn: Iterator[nodes.LifetimeArgument] = node._bindsToIn.cast[nodes.LifetimeArgument]

  def outLiveIn: Iterator[nodes.AstNode] = node._outLiveIn.cast[nodes.AstNode]

  def outLiveOut: Iterator[nodes.AstNode] = node._outLiveOut.cast[nodes.AstNode]

  def refIn: Iterator[nodes.Lifetime] = node._refIn.cast[nodes.Lifetime]

  def refOut: Iterator[nodes.Lifetime] = node._refOut.cast[nodes.Lifetime]
}

final class AccessNeighborsForLifetimeParameterTraversal(val traversal: Iterator[nodes.LifetimeParameter])
    extends AnyVal {

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

  /** Traverse to LIFETIME via REF IN edge.
    */
  def _lifetimeViaRefIn: Iterator[nodes.Lifetime] = traversal.flatMap(_._lifetimeViaRefIn)

  /** Traverse to LIFETIME via REF OUT edge.
    */
  def _lifetimeViaRefOut: Iterator[nodes.Lifetime] = traversal.flatMap(_._lifetimeViaRefOut)

  /** Traverse to LIFETIME_ARGUMENT via AST IN edge.
    */
  def _lifetimeArgumentViaAstIn: Iterator[nodes.LifetimeArgument] = traversal.flatMap(_._lifetimeArgumentViaAstIn)

  /** Traverse to LIFETIME_ARGUMENT via AST OUT edge.
    */
  def _lifetimeArgumentViaAstOut: Iterator[nodes.LifetimeArgument] = traversal.flatMap(_._lifetimeArgumentViaAstOut)

  /** Traverse to LIFETIME_ARGUMENT via BINDS_TO IN edge.
    */
  def _lifetimeArgumentViaBindsToIn: Iterator[nodes.LifetimeArgument] =
    traversal.flatMap(_._lifetimeArgumentViaBindsToIn)

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE IN edge.
    */
  def _lifetimeArgumentViaOutLiveIn: Iterator[nodes.LifetimeArgument] =
    traversal.flatMap(_._lifetimeArgumentViaOutLiveIn)

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE OUT edge.
    */
  def _lifetimeArgumentViaOutLiveOut: Iterator[nodes.LifetimeArgument] =
    traversal.flatMap(_._lifetimeArgumentViaOutLiveOut)

  /** Traverse to METHOD via AST OUT edge.
    */
  def _methodViaAstOut: Iterator[nodes.Method] = traversal.flatMap(_._methodViaAstOut)

  /** Traverse to METHOD via OUT_LIVE OUT edge.
    */
  def _methodViaOutLiveOut: Iterator[nodes.Method] = traversal.flatMap(_._methodViaOutLiveOut)

  /** Traverse to METHOD_PARAMETER_IN via AST IN edge.
    */
  def _methodParameterInViaAstIn: Iterator[nodes.MethodParameterIn] = traversal.flatMap(_._methodParameterInViaAstIn)

  /** Traverse to METHOD_PARAMETER_IN via OUT_LIVE IN edge.
    */
  def _methodParameterInViaOutLiveIn: Iterator[nodes.MethodParameterIn] =
    traversal.flatMap(_._methodParameterInViaOutLiveIn)

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def _unknownViaAstIn: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaAstIn)

  /** Traverse to UNKNOWN via OUT_LIVE IN edge.
    */
  def _unknownViaOutLiveIn: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaOutLiveIn)

  def astIn: Iterator[nodes.AstNode] = traversal.flatMap(_.astIn)

  def astOut: Iterator[nodes.AstNode] = traversal.flatMap(_.astOut)

  def bindsToIn: Iterator[nodes.LifetimeArgument] = traversal.flatMap(_.bindsToIn)

  def outLiveIn: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveIn)

  def outLiveOut: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveOut)

  def refIn: Iterator[nodes.Lifetime] = traversal.flatMap(_.refIn)

  def refOut: Iterator[nodes.Lifetime] = traversal.flatMap(_.refOut)
}
