//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("=== Reto 1: Gastos Diarios ===")
    println(reto1())

    println("\n=== Reto 2: Empleados Senior ===")
    println(reto2())

    println("\n=== Reto 3: Contactos Únicos ===")
    println(reto3())

    println("\n=== Reto 4: Carrito de Compras ===")
    println(reto4())

    println("\n=== Reto 5: Historial Invertido ===")
    println(reto5().toList())

    println("\n=== Reto 6: Match de Intereses ===")
    println(reto6())

    println("\n=== Reto 7: Despensa ===")
    println(reto7())

    println("\n=== Reto 8: Nota Final: ${reto8()} ===")

    println("\n=== Reto 9: Países ===")
    println(reto9())

    println("\n=== Reto 10: Rotación k=2 ===")
    println(reto10(2))

    println("\n=== Reto 11: Maleta por Peso ===")
    println(reto11())

    println("\n=== Reto 12: Ruta Espejo ===")
    println(reto12())

    println("\n=== Reto 13: Lotes por Camión ===")
    reto13().forEachIndexed { i, l -> println("Camión ${i+1}: $l") }

    println("\n=== Reto 14: Tickets Únicos ===")
    println(reto14())

    println("\n=== Reto 15: Precios con IVA ===")
    println(reto15())

    println("\n=== Reto 16: Sensores válidos ===")
    println(reto16())

    println("\n=== Reto 17: Diagonales ===")
    println(reto17())

    println("\n=== Reto 18: Lista de Compras Fusionada ===")
    println(reto18())

    println("\n=== Reto 19: Top 10 Apps ===")
    reto19().forEach { println("${it.first}: ${it.second}") }

    println("\n=== Reto 20: Agenda Unificada ===")
    println(reto20())

    println("\n=== Reto 21: Pisos con Mantenimiento ===")
    println(reto21().toList())

    println("\n=== Reto 22: Pila de Platos ===")
    println(reto22())

    println("\n=== Reto 23: Diferencias Calóricas ===")
    println(reto23())

    println("\n=== Reto 24: Contenedores Balanceados: ${reto24()} ===")

    println("\n=== Reto 25: Promedio Real Maratón: ${reto25()} ===")

    println("\n=== Reto 26: Logs Comprimidos ===")
    println(reto26())

    println("\n=== Reto 27: Vendedores con Bono ===")
    println(reto27())

    println("\n=== Reto 28: Tarifas Parking ===")
    reto28().forEach { println("${it.key} horas: ${it.value}") }

    println("\n=== Reto 29: Parejas (target=55) ===")
    println(reto29(55))

    println("\n=== Reto 30: Layout Transpuesto ===")
    reto30().forEach { println(it.toList()) }
}