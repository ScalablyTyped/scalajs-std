package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcdhKeyDeriveParams extends Algorithm {
  var public: CryptoKey
}

object EcdhKeyDeriveParams {
  @scala.inline
  def apply(name: java.lang.String, public: CryptoKey): EcdhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdhKeyDeriveParams]
  }
  @scala.inline
  implicit class EcdhKeyDeriveParamsOps[Self <: EcdhKeyDeriveParams] (val x: Self) extends AnyVal {
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
    def setPublic(value: CryptoKey): Self = this.set("public", value.asInstanceOf[js.Any])
  }
  
}

