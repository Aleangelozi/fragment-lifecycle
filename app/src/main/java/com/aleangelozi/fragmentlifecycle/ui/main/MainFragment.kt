package com.aleangelozi.fragmentlifecycle.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.Lifecycle.Event
import com.aleangelozi.fragmentlifecycle.R
import java.lang.ProcessBuilder.Redirect.to

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Callback", "onCreate | ${lifecycle.currentState}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Callback", "onCreateView | ${lifecycle.currentState}")
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Callback", "onViewCreated | ${lifecycle.currentState}")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Callback", "onViewStateRestored | ${lifecycle.currentState}")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Callback", "onStart | ${lifecycle.currentState}")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Callback", "onResume | ${lifecycle.currentState}")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Callback", "onPause | ${lifecycle.currentState}")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Callback", "onStop | ${lifecycle.currentState}")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Callback", "onSaveInstanceState | ${lifecycle.currentState}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Callback", "onDestroyView | ${lifecycle.currentState}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Callback", "onDestroy | ${lifecycle.currentState}")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}