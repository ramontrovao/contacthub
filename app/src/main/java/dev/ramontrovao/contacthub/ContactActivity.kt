package dev.ramontrovao.contacthub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactImage = intent.getIntExtra("contactImage", 0)
        val contactName = intent.getStringExtra("contactName")
        val contactPhone = intent.getStringExtra("contactPhone")

        val contactImageView = findViewById<ImageView>(R.id.contactImage)
        val contactNameView = findViewById<TextView>(R.id.contactName)
        val contactPhoneView = findViewById<TextView>(R.id.contactPhone)

        contactImageView.setImageResource(contactImage)
        contactNameView.text = contactName
        contactPhoneView.text = contactPhone
    }
}