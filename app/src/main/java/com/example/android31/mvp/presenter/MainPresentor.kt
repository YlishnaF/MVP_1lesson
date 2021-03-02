package com.example.android31.mvp.presenter

import com.example.android31.R
import com.example.android31.mvp.model.CountersModel
import com.example.android31.mvp.view.MainView

class MainPresentor(val mainView: MainView) {

    val model = CountersModel()

    fun counterClick(id: Int){
        when(id){
            R.id.btn_counter1 -> {
                val nextValue = model.next(0)
                mainView.setButtonText(0, nextValue.toString())
            }
            R.id.btn_counter2 -> {
                val nextValue = model.next(1)
                mainView.setButtonText(1, nextValue.toString())
            }
            R.id.btn_counter3 -> {
                val nextValue = model.next(2)
                mainView.setButtonText(2, nextValue.toString())
            }
        }
    }
}