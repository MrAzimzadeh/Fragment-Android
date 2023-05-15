package com.azimzada.fragmentcalismasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()


        ft.add(R.id.fragment_tutucu1, FragmentBirinci()) //  elave edir
        ft.add(R.id.fragment_tutucu2, FragmentIkinci()) // elave edir
        ft.commit() //  bu olmazsa gorsenmir
    }
}