package com.nikoloz.motionexamples.example_04

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import com.nikoloz.motionexamples.R

/**
 * Created by nikolozakhvlediani on 3/30/22.
 */
class Example04Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_04)
        val motionLayout = findViewById<MotionLayout>(R.id.root)
        val button = findViewById<View>(R.id.button)

        var start = true
        button.setOnClickListener {
            if (start) {
                motionLayout.transitionToEnd()
            } else {
                motionLayout.transitionToStart()
            }
            start = !start
        }
    }
}