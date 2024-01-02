package dev.ramontrovao.contacthub.utils

import dev.ramontrovao.contacthub.models.Contact
import dev.ramontrovao.contacthub.R

fun getContactList(): List<Contact> {
    val contactsList = mutableListOf<Contact>()

    val contactImages = listOf(R.drawable.contactman, R.drawable.contactgirl)
    val contactPhones = listOf("27995785114", "27995785114", "27994785231", "27991314159", "27991285093", "31992224093")

    for (i in 1..10000) {
        val contactToAdd = Contact(i, "Contato $i", contactImages.random(), contactPhones.random())

        contactsList.add(contactToAdd)
    }

    return contactsList
}