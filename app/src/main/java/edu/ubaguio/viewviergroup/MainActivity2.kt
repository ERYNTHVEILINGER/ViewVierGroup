package edu.ubaguio.viewviergroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nextbtn:Button = findViewById(R.id.BACK)
        //explicit intent->launch or start an activity
        nextbtn.setOnClickListener {
            val i= Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}