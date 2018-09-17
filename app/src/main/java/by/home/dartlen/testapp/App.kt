package by.home.dartlen.testapp

import android.os.SystemClock
import android.app.Application
import java.util.concurrent.TimeUnit


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3))
    }
}