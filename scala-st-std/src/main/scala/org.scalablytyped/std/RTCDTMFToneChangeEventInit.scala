package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDTMFToneChangeEventInit extends EventInit {
  var tone: js.UndefOr[java.lang.String] = js.undefined
}

object RTCDTMFToneChangeEventInit {
  @scala.inline
  def apply(): RTCDTMFToneChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
  @scala.inline
  implicit class RTCDTMFToneChangeEventInitOps[Self <: RTCDTMFToneChangeEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTone(value: java.lang.String): Self = this.set("tone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTone: Self = this.set("tone", js.undefined)
  }
  
}
