package uk.co.massimocarli.bindingadaptersapp


import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import java.util.*


@BindingAdapter("android:adaptedText")
fun BoundTextView.setMyText(text: String) = setText(text)

@BindingAdapter("android:count")
fun BoundTextView.setCount(count: Int) =
  setText(context.getString(R.string.counter_format, count))

@BindingAdapter("android:fmtId", "android:count")
// @BindingAdapter(value = ["android:fmtId", "android:count"], requireAll = false)
fun BoundTextView.setCountToFormat(fmtId: Int, count: Int) =
  setText(context.getString(fmtId, count))

@BindingConversion
fun longToDate(time: Long): Date {
  val date = Date()
  date.time = time
  return date
}