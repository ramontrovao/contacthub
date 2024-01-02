package dev.ramontrovao.contacthub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ramontrovao.contacthub.adapters.ContactsAdapter
import dev.ramontrovao.contacthub.utils.getContactsList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.main_toolbar))

        val contactsList = getContactsList()
        val contactsAdapter = ContactsAdapter(contactsList)
        val contactsView = findViewById<RecyclerView>(R.id.contactsView)

        contactsView.layoutManager = LinearLayoutManager(this)
        contactsView.adapter = contactsAdapter
    }
}