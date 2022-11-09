package com.triare.idp_3d.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.triare.idp_3d.R
import com.triare.idp_3d.databinding.FragmentLifcycleBinding
import com.triare.idp_3d.ext.load
import com.triare.idp_3d.ext.logInfoAFragment

class LifecycleFragment : Fragment() {

    private val binding: FragmentLifcycleBinding by viewBinding(CreateMethod.INFLATE)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
    }

    private fun initUI() {
        initToolbar()
        initGlide()
    }

    private fun initGlide() {
        binding.glideLoad.load(url = url,
            placeholder = R.drawable.ic_baseline_image_24,
            error = R.drawable.ic_baseline_image_24
        )
    }

    private fun initToolbar() {
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    companion object {
    private const val url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaYipUq5-4yeGo1MuVPBAXC54Kwxt5VOTeOzjps3IK8V8ym_aBnouddihwvDoqVe6lH6E&usqp=CAU"
    }
}