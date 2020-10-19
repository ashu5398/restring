package dev.b3nedikt.restring.example

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dev.b3nedikt.app_locale.AppLocale
import dev.b3nedikt.restring.Restring
import dev.b3nedikt.restring.example.databinding.ActivityMainBinding
import java.util.*


class MainActivity : BaseActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppLocaleLocaleProvider.currentLocale = Locale.ENGLISH

        binding  = DataBindingUtil.setContentView(this,R.layout.activity_main)

        AppLocale.supportedLocales.forEach { locale ->
            Restring.putStrings(locale, SampleStringsGenerator.getStrings(locale))
            Restring.putQuantityStrings(locale, SampleStringsGenerator.getQuantityStrings(locale))
            Restring.putStringArrays(locale, SampleStringsGenerator.getStringArrays(locale))
        }

        /*if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment())
                    .commitNow()
        }*/
    }
}
