package com.triare.idp_3d

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.CreateMethod.INFLATE
import by.kirich1409.viewbindingdelegate.viewBinding
import com.triare.idp_3d.databinding.ActivityMainBinding
import com.triare.idp_3d.ext.logInfoActivity
import com.triare.idp_3d.fragment.LifecycleFragment

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding(INFLATE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        "onCreate".logInfoActivity()

        binding.action.setOnClickListener {
            replaceFragment(LifecycleFragment())
        }
    }

    override fun onStart() {
        super.onStart()

        "onStart".logInfoActivity()
    }

    override fun onRestart() {
        super.onRestart()

        "onRestart".logInfoActivity()
    }

    override fun onResume() {
        super.onResume()

        "onResume".logInfoActivity()
    }

    override fun onPause() {
        super.onPause()

        "onPause".logInfoActivity()
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy".logInfoActivity()
    }

    override fun onStop() {
        super.onStop()

        "onStop".logInfoActivity()
    }

    override fun onContentChanged() {
        super.onContentChanged()

        "onContentChanged".logInfoActivity()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        "onRestoreInstanceState".logInfoActivity()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        "onSaveInstanceState".logInfoActivity()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        "onUserInteraction".logInfoActivity()
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.navHostFragment, fragment)
            .addToBackStack("test")
            .commit()
    }
}