package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single audio track from one of the HTML media elements, <audio> or <video>.  */
trait AudioTrack extends js.Object {
  var enabled: scala.Boolean
  val id: java.lang.String
  var kind: java.lang.String
  val label: java.lang.String
  var language: java.lang.String
  val sourceBuffer: SourceBuffer | Null
}

object AudioTrack {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    id: java.lang.String,
    kind: java.lang.String,
    label: java.lang.String,
    language: java.lang.String
  ): AudioTrack = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
  @scala.inline
  implicit class AudioTrackOps[Self <: AudioTrack] (val x: Self) extends AnyVal {
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
    def setEnabled(value: scala.Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: java.lang.String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: java.lang.String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: java.lang.String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceBuffer(value: SourceBuffer): Self = this.set("sourceBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceBufferNull: Self = this.set("sourceBuffer", null)
  }
  
}

