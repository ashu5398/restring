package dev.b3nedikt.restring.example

import android.content.Context
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import dev.b3nedikt.restring.Restring
import dev.b3nedikt.viewpump.ViewPumpContextWrapper

abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(Restring.wrapContext(newBase))
    }

    override fun getResources(): Resources {
        return Restring.wrapContext(baseContext).resources
    }

}
