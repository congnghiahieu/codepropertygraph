package io.shiftleft.codepropertygraph.generated.neighboraccessors

import io.shiftleft.codepropertygraph.generated.nodes
import io.shiftleft.codepropertygraph.generated.language.*

final class AccessNeighborsForLifetime(val node: nodes.Lifetime) extends AnyVal {

  /** Traverse to LIFETIME_ARGUMENT via AST IN edge.
    */
  def _lifetimeArgumentViaAstIn: Iterator[nodes.LifetimeArgument] = astIn.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via AST OUT edge.
    */
  def _lifetimeArgumentViaAstOut: Iterator[nodes.LifetimeArgument] = astOut.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE IN edge.
    */
  def _lifetimeArgumentViaOutLiveIn: Iterator[nodes.LifetimeArgument] = outLiveIn.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE OUT edge.
    */
  def _lifetimeArgumentViaOutLiveOut: Iterator[nodes.LifetimeArgument] = outLiveOut.collectAll[nodes.LifetimeArgument]

  /** Traverse to LIFETIME_PARAMETER via AST IN edge.
    */
  def _lifetimeParameterViaAstIn: Iterator[nodes.LifetimeParameter] = astIn.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via AST OUT edge.
    */
  def _lifetimeParameterViaAstOut: Iterator[nodes.LifetimeParameter] = astOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE IN edge.
    */
  def _lifetimeParameterViaOutLiveIn: Iterator[nodes.LifetimeParameter] = outLiveIn.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE OUT edge.
    */
  def _lifetimeParameterViaOutLiveOut: Iterator[nodes.LifetimeParameter] =
    outLiveOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via REF IN edge.
    */
  def _lifetimeParameterViaRefIn: Iterator[nodes.LifetimeParameter] = refIn.collectAll[nodes.LifetimeParameter]

  /** Traverse to LIFETIME_PARAMETER via REF OUT edge.
    */
  def _lifetimeParameterViaRefOut: Iterator[nodes.LifetimeParameter] = refOut.collectAll[nodes.LifetimeParameter]

  /** Traverse to METHOD via AST OUT edge.
    */
  def _methodViaAstOut: Iterator[nodes.Method] = astOut.collectAll[nodes.Method]

  /** Traverse to METHOD via OUT_LIVE OUT edge.
    */
  def _methodViaOutLiveOut: Iterator[nodes.Method] = outLiveOut.collectAll[nodes.Method]

  /** Traverse to METHOD_PARAMETER_IN via AST IN edge.
    */
  def _methodParameterInViaAstIn: Iterator[nodes.MethodParameterIn] = astIn.collectAll[nodes.MethodParameterIn]

  /** Traverse to METHOD_PARAMETER_IN via AST OUT edge.
    */
  def _methodParameterInViaAstOut: Iterator[nodes.MethodParameterIn] = astOut.collectAll[nodes.MethodParameterIn]

  /** Traverse to METHOD_PARAMETER_IN via OUT_LIVE IN edge.
    */
  def _methodParameterInViaOutLiveIn: Iterator[nodes.MethodParameterIn] = outLiveIn.collectAll[nodes.MethodParameterIn]

  /** Traverse to METHOD_PARAMETER_IN via OUT_LIVE OUT edge.
    */
  def _methodParameterInViaOutLiveOut: Iterator[nodes.MethodParameterIn] =
    outLiveOut.collectAll[nodes.MethodParameterIn]

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def _unknownViaAstIn: Iterator[nodes.Unknown] = astIn.collectAll[nodes.Unknown]

  /** Traverse to UNKNOWN via AST OUT edge.
    */
  def _unknownViaAstOut: Iterator[nodes.Unknown] = astOut.collectAll[nodes.Unknown]

  /** Traverse to UNKNOWN via OUT_LIVE IN edge.
    */
  def _unknownViaOutLiveIn: Iterator[nodes.Unknown] = outLiveIn.collectAll[nodes.Unknown]

  /** Traverse to UNKNOWN via OUT_LIVE OUT edge.
    */
  def _unknownViaOutLiveOut: Iterator[nodes.Unknown] = outLiveOut.collectAll[nodes.Unknown]

  def astIn: Iterator[nodes.AstNode] = node._astIn.cast[nodes.AstNode]

  def astOut: Iterator[nodes.AstNode] = node._astOut.cast[nodes.AstNode]

  def outLiveIn: Iterator[nodes.AstNode] = node._outLiveIn.cast[nodes.AstNode]

  def outLiveOut: Iterator[nodes.AstNode] = node._outLiveOut.cast[nodes.AstNode]

  def refIn: Iterator[nodes.LifetimeParameter] = node._refIn.cast[nodes.LifetimeParameter]

  def refOut: Iterator[nodes.LifetimeParameter] = node._refOut.cast[nodes.LifetimeParameter]
}

