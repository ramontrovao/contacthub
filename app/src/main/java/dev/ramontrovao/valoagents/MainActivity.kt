package dev.ramontrovao.valoagents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val agentsList = listOf(ValorantAgent(1, "Raze", "Raze é brasileira", R.drawable.raze, "Duelista"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val agentsView = findViewById<ListView>(R.id.agentsView)

        val valorantAgentsAdapter = ValorantAgentsAdapter(this, agentsList)
        agentsView.adapter = valorantAgentsAdapter
    }
}