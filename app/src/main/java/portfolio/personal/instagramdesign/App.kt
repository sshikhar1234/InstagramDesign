package portfolio.personal.instagramdesign

import android.app.Application
import com.example.instagram.ui.fragments.BaseFragment

open class App : Application()
{
    companion object {
        fun getAppInstance(): App? {
            return App()
        }
    }


}