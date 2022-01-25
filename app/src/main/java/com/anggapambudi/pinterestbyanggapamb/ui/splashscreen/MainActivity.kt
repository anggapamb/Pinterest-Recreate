package com.anggapambudi.pinterestbyanggapamb.ui.splashscreen

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.anggapambudi.pinterestbyanggapamb.R
import com.anggapambudi.pinterestbyanggapamb.databinding.ActivityMainBinding
import com.anggapambudi.pinterestbyanggapamb.ui.login.LoginActivity
import com.anggapambudi.pinterestbyanggapamb.ui.signup.SignUpActivity
import com.crocodic.core.base.activity.NoViewModelActivity
import com.crocodic.core.extension.openActivity
import com.crocodic.core.extension.tos
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : NoViewModelActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLayoutRes(R.layout.activity_main)

        //fullscreen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

    }

    override fun onClick(v: View?) {

        when (v) {
            binding.btnSignup -> openActivity<SignUpActivity>()
            binding.btnLogin -> openActivity<LoginActivity>()
        }


        super.onClick(v)
    }
}