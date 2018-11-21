package com.example.mike.negocios

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            text.setText(button3.text)
        }

        button2.setOnClickListener {
            text.setText(button2.text)
        }

        button.setOnClickListener {
            text.setText(button.text)
        }

        button4.setOnClickListener {
            text.setText(button4.text)
        }

        button5.setOnClickListener {
            text.setText(button5.text)
        }

    }
}
