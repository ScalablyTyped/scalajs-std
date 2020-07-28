package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioBufferSourceNode extends AudioScheduledSourceNode {
  var buffer: AudioBuffer | Null = js.native
  val detune: AudioParam = js.native
  var loop: scala.Boolean = js.native
  var loopEnd: Double = js.native
  var loopStart: Double = js.native
  val playbackRate: AudioParam = js.native
  def start(when: js.UndefOr[scala.Nothing], offset: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def start(when: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
  def start(when: js.UndefOr[scala.Nothing], offset: Double, duration: Double): Unit = js.native
  def start(when: Double, offset: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
  def start(when: Double, offset: Double): Unit = js.native
  def start(when: Double, offset: Double, duration: Double): Unit = js.native
}

