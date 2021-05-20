fun main(args: Array<String>) {

    // Ejemplo pasar funcion por parámetro a otra función

    // Definimos una función que recibe un entero y una string y 'hace algo'
    /**
     * Extrae una substring a partir de una cadena
     * @param indice a partir se extrae la subcadena
     * @param cadena que queremos extraer la subcadena
     * @return la subcadena extraida
     */
    fun utilizoEnteroSobreString( indice: Int, cadena: String): String {
        // extraigo la subcadena a partir del indice pasado por parámetro
        val nuevaCadena: String = cadena.substring(indice)
        // devuelvo el valor
        return nuevaCadena
    }

    // Utilizamos esta funcion con dos ejemplos

    println(utilizoEnteroSobreString(2, "hola"))
    // salida: la

    println(utilizoEnteroSobreString(5, "murcielago"))
    // salida: elago

}
