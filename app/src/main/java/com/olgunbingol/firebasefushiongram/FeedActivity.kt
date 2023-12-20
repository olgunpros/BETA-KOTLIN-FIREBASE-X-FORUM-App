package com.olgunbingol.firebasefushiongram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class FeedActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        auth = Firebase.auth

    }
    fun signClicked(view: View) {
        val intent = Intent(this@FeedActivity,LoginActivity::class.java)
        startActivity(intent)
        Toast.makeText(this,"Beta version may contain errors!", Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Beta version may contain errors!",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Beta version may contain errors!",Toast.LENGTH_LONG).show()

    }
}