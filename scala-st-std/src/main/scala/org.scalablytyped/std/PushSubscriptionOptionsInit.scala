package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushSubscriptionOptionsInit extends js.Object {
  var applicationServerKey: js.UndefOr[js.Any] = js.undefined
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PushSubscriptionOptionsInit {
  @scala.inline
  def apply(): PushSubscriptionOptionsInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionOptionsInit]
  }
  @scala.inline
  implicit class PushSubscriptionOptionsInitOps[Self <: PushSubscriptionOptionsInit] (val x: Self) extends AnyVal {
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
    def setApplicationServerKey(value: js.Any): Self = this.set("applicationServerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationServerKey: Self = this.set("applicationServerKey", js.undefined)
    @scala.inline
    def setUserVisibleOnly(value: scala.Boolean): Self = this.set("userVisibleOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserVisibleOnly: Self = this.set("userVisibleOnly", js.undefined)
  }
  
}
