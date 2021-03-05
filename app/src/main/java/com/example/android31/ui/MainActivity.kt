package com.example.android31.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android31.databinding.ActivityMainBinding
import com.example.android31.mvp.presenter.MainPresentor
import com.example.android31.mvp.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null

    val presenter = MainPresentor(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener1 = View.OnClickListener {
            presenter.counterClickFirst(it.id)
        }
        val listener2 = View.OnClickListener {
            presenter.counterClickSecond(it.id)
        }
        val listener3 = View.OnClickListener {
            presenter.counterClickThird(it.id)
        }

        vb?.btnCounter1?.setOnClickListener(listener1)
        vb?.btnCounter2?.setOnClickListener(listener2)
        vb?.btnCounter3?.setOnClickListener(listener3)
    }

    override fun setButtonTextFirstButton(index: Int, text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setButtonTextSecondButton(index: Int, text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setButtonTextThirdButton(index: Int, text: String) {
        vb?.btnCounter3?.text = text
    }

}