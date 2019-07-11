package com.omni.alcchallengeone.features

import android.content.Intent
import com.omni.alcchallengeone.features.about.AboutActivity
import com.omni.alcchallengeone.features.home.MainActivity
import com.omni.alcchallengeone.features.profile.ProfileActivity

fun MainActivity.navigateToAboutACtivity() {
    val intent = Intent(this@navigateToAboutACtivity ,AboutActivity::class.java)
    startActivity(intent)
}

fun MainActivity.navigateToProfileACtivity() {
    val intent = Intent(this@navigateToProfileACtivity ,ProfileActivity::class.java)
    startActivity(intent)
}