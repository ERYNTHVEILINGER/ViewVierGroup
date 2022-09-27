package edu.ubaguio.viewviergroup

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webBtn:Button = findViewById(R.id.GOOGLE)
        val dialBtn:Button = findViewById(R.id.DIALER)
        val emailBtn:Button = findViewById(R.id.Email)
        val cambtn:Button = findViewById(R.id.CAMERA)
        val toastbtn:Button = findViewById(R.id.TOAST)
        val nextbtn:Button = findViewById(R.id.NEXT)

        //explicit intent->launch or start an activity

        nextbtn.setOnClickListener {
            val i= Intent(this, MainActivity2::class.java)
            startActivity(i)
        }

        //implicit intent->open URL
        webBtn.setOnClickListener {
            val strURL = "https://www.ubaguio.edu"
            val ibrowser = Intent(Intent.ACTION_VIEW, Uri.parse(strURL))
            startActivity(ibrowser)
        }

        dialBtn.setOnClickListener {
            val idial = Intent(Intent.ACTION_DIAL)
            startActivity(idial)
        }

        //send email
        val txtmsg="hello MF"
        val errmsg="err MF"
        val imail = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, txtmsg)
            type = "text/plain"
        }
        emailBtn?.setOnClickListener {
            try{
                startActivity(imail)

            }catch(e: ActivityNotFoundException){
                Toast.makeText(this@MainActivity, errmsg, Toast.LENGTH_LONG)
        }

        }

        cambtn.setOnClickListener {
            val icam = Intent(Intent.ACTION_DIAL)
            startActivity(icam)
        }

        toastbtn.setOnClickListener {
            Toast.makeText(this,"goodbye", Toast.LENGTH_SHORT).show()
        }

    }
}