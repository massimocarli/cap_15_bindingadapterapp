package uk.co.massimocarli.bindingadaptersapp

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods

@BindingMethods(
  value = [
    BindingMethod(
      type = BoundTextView::class,
      attribute = "app:myText",
      method = "setBoundedText"
    )]
)
class BoundTextView : TextView {

  companion object {
    const val LOG_TAG = "BoundTextView"
  }

  constructor(context: Context) : this(context, null)
  constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

  fun setBoundedText(text: CharSequence?) {
    super.setText(text, BufferType.NORMAL)
    Log.d(LOG_TAG, "setBoundedText with value $text")
  }
}