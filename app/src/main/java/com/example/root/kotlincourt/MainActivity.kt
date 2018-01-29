package com.example.root.kotlincourt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreCounterA = 0
    var scoreCounterB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fivePointA.setOnClickListener{
            scoreCounterA += 5
            scoreA.text = "$scoreCounterA"
        }
        threePointA.setOnClickListener{
            scoreCounterA +=3
            scoreA.text = "$scoreCounterA"
        }
        onePointA.setOnClickListener{
            scoreCounterA ++
            scoreA.text = "$scoreCounterA"
        }

        fivePointB.setOnClickListener {
            scoreCounterB += 5
            scoreB.text = "$scoreCounterB"
        }
        threePointB.setOnClickListener {
            scoreCounterB += 3
            scoreB.text = "$scoreCounterB"
        }
        onePointB.setOnClickListener {
            scoreCounterB++
            scoreB.text = "$scoreCounterB"
        }

        reset.setOnClickListener {
            scoreCounterB = 0
            scoreCounterA = 0

            scoreA.text = "$scoreCounterA"
            scoreB.text = "$scoreCounterB"
        }
    }
}
