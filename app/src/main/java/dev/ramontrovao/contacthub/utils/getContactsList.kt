package dev.ramontrovao.contacthub.utils

import dev.ramontrovao.contacthub.models.Contact
import dev.ramontrovao.contacthub.R

fun getContactsList(): List<Contact> {
    val contactsList = mutableListOf<Contact>()

    val contactImages = listOf(R.drawable.contact1, R.drawable.contact2)
    val contactPhones = listOf("27995785114", "27995785114", "27994785231", "27991314159", "27991285093", "31992224093")

    for (i in 1..10000) {
        val contactToAdd = Contact(i, "Contact $i", contactImages.random(), contactPhones.random())

        contactsList.add(contactToAdd)
    }

    return contactsList
}