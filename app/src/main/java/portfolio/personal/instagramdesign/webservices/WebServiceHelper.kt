package portfolio.personal.instagramdesign.webservices

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import portfolio.personal.instagramdesign.App
import portfolio.personal.instagramdesign.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

public class WebServiceHelper
{

    private val baseUrl = App.getAppInstance()!!.getString(R.string.base_url)

    private fun getClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .readTimeout(100, TimeUnit.SECONDS)
            .connectTimeout(100, TimeUnit.SECONDS)
            .build()
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(getClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}