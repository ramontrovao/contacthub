package dev.ramontrovao.contacthub

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val contactsList = listOf(Contact(1, "Eu", R.drawable.contact1, "27995785613"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactsAdapter = ContactsAdapter(this, contactsList)
        val contactsView = findViewById<ListView>(R.id.contactsView)

        contactsView.adapter = contactsAdapter
        contactsView.setOnItemClickListener {
                parent, view, position, id ->
                val intent = Intent(this, ContactActivity::class.java)
                intent.putExtra("contactId", id)
                startActivity(intent)
        }
    }
}