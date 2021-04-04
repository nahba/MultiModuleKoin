package moc.nahba.koin

import moc.nahba.core.Manager
import org.koin.dsl.module

private fun provideRepository(manager: Manager) = Repository(manager)
val RepositoryModule = module(override = true, createdAtStart = true) {
    factory { provideRepository(get()) }
}