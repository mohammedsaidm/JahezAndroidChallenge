package net.jahez.jahezchallenge.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import net.jahez.jahezchallenge.R
import net.jahez.jahezchallenge.databinding.ActivitySplashScreenBinding

class HomeScreenActivity : BaseActivity() {
    private val SPLASH_DISPLAY_LENGTH = 3500
    var binding: ActivitySplashScreenBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)

        Handler().postDelayed({
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())


    }
}