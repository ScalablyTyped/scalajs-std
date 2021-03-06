package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderOptions extends js.Object {
  var fatal: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreBOM: js.UndefOr[scala.Boolean] = js.undefined
}

object TextDecoderOptions {
  @scala.inline
  def apply(): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoderOptions]
  }
  @scala.inline
  implicit class TextDecoderOptionsOps[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
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
    def setFatal(value: scala.Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatal: Self = this.set("fatal", js.undefined)
    @scala.inline
    def setIgnoreBOM(value: scala.Boolean): Self = this.set("ignoreBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreBOM: Self = this.set("ignoreBOM", js.undefined)
  }
  
}

