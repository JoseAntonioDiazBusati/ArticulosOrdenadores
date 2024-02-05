open class Articulo(val nombre:String, var precio:Double) {
    private val id= (++total)
    companion object{
        private var total = 0
        private fun generarId() = (++total)
    }
    open fun

    override fun toString(): String {
        return "$nombre --- ${precio}€ (ID:${id})"
    }
}