package com.pk.cvwizard.login

import android.app.Activity
import android.app.Application
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pk.cvwizard.MainActivity
import com.pk.cvwizard.models.UserProfile
import com.pk.cvwizard.repository.UserDataRetriver
import com.pk.cvwizard.templatechooser.TemplateChooser


class LoginVM(application: Application) : AndroidViewModel(application) {


    private lateinit var mUserDataRetriver: UserDataRetriver
     val userProfile: MutableLiveData<UserProfile> by lazy {
         MutableLiveData<UserProfile>()
     }


    fun initLinkedInManager(activity: Activity){
         mUserDataRetriver =  UserDataRetriver(activity)
     }


    fun getUserProfile(){
         mUserDataRetriver.getUserProfile()
     }

    fun regularLogin(){
        val loginIntent = Intent(getApplication(), TemplateChooser::class.java)
        ContextCompat.startActivity(getApplication(),loginIntent,null)
    }

}