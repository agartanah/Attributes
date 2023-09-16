package com.bignerdranch.android.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var buttonBlackText: Button
    private lateinit var buttonRedText: Button
    private lateinit var buttonSize8SP: Button
    private lateinit var buttonSize24SP: Button
    private lateinit var buttonWhiteBackGround: Button
    private lateinit var buttonYellowBackGround: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBlackText = findViewById(R.id.buttonBlackText)
        buttonRedText = findViewById(R.id.buttonRedText)
        buttonSize8SP = findViewById(R.id.buttonSize8SP)
        buttonSize24SP = findViewById(R.id.buttonSize24SP)
        buttonWhiteBackGround = findViewById(R.id.buttonWhiteBackGround)
        buttonYellowBackGround = findViewById(R.id.buttonYellowBackGround)
        editText = findViewById(R.id.editTextText2)

        buttonBlackText.setOnClickListener() { view: View ->
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener() { view: View ->
            editText.setTextColor(Color.RED)
        }

        buttonSize8SP.setOnClickListener() { view: View ->
            editText.textSize = 8f
        }

        buttonSize24SP.setOnClickListener() { view: View ->
            editText.textSize = 24f
        }

        buttonWhiteBackGround.setOnClickListener() { view: View ->
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellowBackGround.setOnClickListener() { view: View ->
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}

