package dev.ramontrovao.contacthub

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactsList = mutableListOf<Contact>()

        val contactNames = listOf(
            "Alice", "Bob", "Charlie", "David", "Emily",
            "Frank", "Grace", "Henry", "Ivy", "Jack",
            "Kate", "Leo", "Mia", "Noah", "Olivia",
            "Paul", "Quinn", "Ryan", "Sophia", "Tom",
            "Uma", "Victor", "Wendy", "Xavier", "Yara",
            "Zach", "Ava", "Ben", "Cora", "Dylan",
            "Ella", "Finn", "Georgia", "Hugo", "Isabel",
            "Jake", "Lily", "Mason", "Nora", "Oscar",
            "Penny", "Quincy", "Riley", "Sam", "Tessa",
            "Ulysses", "Violet", "Will", "Xena", "Yannick"
        )
        val contactImages = listOf(R.drawable.contactman, R.drawable.contactgirl)
        val contactPhones = listOf("27995785114", "27995785114", "27994785231", "27991314159", "27991285093", "31992224093")

        for (i in 1..50) {
            val contactToAdd = Contact(i, contactNames[i - 1], contactImages.random(), contactPhones.random())

            contactsList.add(contactToAdd)
        }

        val contactsAdapter = ContactsAdapter(this, contactsList)
        val contactsView = findViewById<ListView>(R.id.contactsView)

        contactsView.adapter = contactsAdapter
        contactsView.setOnItemClickListener {
                parent, view, position, id ->
                val intent = Intent(this, ContactActivity::class.java)
                val contact = contactsList[position]
                intent.putExtra("contactImage", contact.getImage())
                intent.putExtra("contactName", contact.getName())
                intent.putExtra("contactPhone", contact.getPhoneNumber())
                startActivity(intent)
        }
    }
}