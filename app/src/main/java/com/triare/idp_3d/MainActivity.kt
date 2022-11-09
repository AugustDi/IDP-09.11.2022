package com.triare.idp_3d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.widget.TextView
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.CreateMethod.INFLATE
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import com.triare.idp_3d.databinding.ActivityMainBinding
import java.util.Objects
import kotlin.random.Random
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding(INFLATE)
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        "onCreate".logError()

    }

    override fun onStart() {
        super.onStart()

        "onStart".logError()
    }

    override fun onRestart() {
        super.onRestart()

        "onRestart".logError()
    }

    override fun onResume() {
        super.onResume()

        "onResume".logError()
    }

    override fun onPause() {
        super.onPause()

        "onPause".logError()
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy".logError()
    }

    override fun onStop() {
        super.onStop()

        "onStop".logError()
    }

    override fun onContentChanged() {
        super.onContentChanged()

        "onContentChanged".logError()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        "onRestoreInstanceState".logError()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        "onSaveInstanceState".logError()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        "onUserInteraction".logError()
    }
}

fun String.logError() {
    Log.e("MainActivity", this)
}