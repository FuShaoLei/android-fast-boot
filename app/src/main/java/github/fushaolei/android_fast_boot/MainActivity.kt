package github.fushaolei.android_fast_boot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import github.fushaolei.base.utils.fuck

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = "欸嘿嘿".fuck()

        Log.e("fuck => ", "onCreate: $str", )
    }
}