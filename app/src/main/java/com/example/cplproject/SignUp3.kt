package com.example.cplproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase


class SignUp3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up3)

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("Employees")

        val employee = intent.getSerializableExtra("secondPage") as? Employee

        val btn = findViewById<Button>(R.id.btn_done)

        btn.setOnClickListener(View.OnClickListener {

                val rg = findViewById<RadioGroup>(R.id.rg_gender)//Gender
                val gender = when (rg.checkedRadioButtonId){
                    R.id.rb_female ->  false //woman
                    else -> true //
                }

                val rgd = findViewById<RadioGroup>(R.id.rg_disable)//disability
                val disable = when (rg.checkedRadioButtonId){
                    R.id.rb_disable ->  true //disable
                    else -> false //
                }

            employee?.gender = gender
            employee?.disable = disable

            if(disable) {
                employee?.typeOfDisable = findViewById<EditText>(R.id.typeOfDisable).text.toString()
            }

            val id = myRef!!.push().key
            employee?.id = id.toString()
            myRef!!.child(id.toString()).setValue(employee)

            val lastIntent = Intent(this , HomePage::class.java)
            startActivity(lastIntent)
        })
    }
}