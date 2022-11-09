package com.triare.idp_3d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.TextView
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.CreateMethod.INFLATE
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import com.triare.idp_3d.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by viewBinding(INFLATE)
    private lateinit var textView: TextView
    private val randomNumber: Int by lazy { getRandomInt() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       initLateInit()
        showLazyResult()
    }

    private fun initLateInit(){
        textView = binding.text

        textView.setText(R.string.hello)
    }
    private fun showLazyResult(){
        binding.number.text = randomNumber.toString()
        binding.numberOne.text = randomNumber.toString()
    }

    private fun getRandomInt() = Random.nextInt()
}