package dev.ramontrovao.contacthub

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contactList: List<Contact>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contactNameView: TextView
        val contactPhoneView: TextView
        val contactImageView: ImageView

        init {
            contactNameView = view.findViewById(R.id.contactName)
            contactPhoneView = view.findViewById(R.id.contactNumber)
            contactImageView = view.findViewById(R.id.contactImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_card, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contactList[position]

        holder.contactNameView.text = contact.getName()
        holder.contactPhoneView.text = contact.getPhoneNumber()
        holder.contactImageView.setImageResource(contact.getImage())

        holder.itemView.setOnClickListener {view ->
            val intent = Intent(view.context, ContactActivity::class.java)
            intent.putExtra("contactImage", contact.getImage())
            intent.putExtra("contactName", contact.getName())
            intent.putExtra("contactPhone", contact.getPhoneNumber())


            view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = contactList.size
}