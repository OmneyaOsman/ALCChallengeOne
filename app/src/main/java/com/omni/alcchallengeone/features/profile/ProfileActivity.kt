package com.omni.alcchallengeone.features.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.omni.alcchallengeone.R
import kotlinx.android.synthetic.main.toolbar_layout.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
