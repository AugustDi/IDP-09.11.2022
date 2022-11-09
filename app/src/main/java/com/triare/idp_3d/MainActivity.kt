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

        binding.action.setOnClickListener {
            replaceFragment(LifecycleFragment())
        }
    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.navHostFragment, fragment)
            .addToBackStack("test")
            .commit()
    }
}