package com.omni.alcchallengeone.features.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.omni.alcchallengeone.R
import com.omni.alcchallengeone.features.navigateToAboutACtivity
import com.omni.alcchallengeone.features.navigateToProfileACtivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        about_alc_button.setOnClickListener { navigateToAboutACtivity() }
        profile_button.setOnClickListener { navigateToProfileACtivity() }

    }
}
