package org.scalablytyped.std.global

import org.scalablytyped.std.DOMRectInit
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGRect")
@js.native
class SVGRect ()
  extends org.scalablytyped.std.DOMRect {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /* CompleteClass */
  override val bottom: Double = js.native
  /* CompleteClass */
  override val height: Double = js.native
  /* CompleteClass */
  override val left: Double = js.native
  /* CompleteClass */
  override val right: Double = js.native
  /* CompleteClass */
  override val top: Double = js.native
  /* CompleteClass */
  override val width: Double = js.native
  /* CompleteClass */
  override val x: Double = js.native
  /* CompleteClass */
  override val y: Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("SVGRect")
@js.native
object SVGRect
  extends Instantiable0[org.scalablytyped.std.DOMRect]
     with Instantiable1[/* x */ Double, org.scalablytyped.std.DOMRect]
     with Instantiable2[js.UndefOr[/* x */ Double], /* y */ Double, org.scalablytyped.std.DOMRect]
     with Instantiable3[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      /* width */ Double, 
      org.scalablytyped.std.DOMRect
    ]
     with Instantiable4[
      js.UndefOr[/* x */ Double], 
      js.UndefOr[/* y */ Double], 
      js.UndefOr[/* width */ Double], 
      /* height */ Double, 
      org.scalablytyped.std.DOMRect
    ] {
  def fromRect(): org.scalablytyped.std.DOMRect = js.native
  def fromRect(other: DOMRectInit): org.scalablytyped.std.DOMRect = js.native
}

