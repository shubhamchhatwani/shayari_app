    package com.swing.Shayarana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class loginscreen : AppCompatActivity() {

    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_loginscreen)

        firebaseAuth = FirebaseAuth.getInstance()


        val loginemail= findViewById<EditText>(R.id.loginemail)
        val loginpassword = findViewById<EditText>(R.id.loginpassword)
        val loginbtn = findViewById<Button>(R.id.loginbtn)
        val register = findViewById<TextView>(R.id.register)



        if(firebaseAuth.currentUser != null){
            val intent = Intent(this@loginscreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        }









        loginbtn.setOnClickListener {     val   email = loginemail.text.toString()
            val  password = loginpassword.text.toString()


            if (email.isBlank()||password.isBlank()){
                Toast.makeText(this,"email password is blank", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }



            firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener {


                    if (it.isSuccessful){
                       val intent = Intent(this@loginscreen,MainActivity::class.java)
                       startActivity(intent)
                        finish()
                    }

                    else{ Toast.makeText(this,"login faild", Toast.LENGTH_LONG).show()}

                }
        }








        register.setOnClickListener {
            val intent = Intent(this@loginscreen,signupscreen::class.java)
            startActivity(intent)
            finish()
        }





    }

}