final class AccessNeighborsForLifetimeTraversal(val traversal: Iterator[nodes.Lifetime]) extends AnyVal {

  /** Traverse to LIFETIME_ARGUMENT via AST IN edge.
    */
  def _lifetimeArgumentViaAstIn: Iterator[nodes.LifetimeArgument] = traversal.flatMap(_._lifetimeArgumentViaAstIn)

  /** Traverse to LIFETIME_ARGUMENT via AST OUT edge.
    */
  def _lifetimeArgumentViaAstOut: Iterator[nodes.LifetimeArgument] = traversal.flatMap(_._lifetimeArgumentViaAstOut)

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE IN edge.
    */
  def _lifetimeArgumentViaOutLiveIn: Iterator[nodes.LifetimeArgument] =
    traversal.flatMap(_._lifetimeArgumentViaOutLiveIn)

  /** Traverse to LIFETIME_ARGUMENT via OUT_LIVE OUT edge.
    */
  def _lifetimeArgumentViaOutLiveOut: Iterator[nodes.LifetimeArgument] =
    traversal.flatMap(_._lifetimeArgumentViaOutLiveOut)

  /** Traverse to LIFETIME_PARAMETER via AST IN edge.
    */
  def _lifetimeParameterViaAstIn: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaAstIn)

  /** Traverse to LIFETIME_PARAMETER via AST OUT edge.
    */
  def _lifetimeParameterViaAstOut: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaAstOut)

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE IN edge.
    */
  def _lifetimeParameterViaOutLiveIn: Iterator[nodes.LifetimeParameter] =
    traversal.flatMap(_._lifetimeParameterViaOutLiveIn)

  /** Traverse to LIFETIME_PARAMETER via OUT_LIVE OUT edge.
    */
  def _lifetimeParameterViaOutLiveOut: Iterator[nodes.LifetimeParameter] =
    traversal.flatMap(_._lifetimeParameterViaOutLiveOut)

  /** Traverse to LIFETIME_PARAMETER via REF IN edge.
    */
  def _lifetimeParameterViaRefIn: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaRefIn)

  /** Traverse to LIFETIME_PARAMETER via REF OUT edge.
    */
  def _lifetimeParameterViaRefOut: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_._lifetimeParameterViaRefOut)

  /** Traverse to METHOD via AST OUT edge.
    */
  def _methodViaAstOut: Iterator[nodes.Method] = traversal.flatMap(_._methodViaAstOut)

  /** Traverse to METHOD via OUT_LIVE OUT edge.
    */
  def _methodViaOutLiveOut: Iterator[nodes.Method] = traversal.flatMap(_._methodViaOutLiveOut)

  /** Traverse to METHOD_PARAMETER_IN via AST IN edge.
    */
  def _methodParameterInViaAstIn: Iterator[nodes.MethodParameterIn] = traversal.flatMap(_._methodParameterInViaAstIn)

  /** Traverse to METHOD_PARAMETER_IN via AST OUT edge.
    */
  def _methodParameterInViaAstOut: Iterator[nodes.MethodParameterIn] = traversal.flatMap(_._methodParameterInViaAstOut)

  /** Traverse to METHOD_PARAMETER_IN via OUT_LIVE IN edge.
    */
  def _methodParameterInViaOutLiveIn: Iterator[nodes.MethodParameterIn] =
    traversal.flatMap(_._methodParameterInViaOutLiveIn)

  /** Traverse to METHOD_PARAMETER_IN via OUT_LIVE OUT edge.
    */
  def _methodParameterInViaOutLiveOut: Iterator[nodes.MethodParameterIn] =
    traversal.flatMap(_._methodParameterInViaOutLiveOut)

  /** Traverse to UNKNOWN via AST IN edge.
    */
  def _unknownViaAstIn: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaAstIn)

  /** Traverse to UNKNOWN via AST OUT edge.
    */
  def _unknownViaAstOut: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaAstOut)

  /** Traverse to UNKNOWN via OUT_LIVE IN edge.
    */
  def _unknownViaOutLiveIn: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaOutLiveIn)

  /** Traverse to UNKNOWN via OUT_LIVE OUT edge.
    */
  def _unknownViaOutLiveOut: Iterator[nodes.Unknown] = traversal.flatMap(_._unknownViaOutLiveOut)

  def astIn: Iterator[nodes.AstNode] = traversal.flatMap(_.astIn)

  def astOut: Iterator[nodes.AstNode] = traversal.flatMap(_.astOut)

  def outLiveIn: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveIn)

  def outLiveOut: Iterator[nodes.AstNode] = traversal.flatMap(_.outLiveOut)

  def refIn: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_.refIn)

  def refOut: Iterator[nodes.LifetimeParameter] = traversal.flatMap(_.refOut)
}
