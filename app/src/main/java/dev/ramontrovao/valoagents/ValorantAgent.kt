package dev.ramontrovao.valoagents

import android.graphics.drawable.Drawable

class ValorantAgent(private val id: Int, private val name: String, private val description: String, private val imageRes: Int, private val role: String) {
    fun getId(): Int {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getDescription(): String {
        return description
    }

    fun getImageRes(): Int {
        return imageRes
    }

    fun getRole(): String {
        return role
    }
}