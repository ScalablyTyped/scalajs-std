package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeyMessageEventInit extends EventInit {
  var message: js.UndefOr[ArrayBuffer] = js.undefined
  var messageType: js.UndefOr[MediaKeyMessageType] = js.undefined
}

object MediaKeyMessageEventInit {
  @scala.inline
  def apply(): MediaKeyMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeyMessageEventInit]
  }
  @scala.inline
  implicit class MediaKeyMessageEventInitOps[Self <: MediaKeyMessageEventInit] (val x: Self) extends AnyVal {
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
    def setMessage(value: ArrayBuffer): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageType(value: MediaKeyMessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
  }
  
}

