package dev.ramontrovao.contacthub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    private val contactsList = listOf(Contact(1, "Eu", R.drawable.contact1, "27995785613"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val contactId = intent.getLongExtra("contactId", 0)
        val contact = contactsList.find { contact -> contact.getId() == contactId.toInt() }

    }
}