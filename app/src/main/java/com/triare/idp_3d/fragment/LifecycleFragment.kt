package com.triare.idp_3d.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.CreateMethod
import by.kirich1409.viewbindingdelegate.viewBinding
import com.triare.idp_3d.databinding.FragmentLifcycleBinding
import com.triare.idp_3d.ext.logInfoAFragment

class LifecycleFragment : Fragment() {

    private val binding: FragmentLifcycleBinding by viewBinding(CreateMethod.INFLATE)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        "onAttach".logInfoAFragment()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        "onCreate".logInfoAFragment()


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        "onViewCreated".logInfoAFragment()
        binding.toolbar.setNavigationOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    override fun onStart() {
        super.onStart()
        "onStart".logInfoAFragment()

    }

    override fun onResume() {
        super.onResume()
        "onResume".logInfoAFragment()

    }

    override fun onDetach() {
        super.onDetach()
        "onDetach".logInfoAFragment()

    }

    override fun onDestroy() {
        super.onDestroy()
        "onDestroy".logInfoAFragment()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        "onDestroyView".logInfoAFragment()

    }

    override fun onStop() {
        super.onStop()
        "onStop".logInfoAFragment()

    }

    override fun onPause() {
        super.onPause()
        "onPause".logInfoAFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

}