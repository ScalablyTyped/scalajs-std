package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBEnvironment extends js.Object {
  val indexedDB: IDBFactory
}

object IDBEnvironment {
  @scala.inline
  def apply(indexedDB: IDBFactory): IDBEnvironment = {
    val __obj = js.Dynamic.literal(indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBEnvironment]
  }
  @scala.inline
  implicit class IDBEnvironmentOps[Self <: IDBEnvironment] (val x: Self) extends AnyVal {
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
    def setIndexedDB(value: IDBFactory): Self = this.set("indexedDB", value.asInstanceOf[js.Any])
  }
  
}
