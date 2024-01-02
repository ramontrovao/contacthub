package dev.ramontrovao.contacthub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        setSupportActionBar(findViewById(R.id.contact_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val contactImage = intent.getIntExtra("contactImage", 0)
        val contactName = intent.getStringExtra("contactName")
        val contactPhone = intent.getStringExtra("contactPhone")

        supportActionBar?.title = contactName

        val contactImageView = findViewById<ImageView>(R.id.contactImage)
        val contactNameView = findViewById<TextView>(R.id.contactName)
        val contactPhoneView = findViewById<TextView>(R.id.contactPhone)

        contactImageView.setImageResource(contactImage)
        contactNameView.text = contactName
        contactPhoneView.text = contactPhone
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}