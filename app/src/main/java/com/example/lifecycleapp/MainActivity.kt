package com.example.lifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "The onCreate() method is called.", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "The onStart() method is called.", Toast.LENGTH_LONG).show()
    }

    //invoked when the activity starts interacting with the user
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "The onResume() method is called.", Toast.LENGTH_LONG).show()
    }

    //invoked after the activity is restarted
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "The onRestart() method is called.", Toast.LENGTH_LONG).show()
    }

    //not suitable for heavy processing
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "The onPause() method is called.", Toast.LENGTH_LONG).show()
    }

    //invoked when the activity is not visible to the user and is followed by on destroy method
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "The onStop() method is called.", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "The onDestroy() method is called.", Toast.LENGTH_LONG).show()
    }
}