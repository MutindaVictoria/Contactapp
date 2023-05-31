package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        showContact()
    }
    fun showContact(){
        val contact1=ContactsData("","Joy smiley","07856789745","joysmiley@gmail.com")
        val contact2=ContactsData("","Brenda Waeni","0789047567","brendawaeni@gmail.com")
        val contact3=ContactsData("","Muthoni Josphine","0789564589","muthonijay@gmail.com")
        val contact4=ContactsData("","Osbon Kioko","0767890943","osbonkioko@gmail.com")
        val contact5=ContactsData("","Sammy Ndiwa","0789345689","sammyNdiwa@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val teeAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=teeAdapter

    }

}