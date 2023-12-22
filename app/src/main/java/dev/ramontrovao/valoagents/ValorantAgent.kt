package dev.ramontrovao.valoagents

class ValorantAgent(private val id: Int, private val name: String, private val description: String, private val imageId: String, private val role: String) {
    fun getId(): Int {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getDescription(): String {
        return description
    }

    fun getImageId(): String {
        return imageId
    }

    fun getRole(): String {
        return role
    }
}