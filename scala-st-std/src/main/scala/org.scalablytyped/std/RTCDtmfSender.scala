package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.tonechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDtmfSender extends EventTarget {
  val canInsertDTMF: scala.Boolean = js.native
  val duration: Double = js.native
  val interToneGap: Double = js.native
  val sender: RTCRtpSender = js.native
  val toneBuffer: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def insertDTMF(tones: java.lang.String): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: js.UndefOr[scala.Nothing], interToneGap: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double, interToneGap: Double): Unit = js.native
  def ontonechange(ev: RTCDTMFToneChangeEvent): js.Any = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
}
