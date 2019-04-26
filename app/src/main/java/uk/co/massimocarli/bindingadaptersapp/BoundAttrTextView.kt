package uk.co.massimocarli.bindingadaptersapp

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.widget.TextView

class BoundAttrTextView : TextView {

  companion object {
    const val LOG_TAG = "BoundTextView"
  }

  constructor(context: Context) : this(context, null)
  constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
  constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

  fun setNewTextValue(text: CharSequence?, type: BufferType?) {
    super.setText(text, type)
    Log.d(LOG_TAG, "SetNewTextValue with value $text")
  }
}