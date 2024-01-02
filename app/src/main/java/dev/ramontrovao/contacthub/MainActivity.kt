package dev.ramontrovao.contacthub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.main_toolbar))

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

        for (i in 1..10000) {
            val contactToAdd = Contact(i, contactNames.random(), contactImages.random(), contactPhones.random())

            contactsList.add(contactToAdd)
        }

        val contactsAdapter = ContactsAdapter(contactsList)
        val contactsView = findViewById<RecyclerView>(R.id.contactsView)

        contactsView.layoutManager = LinearLayoutManager(this)
        contactsView.adapter = contactsAdapter
    }
}