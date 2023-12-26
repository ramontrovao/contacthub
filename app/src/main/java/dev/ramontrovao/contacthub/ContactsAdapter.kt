package dev.ramontrovao.contacthub

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ContactsAdapter(private val context: Context, private val contactList: List<Contact>): BaseAdapter() {
    override fun getCount(): Int {
        return contactList.size
    }

    override fun getItem(position: Int): Contact {
        return contactList[position]
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        view = LayoutInflater.from(context)
            .inflate(R.layout.contact_card, parent, false)

        val contact = contactList[position]

        val contactNameView = view?.findViewById<TextView>(R.id.contactName)
        val contactImageView = view?.findViewById<ImageView>(R.id.contactImage)
        val contactNumberView = view?.findViewById<TextView>(R.id.contactNumber)
        contactNameView?.text = contact.getName()
        contactNumberView?.text = contact.getPhoneNumber()
        contactImageView?.setImageResource(contact.getImage())

        return view!!
    }
}