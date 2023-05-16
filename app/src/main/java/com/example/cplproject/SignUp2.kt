package com.example.cplproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUp2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)

        var employee = intent.getSerializableExtra("firstPage") as? Employee

        Toast.makeText(this,employee?.name,Toast.LENGTH_LONG ).show()

        val sign_up1 = findViewById<Button>(R.id.sign_up1)

        sign_up1.setOnClickListener(View.OnClickListener {

            val education = (findViewById<EditText>(R.id.education)).text.toString()
            val experience = (findViewById<EditText>(R.id.experience)).text.toString()
            val bio = (findViewById<EditText>(R.id.bio)).text.toString()
            val age = findViewById<EditText>(R.id.age).text.toString().toInt()


            employee!!.education = education
            employee!!.experience = experience
            employee!!.bio = bio
            employee?.age = age

            val nextIntent = Intent(this,SignUp3::class.java)
            nextIntent.putExtra("secondPage",employee)
            startActivity(nextIntent)
        })
    }
}