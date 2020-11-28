package com.swing.Shayarana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

 class signupscreen : AppCompatActivity() {

    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupscreen)

       firebaseAuth = FirebaseAuth.getInstance()

        val enteremail= findViewById<EditText>(R.id.enteremail)
        val enterpassword =findViewById<EditText>(R.id.enterpassword)
        val conformpassword = findViewById<EditText>(R.id.conformpassword)
        val signup = findViewById<Button>(R.id.signup)
        val loginbtn = findViewById<TextView>(R.id.loginbtn)




       // signup process
        signup.setOnClickListener {
            val email = enteremail.text.toString()
            val password = enterpassword.text.toString()
            val confornpassword1 = conformpassword.text.toString()



            if(email.isBlank()||  password.isBlank()|| confornpassword1.isBlank()){
                Toast.makeText(this,"email or password is blank",Toast.LENGTH_LONG).show()
                  return@setOnClickListener     }
            if (password!= confornpassword1){
                Toast.makeText(this,"password not match",Toast.LENGTH_LONG).show()
            return@setOnClickListener}


            firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent = Intent(this@signupscreen,MainActivity::class.java)
                        startActivity(intent)
                        finish() }
                    else{ Toast.makeText(this,"task fail",Toast.LENGTH_LONG).show() }
                }
        }



        loginbtn.setOnClickListener {

            val intent = Intent(this@signupscreen,loginscreen::class.java)
            startActivity(intent)
            finish()

        }
    }
    }


