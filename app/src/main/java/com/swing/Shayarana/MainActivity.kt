package com.swing.Shayarana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firebaseAuth = FirebaseAuth.getInstance()



        sadbtn.setOnClickListener {
            val intent = Intent(this,sadscreen::class.java)
            startActivity(intent)


        }


        birthdaybtn.setOnClickListener {

            val intent = Intent(this,birthdayscreen::class.java)
            startActivity(intent)


        }



        teabtn.setOnClickListener {

            val intent = Intent(this,teascreen::class.java)
            startActivity(intent)



        }

        lovebtn.setOnClickListener {
            val intent = Intent(this,lovescreen::class.java)
            startActivity(intent)

        }

















    }

    //toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbarmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.signout) {

            firebaseAuth.signOut()
            intent = Intent(this, loginscreen::class.java)
            startActivity(intent)
            finish()

        }
        return true
    }

}


