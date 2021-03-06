package org.scalablytyped.std.global

import org.scalablytyped.std.PopStateEventInit
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PopStateEvent")
@js.native
class PopStateEvent protected ()
  extends org.scalablytyped.std.PopStateEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PopStateEventInit) = this()
}

@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends Instantiable1[/* type */ java.lang.String, org.scalablytyped.std.PopStateEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PopStateEventInit, 
      org.scalablytyped.std.PopStateEvent
    ]

