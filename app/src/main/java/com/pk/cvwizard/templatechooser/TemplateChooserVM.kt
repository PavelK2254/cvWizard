package com.pk.cvwizard.templatechooser

import android.app.Application
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.lifecycle.AndroidViewModel
import com.pk.cvwizard.MainActivity
import com.pk.cvwizard.R
import com.pk.cvwizard.interfaces.ITemplateClickListener

class TemplateChooserVM(application: Application) : AndroidViewModel(application), ITemplateClickListener{


     var mImageSet = arrayListOf(R.drawable.cv1,R.drawable.cv11,R.drawable.cv110
     ,R.drawable.cv111,R.drawable.cv112,R.drawable.cv113,R.drawable.cv114,R.drawable.cv115
     ,R.drawable.cv116,R.drawable.cv117
     )

     override fun onItemClicked() {
          val loginIntent = Intent(getApplication(), MainActivity::class.java)
          ContextCompat.startActivity(getApplication(),loginIntent,null)
     }

}