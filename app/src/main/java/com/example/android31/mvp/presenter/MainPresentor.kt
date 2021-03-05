package com.example.android31.mvp.presenter

import android.util.Log
import com.example.android31.mvp.model.CountersModel
import com.example.android31.mvp.view.MainView

class MainPresentor(val mainView: MainView) {

    val model = CountersModel()

    fun counterClickFirst(id: Int) {
        val nextValue = model.next(0)
        mainView.setButtonTextFirstButton(0, nextValue.toString())
    }

    fun counterClickSecond(id: Int) {
        val nextValue = model.next(1)
        mainView.setButtonTextSecondButton(1, nextValue.toString())
    }

    fun counterClickThird(id: Int) {
        val nextValue = model.next(2)
        mainView.setButtonTextThirdButton(2, nextValue.toString())
    }
}