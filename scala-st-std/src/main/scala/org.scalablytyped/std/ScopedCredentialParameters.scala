package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialParameters extends js.Object {
  var algorithm: js.UndefOr[java.lang.String | Algorithm] = js.undefined
  var `type`: js.UndefOr[ScopedCredentialType] = js.undefined
}

object ScopedCredentialParameters {
  @scala.inline
  def apply(): ScopedCredentialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedCredentialParameters]
  }
  @scala.inline
  implicit class ScopedCredentialParametersOps[Self <: ScopedCredentialParameters] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: java.lang.String | Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setType(value: ScopedCredentialType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

