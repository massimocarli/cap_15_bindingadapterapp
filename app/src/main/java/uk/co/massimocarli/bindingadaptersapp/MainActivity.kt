package uk.co.massimocarli.bindingadaptersapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import uk.co.massimocarli.bindingadaptersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    binding = DataBindingUtil.setContentView(
      this,
      R.layout.activity_main
    )
    // Holder for value
    val holder = Holder<Int>()
    holder.value = 0
    binding.holder = holder
    // Holder for formatting
    val fmtHolder = Holder<Int>()
    fmtHolder.value = R.string.counter_format
    binding.fmtHolder = fmtHolder
  }
}
