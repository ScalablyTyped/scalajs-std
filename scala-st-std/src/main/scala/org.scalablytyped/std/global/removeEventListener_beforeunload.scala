package org.scalablytyped.std.global

import org.scalablytyped.std.EventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_beforeunload extends js.Object {
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.BeforeUnloadEvent, _]
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

