package com.nikoloz.motionexamples

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.nikoloz.motionexamples.example_01.Example01Activity
import com.nikoloz.motionexamples.example_02.Example02Activity
import com.nikoloz.motionexamples.example_03.Example03Activity
import com.nikoloz.motionexamples.example_04.Example04Activity
import com.nikoloz.motionexamples.example_05.Example05Activity
import com.nikoloz.motionexamples.example_06.Example06Activity
import com.nikoloz.motionexamples.example_07.Example07Activity
import com.nikoloz.motionexamples.example_08.Example08Activity

/**
 * Created by nikolozakhvlediani on 3/30/22.
 */
class MainActivity : AppCompatActivity() {

    private val examples = mapOf(
        "Constraint" to Example01Activity::class.java,
        "Simple" to Example02Activity::class.java,
        "OnSwipe" to Example03Activity::class.java,
        "Trigger from code" to Example04Activity::class.java,
        "ConstrainSets in Scene" to Example05Activity::class.java,
        "CustomAttributes" to Example06Activity::class.java,
        "KeyFrames 1" to Example07Activity::class.java,
        "KeyFrames 2" to Example08Activity::class.java,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        examples.forEach { (title, activityClass) ->
            Button(this).apply {
                text = title
                setOnClickListener {
                    startActivity(Intent(this@MainActivity, activityClass))
                }
                linearLayout.addView(this)
            }
        }
    }
}