import kotlin.random.Random//SE IMPORTAN LAS LIBRERIAS A UTILIZAR
import kotlin.random.nextInt

fun main(){//FUNCION PRINCIPAL

    numeroRamdom()//FUNCION A LLAMAR PARA QUE SE RECORRA

}

    fun numeroRamdom() {//FUNCION DE NUMEROS ALEATORIOS
        val numeros = Random//USO DE LIBRERIA RAMDOM DE KOTLIN


        val ListaMuteable = MutableList(30) {//SE CREA UNA LISTA MUTEABLE DE N VALORES
            val num: Int = numeros.nextInt(20)+1//SE PONEN LOS PARAMETROS DE LOS NUMEROS A ELEGIR
            println("Posicion $it: $num")//SE INPRIMEN LOS NUMEROS (OPCIONAL)

            if (num == 5) {//SE CREA UNA SENTENCIA EN DONDE SE BUSCA EL NUMERO 5
                println("La Posicion $it: es 5")//SE APLICA LA ACCION PARA CONCLUIR ESTA
            }
        }
    }






