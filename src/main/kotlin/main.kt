fun main(args: Array<String>) {
    // una llamada normal a una funcion
    println(nroPar(5))

    /* crearemos un Array, segun la ayuda:

    public constructor Array<T>(
    size: Int,
    init: (Int) → T
    )
    Creates a new array with the specified size,
    where each element is calculated by calling the specified init function.
    The function init is called for each array element sequentially starting from the first one.
    It should return the value for an array element given its index.
    Devuelve el valor del elemento segun el indice
    */

    val numerosPares = Array<Int>(10, {s: Int -> s * 2})

    // digievolucion 1: sin tipo de datos
    val numerosParesEvolucion1 = Array(10, {s -> s * 2})

    // digievolucion 2: como solo recibe un parametro puedo utilizar 'it'
    val numerosParesEvolucion2 = Array(10, {it -> it * 2})

    // digievolucion 3: como solo recibe un parametro puedo omitir parametro de entrada y operados lambda '->'
    val numerosParesEvolucion3 = Array(10, {it * 2})

    // digievolución 4: funcoin lambda con varias lineas
    // IMPORTANTE: la última linea es la que se toma como el valor devuelto
    val numerosParesEvolucion4 = Array(10, {
        var nuevoIndice = it + 10
        if(it<5) nuevoIndice * 2 else nuevoIndice
        1 // meto solo unos!!!
    })

    // imprimimos el Array
    for (numero in numerosPares){
        print("$numero ") //0 2 4 6 8 10 12 14 16 18
    }
    println()
    for (numero in numerosParesEvolucion1){
        print("$numero ") //0 2 4 6 8 10 12 14 16 18
    }
    println()
    for (numero in numerosParesEvolucion3){
        print("$numero ") //0 2 4 6 8 10 12 14 16 18
    }
    println()
    for (numero in numerosParesEvolucion4){
        println("$numero ") //0 2 4 6 8 10 12 14 16 18
    }


    // Ejemplo de tipo lambda
    // La variable es de tipo funcion
    // una funcion que recibe dos String y devuelve una
    var nombreCompleto: (String, String) -> String = { nombre: String, apellido: String -> "$nombre $apellido"}
    println(nombreCompleto("d","n"))
    // utilizando 'invoke'
    nombreCompleto = { nombre: String, apellido: String -> "$nombre + $apellido"}
    println(nombreCompleto.invoke("d","n"))

}

/**
 * Forma tradicional. Devuelve un numero par
 * @param s valor al que queremos hacer par
 * @return valor recibido por dos
 */
fun nroPar(s: Int): Int {
    return s * 2
}

// equivalente lambda
// {param1: Tipo, param2: Tipo, ... -> result: Tipo}
// {s: Int -> s * 2}
