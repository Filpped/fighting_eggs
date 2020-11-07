package com.example.fighting_eggs

import android.app.Application
import cn.bmob.v3.Bmob

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Bmob.initialize(this, "6af70467cb300af7978fc865b426021b");


    }
}