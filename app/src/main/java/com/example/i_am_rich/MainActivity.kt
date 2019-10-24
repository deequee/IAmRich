package com.example.i_am_rich

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var networth = 100.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus_btn.setOnClickListener { increaseNetWorth()  }
        reset_btn.setOnClickListener { resetNetWorth() }
    }

    private fun increaseNetWorth() {
        networth *= 10 / 2.5
        net_value.text = "$$networth"
    }

    private fun resetNetWorth() {
        networth = 100.0
        net_value.text = "$$networth"

    }
}
