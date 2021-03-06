import java.lang.NumberFormatException

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

    // Definimos una función que además de recibir un entero y una cadena
    // recibe la función que utilizará

    /**
     * Realiza 'algo' con un entero y una cadena
     * @param indice entero que utilizaré en la función
     * @param cadena que utilizaré en la función
     * @param paramFuncion función que hará algo con un entero y una cadena y devolverá una cadena
     */
    fun utilizoEnteroSobreStringFlexible( indice: Int, cadena: String, paramFuncion: (Int, String) -> String): String {
        var nuevaCadena = paramFuncion(indice, cadena)
        return nuevaCadena
    }

    // Utilizamos esta nueva función pasándole una lambda que extraiga una substring

    println(utilizoEnteroSobreStringFlexible (2, "adios", {i: Int, c: String -> c.substring(i)}))
    // salida: ios

    // Utilizamos esta nueva función pasándole 'otra' lambda diferente
    println(utilizoEnteroSobreStringFlexible(5, "machupichu", {i: Int, c: String -> c.replace(c[i].toString(),"")}))
    // salida: machuichu

    // También podemos definir una función más extensa y pasársela
    // respetando los param y el return
    val miLambdaExtensa: (Int, String) -> String =
        {i: Int, c: String ->
            print("1->Capitaliza 2->Todo a mayúscula: ")
            val peticion = try {
                readLine()?.toInt()
            } catch (_: NumberFormatException) {
                1
            }
            if (peticion == 1) {
                c.capitalize()
            }
            else {
                c.toUpperCase()
            }
        }
    // le pasamos la funcion miLambdaExtensa
    println(utilizoEnteroSobreStringFlexible(1, "extensión", miLambdaExtensa))

    val miArray= miArray(10){it*6}


}
