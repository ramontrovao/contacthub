package dev.ramontrovao.valoagents

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ValorantAgentsAdapter(private val context: Context, private val agentList: List<String>): BaseAdapter() {
    private lateinit var agentName: TextView

    override fun getCount(): Int {
        return agentList.size
    }

    override fun getItem(position: Int): String {
        return agentList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        view = LayoutInflater.from(context)
            .inflate(R.layout.agent_card, parent, false)

        agentName = view.findViewById(R.id.agentName)
        agentName.text = agentList[position]

        return view
    }
}