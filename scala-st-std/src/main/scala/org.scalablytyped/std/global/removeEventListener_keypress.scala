package org.scalablytyped.std.global

import org.scalablytyped.std.EventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.keypress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_keypress extends js.Object {
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

