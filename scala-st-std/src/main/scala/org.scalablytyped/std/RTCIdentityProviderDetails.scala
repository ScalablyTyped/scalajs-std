package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIdentityProviderDetails extends js.Object {
  var domain: java.lang.String
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIdentityProviderDetails {
  @scala.inline
  def apply(domain: java.lang.String): RTCIdentityProviderDetails = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityProviderDetails]
  }
  @scala.inline
  implicit class RTCIdentityProviderDetailsOps[Self <: RTCIdentityProviderDetails] (val x: Self) extends AnyVal {
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
    def setDomain(value: java.lang.String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: java.lang.String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

