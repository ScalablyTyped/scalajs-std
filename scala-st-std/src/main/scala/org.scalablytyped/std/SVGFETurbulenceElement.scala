package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFETurbulenceElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
  val baseFrequencyX: SVGAnimatedNumber = js.native
  val baseFrequencyY: SVGAnimatedNumber = js.native
  val numOctaves: SVGAnimatedInteger = js.native
  val seed: SVGAnimatedNumber = js.native
  val stitchTiles: SVGAnimatedEnumeration = js.native
  val `type`: SVGAnimatedEnumeration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
}
