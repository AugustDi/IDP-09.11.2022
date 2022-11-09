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
    private val randomNumber: Int by lazy { getRandomInt() }
    private val getUser: User by lazy { initUser() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       initLateInit()
        showLazyResult()
        isAnyItString(1)
        isAnyItString(1f)
        isAnyItString("i")

        isObjItString(initObjectUser.userName)

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

    private fun isAnyItString(x: Any) {
        if (x is String) {
            Log.i(TAG,"$x is a String")
        }else{Log.i(TAG,"$x is not a String")}
    }

    private fun isObjItString(x:Any) {
        if (x is User) {
            Log.i(TAG,x.toString())
        }else{Log.i(TAG,"is not a Object")}
    }

    private val initObjectUser = object {
        val userName = "name"
        val userSurname = "surname"
    }

    private fun initUser() = User("SomeName", "someSurname")

    companion object {
        private val TAG = "TEST"
    }
}

data class User(
    val name: String,
    val surname: String
)