import kotlin.random.Random

fun main() {
    //MODO DE CREAR UNA LISTA NORMAL
    val listaNormal = listOf("Francisco", "Antonio", "Rosas", "Carrillo")//NO SE PUEDEN AÑADIR MAS DATOS A LA LISTA NORMAL


    //OPCION 1 INTRODUCIR MANUALMENTE LOS CAMPOS A LLENAR
    val listaMuteable = mutableListOf("1", "2", "3", "4")
    listaMuteable.add("5")

    listaMuteable.forEach{//SE UTILIZA UN CICLO PARA RECORRER LA LISTA MUTEABLE
        println(it)
}

    //OPCION 2 CREAR AUTOMATICAMENTE LOS CAMPOS A LLENAR
    val ListaMuteable = MutableList(20){//CANTIDAD DE VALORES A LLENAR
        "NOMBRE $it"//SE PONE

    }

    ListaMuteable.forEach{
        println(it)
    }



}



