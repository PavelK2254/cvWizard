package com.pk.cvwizard.repository

import android.app.Activity
import com.pk.cvwizard.api.LinkedInAPi

class UserDataRetriver(activity: Activity) {



    private var mLinkedInAPi: LinkedInAPi
    private val TAG = "Network Response"
    private val mActivity = activity
    init {
        mLinkedInAPi = LinkedInAPi()
    }


   fun getUserProfile(){
       mLinkedInAPi.getUserProfile()
   }


}