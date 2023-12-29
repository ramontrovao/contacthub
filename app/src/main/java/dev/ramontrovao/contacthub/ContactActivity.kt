package dev.ramontrovao.contacthub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    private val contactsList = listOf(Contact(1, "Eu", R.drawable.contact1, "27995785613"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactId = intent.getLongExtra("contactId", 0)
        val contact = contactsList.find { contact -> contact.getId() == contactId.toInt() }

        val contactImage = findViewById<ImageView>(R.id.contactImage)
        val contactName = findViewById<TextView>(R.id.contactName)
        val contactPhone = findViewById<TextView>(R.id.contactPhone)

        contactImage.setImageResource(contact!!.getImage())
        contactName.text = contact.getName()
        contactPhone.text = contact.getPhoneNumber()
    }
}