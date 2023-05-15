package com.azimzada.fragmentcalismasi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentBirinci : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_birinci , container,false)

        rootView.findViewById<Button>(R.id.btnTikla).setOnClickListener(){
            Toast.makeText(activity,"Merhaba ",Toast.LENGTH_SHORT).show()
        }

        return rootView
    }
}