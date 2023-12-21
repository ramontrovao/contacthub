package dev.ramontrovao.valoagents

private class ValorantAgent(val id: Int, val name: String, val description: String, val imageId: String) {
    fun getId() {
        return id
    }

    fun getName() {
        return name
    }

    fun getDescription() {
        return description
    }

    fun getImageId() {
        return imageId
    }
}