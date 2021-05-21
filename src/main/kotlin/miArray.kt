import kotlin.random.Random

class miArray(size: Int, prototipo:(Int)->Int){
    //Array con la funcion del constructor
    var elArray:Array<Int> =Array<Int>(size,prototipo)
    //Array con un tamaño de 10 que mete valores entre 50 y 250
    var randomArray: Array <Int> = Array <Int> (10){Random.nextInt(50,250)}
}
