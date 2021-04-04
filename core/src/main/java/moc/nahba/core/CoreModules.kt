package moc.nahba.core

import org.koin.dsl.module

private fun provideDataSource() = DataSource()
private fun provideManager(dataSource: DataSource) = Manager(dataSource)
val ManagerModule = module(override = true, createdAtStart = true) {
    single { provideDataSource() }
    single { provideManager(get()) }
}