package com.example.fragment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val button1=findViewById<Button>(R.id.btnfragA)
       val button2=findViewById<Button>(R.id.btnfragB)
        button1.setOnClickListener {
            changeFragment(AFragment())
        }
        button2.setOnClickListener {
            changeFragment(BFragment())
        }

    }

    private fun changeFragment(bFragment: BFragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container,bFragment).commit()
    }

    private fun changeFragment(aFragment: AFragment) {

        supportFragmentManager.beginTransaction().replace(R.id.container,aFragment).commit()

    }
}