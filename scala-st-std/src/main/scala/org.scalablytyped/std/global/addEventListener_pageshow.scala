package org.scalablytyped.std.global

import org.scalablytyped.std.AddEventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.pageshow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_pageshow extends js.Object {
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PageTransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
}

