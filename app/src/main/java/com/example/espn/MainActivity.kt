package com.example.espn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bootmnav:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = home_fragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.contairfragment, fragment)
        fragmentTransaction.commit()
        bootmnav=findViewById(R.id.bottomNavigationView)
        bootmnav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    val fragment = home_fragment()
                    openFragment(fragment)
                    true
                }
                R.id.calendar -> {
                    val fragment = calnder_fragment()
                    openFragment(fragment)
                    true
                }
                R.id.more -> {
                    val fragment = more_fragment()
                    openFragment(fragment)
                    true
                }
                else -> { false}
            }
        }

    }

    private fun openFragment(fragment: more_fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contairfragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun openFragment(fragment: calnder_fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contairfragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun openFragment(fragment: home_fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.contairfragment, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}