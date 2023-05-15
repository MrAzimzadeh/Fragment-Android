package com.azimzada.fragmentcalismasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentIkinci : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fagment_ikinci , container,false)

        rootView.findViewById<Button>(R.id.YAP).setOnClickListener()
        {
            rootView.findViewById<TextView>(R.id.tvCikti).text = "Merhaba "
        }

        return rootView
    }
}