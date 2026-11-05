package edu.temple.basictimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val startButton : Button by lazy {
        findViewById(R.id.startButton)
    }

    val stopButton : Button by lazy {
        findViewById(R.id.stopButton)
    }

    val timerTextView : TextView by lazy {
        findViewById(R.id.textView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {

        }
        
        stopButton.setOnClickListener {

        }
    }
}