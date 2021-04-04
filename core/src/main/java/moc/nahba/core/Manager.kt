package moc.nahba.core

class Manager(private val dataSource: DataSource) {
    fun  getName() : String = dataSource.getName()
}