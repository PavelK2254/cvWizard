package com.pk.cvwizard.UI.templatechooser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pk.cvwizard.R
import kotlinx.android.synthetic.main.activity_template_chooser.*

class TemplateChooser : AppCompatActivity() {

    private lateinit var mViewManager: RecyclerView.LayoutManager
    private lateinit var mViewAdapter: TemplateChooserAdapter
    private lateinit var mViewModel: TemplateChooserVM



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_template_chooser)
        initViewModel()
        initRecyclerView()
    }

    private fun initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(TemplateChooserVM::class.java)
    }

    private fun initRecyclerView() {
        template_chooser_view.setHasFixedSize(true)
        mViewManager = GridLayoutManager(this,3,RecyclerView.VERTICAL,false)
        mViewAdapter = TemplateChooserAdapter(mViewModel.mImageSet)
        template_chooser_view.layoutManager = mViewManager
        template_chooser_view.adapter = mViewAdapter
        mViewAdapter.setOnItemClickListener(object : TemplateChooserAdapter.ClickListener {
            override fun onClick(pos: Int, aView: View) {
                mViewModel.onItemClicked()
            }
        })



    }
}
