package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"

    private var mMessageEditText: EditText? = null

    private  val  LOG_TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMessageEditText = findViewById(R.id.editText_main)
    }

    fun launchSecondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent);


        Log.d(LOG_TAG,"Button clicked!")
    }
}