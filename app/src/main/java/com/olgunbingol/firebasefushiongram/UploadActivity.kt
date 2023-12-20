package com.olgunbingol.firebasefushiongram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.storage
import com.olgunbingol.firebasefushiongram.databinding.ActivityLoginBinding
import com.olgunbingol.firebasefushiongram.databinding.ActivityUploadBinding
import java.util.UUID

class UploadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUploadBinding
    private lateinit var firestore : FirebaseFirestore
    private lateinit var storage : FirebaseStorage
    private lateinit var auth : FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = Firebase.auth
        firestore = Firebase.firestore
        storage = Firebase.storage
    }

    fun uploadClicked(view: View) {

        /*val uuid = UUID.randomUUID()
        val subjectName = "$uuid.txt"
        val entryName = "$uuid.txt"
        val reference = storage.reference
        val subjectReference = reference.child("subjects").child(subjectName)

        if(subjectName != null) {
            subjectReference.putFile(subjectName!!).addOnSuccessListener {
                val uploadSubjectReference = storage.reference.child("Subjects")

            }

        }


        val postMap = hashMapOf<String,Any>()
        postMap.put("Subject",binding.subjectText.text.toString())
        postMap.put("Entry",binding.entryText.text.toString())

        firestore.collection("Subjects").add(postMap).addOnSuccessListener {
            val intent = Intent(this@UploadActivity,FeedActivity::class.java)
            startActivity(intent)
        }.addOnFailureListener {
            Toast.makeText(this@UploadActivity,it.localizedMessage,Toast.LENGTH_LONG).show()
        }
*/
        val intent = Intent(this@UploadActivity,FeedActivity::class.java)
        startActivity(intent)
        finish()
    }

} 