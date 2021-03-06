package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the amount of acceleration the device is experiencing along all three axes. */
trait DeviceAcceleration extends js.Object {
  val x: Double | Null
  val y: Double | Null
  val z: Double | Null
}

object DeviceAcceleration {
  @scala.inline
  def apply(): DeviceAcceleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAcceleration]
  }
  @scala.inline
  implicit class DeviceAccelerationOps[Self <: DeviceAcceleration] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setXNull: Self = this.set("x", null)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setYNull: Self = this.set("y", null)
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def setZNull: Self = this.set("z", null)
  }
  
}

