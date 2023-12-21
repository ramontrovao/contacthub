package dev.ramontrovao.valoagents

class ValorantAgent(private val id: Int, private val name: String, private val description: String, private val imageId: String) {
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
}