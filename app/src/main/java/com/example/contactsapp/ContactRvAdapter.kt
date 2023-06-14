package com.example.contactsapp

import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ActivityMainBinding
import com.example.contactsapp.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter ( var contactList:List<ContactsData>):RecyclerView.Adapter<ContactRvAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactList.get(position)
        val binding = holder.binding
        binding.tvNames.text = currentContact.AllNames
        binding.tvPhonenumber.text = currentContact.phoneNumber
        binding.tvEmail.text = currentContact.emailAddress
        if (!currentContact.image.isNullOrEmpty()) {
            Picasso.get()
                .load(currentContact.image)
                .resize(80, 80)
                .centerCrop(Gravity.CENTER)
                .transform(CropCircleTransformation())
                .into(binding.ivAvatar)
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ContactViewHolder(var binding: ContactListItemBinding) :
        RecyclerView.ViewHolder(binding.root)


}









