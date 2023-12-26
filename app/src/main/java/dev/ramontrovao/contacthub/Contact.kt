package dev.ramontrovao.contacthub

class Contact(private val id: Int, private val name: String, private val image: Int, private val phoneNumber: String) {
    fun getId(): Int {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getImage(): Int {
        return image
    }

    fun getPhoneNumber(): String {
        return phoneNumber
    }
}