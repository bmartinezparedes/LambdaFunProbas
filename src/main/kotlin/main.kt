fun main(args: Array<String>) {

    // Ejemplo pasar funcion por parámetro a otra función

    // Definimos una función que recibe un entero y una string y 'hace algo diferente a lo anterior'
    /**
     * Extrae un caracter de una cadena
     * @param indice para extraer un contador
     * @param cadena que queremos extraer un caracter
     * @return la subcadena extraida
     */
    fun utilizoEnteroSobreString( indice: Int, cadena: String): String {
        // quito el caracter del indice pasado por parámetro
        val nuevaCadena: String = cadena.replace(cadena[indice].toString(),"")
        // devuelvo el valor
        return nuevaCadena
    }

    // Utilizamos esta funcion con dos ejemplos

    println(utilizoEnteroSobreString(2, "hola"))
    // salida: hoa

    println(utilizoEnteroSobreString(5, "murcielago"))
    // salida: murcilago

}
