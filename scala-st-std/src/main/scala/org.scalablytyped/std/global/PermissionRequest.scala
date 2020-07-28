package org.scalablytyped.std.global

import org.scalablytyped.std.MSWebViewPermissionState
import org.scalablytyped.std.MSWebViewPermissionType
import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PermissionRequest")
@js.native
class PermissionRequest ()
  extends org.scalablytyped.std.PermissionRequest {
  /* CompleteClass */
  override val id: Double = js.native
  /* CompleteClass */
  override val state: MSWebViewPermissionState = js.native
  /* CompleteClass */
  override val `type`: MSWebViewPermissionType = js.native
  /* CompleteClass */
  override val uri: java.lang.String = js.native
  /* CompleteClass */
  override def allow(): Unit = js.native
  /* CompleteClass */
  override def defer(): Unit = js.native
  /* CompleteClass */
  override def deny(): Unit = js.native
}

@JSGlobal("PermissionRequest")
@js.native
object PermissionRequest
  extends Instantiable0[org.scalablytyped.std.PermissionRequest]

