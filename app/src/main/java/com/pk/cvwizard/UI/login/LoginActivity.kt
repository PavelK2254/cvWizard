package com.pk.cvwizard.UI.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.pk.cvwizard.R
import com.pk.cvwizard.models.UserProfile
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){



    private var mViewModel: LoginVM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        this.supportActionBar!!.hide()
        initListeners()
        initViewModel()

        val userDataObserver = Observer<UserProfile> {
          //  regular_login.setText(it.firstName);
        }
        mViewModel!!.userProfile.observe(this,userDataObserver)
    }

    private fun initListeners() {
        linkedin_login.setOnClickListener {
            mViewModel!!.getUserProfile()
        }

        regular_login.setOnClickListener {
            mViewModel!!.regularLogin()
        }
    }


    private fun initViewModel() {
       mViewModel = ViewModelProviders.of(this)
           .get(LoginVM::class.java)
        mViewModel!!.initLinkedInManager(this)
    }


}
