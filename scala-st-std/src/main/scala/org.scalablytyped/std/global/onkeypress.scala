package org.scalablytyped.std.global

import org.scalablytyped.std.Window
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires when the user presses an alphanumeric key.
  * @param ev The event.
  */
@JSGlobal("onkeypress")
@js.native
object onkeypress
  extends TopLevel[
      (js.ThisFunction1[/* this */ Window, /* ev */ org.scalablytyped.std.KeyboardEvent, js.Any]) | Null
    ]

