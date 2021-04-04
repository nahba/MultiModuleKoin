package moc.nahba.koin

import android.app.Application
import moc.nahba.core.ManagerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class Nahba: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Nahba)
            modules(
                    listOf(
                            ManagerModule, RepositoryModule
                    )
            )
        }
    }
}