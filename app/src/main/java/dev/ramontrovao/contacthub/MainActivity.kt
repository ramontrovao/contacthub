package dev.ramontrovao.contacthub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val contactsList = listOf(Contact(1, "Eu", R.drawable.gekko, "27995785613"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactsView = findViewById<ListView>(R.id.contactsView)

        val contactsAdapter = ContactsAdapter(this, contactsList)
        contactsView.adapter = contactsAdapter
    }
}