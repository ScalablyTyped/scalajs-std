package org.scalablytyped.std.global

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoderStream")
@js.native
class TextEncoderStream ()
  extends org.scalablytyped.std.TextEncoderStream {
  /**
    * Returns "utf-8".
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /**
    * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
    */
  /* CompleteClass */
  override val readable: org.scalablytyped.std.ReadableStream[_] = js.native
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextEncoderStream: org.scalablytyped.std.ReadableStream[org.scalablytyped.std.Uint8Array] = js.native
  /**
    * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
    * 
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * 
    * ```
    * var decoder = new TextDecoderStream(encoding);
    * byteReadable
    *   .pipeThrough(decoder)
    *   .pipeTo(textWritable);
    * ```
    * 
    * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
    */
  /* CompleteClass */
  override val writable: org.scalablytyped.std.WritableStream[_] = js.native
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextEncoderStream: org.scalablytyped.std.WritableStream[java.lang.String] = js.native
}

@JSGlobal("TextEncoderStream")
@js.native
object TextEncoderStream
  extends Instantiable0[org.scalablytyped.std.TextEncoderStream]

