import java.util.HashMap

fun <K, V> buildMutableMap(put : HashMap<K, V>.() -> Unit): HashMap<K, V> {
    val map : HashMap<K, V> = HashMap()
    map.put()
    return map
}

fun usage(): Map<Int, String> {
    return buildMutableMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
