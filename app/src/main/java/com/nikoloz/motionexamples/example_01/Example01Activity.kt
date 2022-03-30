package com.nikoloz.motionexamples.example_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.nikoloz.motionexamples.R

class Example01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.motion_01_cl_start)
        val button = findViewById<View>(R.id.button)
        val root = findViewById<ConstraintLayout>(R.id.root)

        val constraintSetStart = ConstraintSet()
        constraintSetStart.clone(root)
        val constraintSetEnd = ConstraintSet()
        constraintSetEnd.clone(this, R.layout.motion_01_cl_end)

        var start = true
        button.setOnClickListener {
            TransitionManager.beginDelayedTransition(root)
            val set = if (start) constraintSetEnd else constraintSetStart
            set.applyTo(root)
            start = !start
        }
    }
}