package moc.nahba.koin

import moc.nahba.core.Manager

internal class Repository(private val manager: Manager) {
    fun getName(): String = manager.getName()
}