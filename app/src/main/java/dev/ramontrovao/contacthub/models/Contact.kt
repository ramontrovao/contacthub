package dev.ramontrovao.contacthub.models

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
        val regex = Regex("""(\d{2})(\d{5})(\d{4})""")
        val phoneFormatted = regex.matchEntire(phoneNumber)

        if (phoneFormatted !== null) {
            val phoneAreaCode = phoneFormatted.groupValues[1]
            val phoneFirstPart = phoneFormatted.groupValues[2]
            val phoneSecondPart = phoneFormatted.groupValues[2]

            return "(${phoneAreaCode}) ${phoneFirstPart}-${phoneSecondPart}"
        }

        throw IllegalArgumentException("Phone number is invalid")
    }
}