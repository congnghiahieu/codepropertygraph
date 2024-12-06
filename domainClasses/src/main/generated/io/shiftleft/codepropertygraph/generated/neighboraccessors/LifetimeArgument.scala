package io.shiftleft.codepropertygraph.generated.neighboraccessors

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.language.*

final class AccessNeighborsForLifetimeArgument(val node: nodes.LifetimeArgument) extends AnyVal {

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

  /** Traverse to LIFETIME_PARAMETER via AST IN edge.
    */
  def _lifetimeParameterViaAstIn: Iterator[nodes.LifetimeParameter] = astIn.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via AST OUT edge.
    */
  def _lifetimeParameterViaAstOut: Iterator[nodes.LifetimeParameter] = astOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via BINDS_TO OUT edge.
    */
  def _lifetimeParameterViaBindsToOut: Iterator[nodes.LifetimeParameter] =
    bindsToOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE IN edge.
    */
  def _lifetimeParameterViaOutLiveIn: Iterator[nodes.LifetimeParameter] = outLiveIn.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE OUT edge.
    */
  def _lifetimeParameterViaOutLiveOut: Iterator[nodes.LifetimeParameter] =
    outLiveOut.collectAll[nodes.LifetimeParameter]

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

  def bindsToOut: Iterator[nodes.LifetimeParameter] = node._bindsToOut.cast[nodes.LifetimeParameter]

  def outLiveIn: Iterator[nodes.AstNode] = node._outLiveIn.cast[nodes.AstNode]

  def outLiveOut: Iterator[nodes.AstNode] = node._outLiveOut.cast[nodes.AstNode]
}

final class AccessNeighborsForLifetimeArgumentTraversal(val traversal: Iterator[nodes.LifetimeArgument])
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

  /** Traverse to LIFETIME_PARAMETER via AST IN edge.
    */
  def _lifetimeParameterViaAstIn: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaAstIn)

  /** Traverse to LIFETIME_PARAMETER via AST OUT edge.
    */
  def _lifetimeParameterViaAstOut: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaAstOut)

  /** Traverse to LIFETIME_PARAMETER via BINDS_TO OUT edge.
    */
  def _lifetimeParameterViaBindsToOut: Iterator[nodes.LifetimeParameter] =
    traversal.flatMap(_._lifetimeParameterViaBindsToOut)

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE IN edge.
    */
  def _lifetimeParameterViaOutLiveIn: Iterator[nodes.LifetimeParameter] =
    traversal.flatMap(_._lifetimeParameterViaOutLiveIn)

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE OUT edge.
    */
  def _lifetimeParameterViaOutLiveOut: Iterator[nodes.LifetimeParameter] =
    traversal.flatMap(_._lifetimeParameterViaOutLiveOut)

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

  def bindsToOut: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_.bindsToOut)

  def outLiveIn: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveIn)

  def outLiveOut: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveOut)
}
