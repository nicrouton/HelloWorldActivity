package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var displayEditTextView: EditText
    lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        // Edit text field view reference
        displayEditTextView = findViewById(R.id.nameEditText)

        // Button text view reference
        clickMeButton = findViewById(R.id.clickMeButton)

        // on click function
        clickMeButton.setOnClickListener() {
            var textFromEdit = displayEditTextView.text
            var editMessage = "Hello, $textFromEdit"
            displayTextView.text = editMessage
        }




        
        // Respond to button click event per specifications


    }
}

