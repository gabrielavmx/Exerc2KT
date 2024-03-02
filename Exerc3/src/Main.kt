//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E>
{
    val listaFiltrada = ArrayList<E>()
    for (e in lista)
    {
        if(filtro(e))
        {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean
{
    return nome.length == 3
}

fun main(args: Array<String>)
{
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
}