package com.pk.cvwizard.models

import java.io.Serializable

data class UserProfile(val firstName:String,
                       val headline:String,
                       val id:String,
                       val lastName:String,
                       val siteStandardProfileRequest: ProfileRequest
                       ) {


}