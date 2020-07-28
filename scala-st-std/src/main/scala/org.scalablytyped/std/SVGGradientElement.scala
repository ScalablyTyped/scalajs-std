package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGGradientElement
  extends SVGElement
     with SVGUnitTypes
     with SVGURIReference {
  val SVG_SPREADMETHOD_PAD: Double = js.native
  val SVG_SPREADMETHOD_REFLECT: Double = js.native
  val SVG_SPREADMETHOD_REPEAT: Double = js.native
  val SVG_SPREADMETHOD_UNKNOWN: Double = js.native
  val gradientTransform: SVGAnimatedTransformList = js.native
  val gradientUnits: SVGAnimatedEnumeration = js.native
  val spreadMethod: SVGAnimatedEnumeration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}
