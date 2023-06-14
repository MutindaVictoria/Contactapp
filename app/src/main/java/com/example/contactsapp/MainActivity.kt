package com.example.contactsapp

import android.content.Intent
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
        binding.btnFloating.setOnClickListener {
            val intent = Intent(this,AddContacts::class.java)
            startActivity(intent)
        }
    }
//    override fun onResume( ){
//        super.onResume()
//        displayContacts()
//        binding.btnFloating.setOnClickListener {
//            val intent= Intent(this,AddContacts::class.java)
//            startActivity(intent)
//        }
//    }
    fun showContact(){
        val contact1=ContactsData("","Joy smiley","07856789745","joysmiley@gmail.com")
        val contact2=ContactsData("https://images.unsplash.com/photo-1484950763426-56b5bf172dbb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVyc29uJTIwJTIwcHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Brenda Waeni","0789047567","brendawaeni@gmail.com")
        val contact3=ContactsData("https://images.unsplash.com/photo-1484950763426-56b5bf172dbb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVyc29uJTIwJTIwcHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Muthoni Josphine","0789564589","muthonijay@gmail.com")
        val contact4=ContactsData("https://images.unsplash.com/photo-1484950763426-56b5bf172dbb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVyc29uJTIwJTIwcHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Osbon Kioko","0767890943","osbonkioko@gmail.com")
        val contact5=ContactsData("https://images.unsplash.com/photo-1484950763426-56b5bf172dbb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVyc29uJTIwJTIwcHJvZmlsZSUyMGltYWdlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Sammy Ndiwa","0789345689","sammyNdiwa@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5)
        val teeAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=teeAdapter

    }

}