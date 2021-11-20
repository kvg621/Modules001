package com.example.modules001

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.module002.BlankFragment
import com.example.recyclercardmaterial.FragmentRecycler
import com.google.android.material.bottomnavigation.BottomNavigationView

private var menuBottomBar: BottomNavigationView? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aFragment = mainFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fregment001, aFragment)
            .commit()

        val menuBottomBar = findViewById<BottomNavigationView>(R.id.nav_bar_bottom)
        menuBottomBar?.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.to_002 -> {
                    val bFragment = BlankFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fregment001, bFragment)
                        .commit()
                }
                R.id.to_home -> {
                    val mFragment = mainFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fregment001, mFragment)
                        .commit()
                }
                R.id.to_list -> {
                    val mFragment = FragmentRecycler()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fregment001, mFragment)
                        .commit()
                }
                R.id.to_yandex -> {
                    val uris = Uri.parse("http://yandex.ru")
                    val intent= Intent(Intent.ACTION_VIEW,uris)
                    startActivity(intent)

                }
            }
            true
        }

    }
}