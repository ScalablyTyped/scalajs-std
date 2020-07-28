package org.scalablytyped.std.global

import org.scalablytyped.std.EventListenerOptions
import org.scalablytyped.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener extends js.Object {
  def apply(`type`: java.lang.String): Unit = js.native
  def apply(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: java.lang.String,
    listener: js.UndefOr[EventListenerOrEventListenerObject],
    options: scala.Boolean
  ): Unit = js.native
  def apply(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
}

