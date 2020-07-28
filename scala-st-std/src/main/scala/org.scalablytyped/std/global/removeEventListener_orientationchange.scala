package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.orientationchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_orientationchange extends js.Object {
  def apply(`type`: orientationchange, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}
