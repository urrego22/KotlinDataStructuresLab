// Reto 1: Control de Gastos Diarios
fun reto1(): String {
    val gastos = arrayOf(12.5, 45.0, 8.75, 30.0, 22.0, 15.5, 9.0, 60.0, 14.0, 33.0,
        25.5, 18.0, 42.0, 5.0, 11.0)
    val total = gastos.reduce { acc, d -> acc + d }
    val promedio = total / gastos.size
    var maximo = gastos[0]; var minimo = gastos[0]
    for (g in gastos) { if (g > maximo) maximo = g; if (g < minimo) minimo = g }
    return "Total: $total | Promedio: $promedio | Max: $maximo | Min: $minimo"
}

// Reto 2: Filtro de Empleados Senior
fun reto2(): List<String> {
    val empleados = listOf(Pair("Ana", 35), Pair("Luis", 28), Pair("Maria", 42),
        Pair("Carlos", 25), Pair("Sofia", 31), Pair("Pedro", 55))
    return empleados.filter { it.second > 30 }.map { it.first.uppercase() }
}

// Reto 3: Limpieza de Contactos Duplicados
fun reto3(): List<String> {
    val telefonos = listOf("123","456","123","789","456","321","789","000","123","456",
        "111","222","333","123","000","456","789","321","111","222")
    return telefonos.toSet().sorted()
}

// Reto 4: Análisis de Carrito de Compras
fun reto4(): Map<String, Int> {
    val productos = listOf("Manzana","Pan","Leche","Manzana","Pan","Manzana","Jugo","Leche")
    val carrito = mutableMapOf<String, Int>()
    for (p in productos) { carrito[p] = (carrito[p] ?: 0) + 1 }
    return carrito
}

// Reto 5: Historial de Navegación Reversible
fun reto5(): Array<String> {
    val historial = arrayOf("google.com","youtube.com","github.com","stackoverflow.com","reddit.com")
    val resultado = Array(historial.size) { "" }
    for (i in historial.indices) { resultado[i] = historial[historial.size - 1 - i] }
    return resultado
}

// Reto 6: Compatibilidad de Intereses
fun reto6(): String {
    val persona1 = setOf("fútbol","música","viajes","cocina","lectura")
    val persona2 = setOf("música","gaming","viajes","arte","fútbol")
    val comunes = persona1.intersect(persona2)
    val exclusivos = persona1.subtract(persona2)
    return "Comunes: $comunes | Exclusivos persona1: $exclusivos"
}

// Reto 7: Inventario de Despensa
fun reto7(): String {
    val despensa = mutableMapOf("Arroz" to 5, "Aceite" to 2, "Pasta" to 8, "Sal" to 1, "Azúcar" to 3)
    despensa["Arroz"] = (despensa["Arroz"] ?: 0) - 2
    despensa["Sal"] = (despensa["Sal"] ?: 0) - 1
    val agotados = despensa.filter { it.value <= 0 }
    agotados.forEach { despensa.remove(it.key) }
    return "Inventario: $despensa | Agotados: ${agotados.keys}"
}

// Reto 8: Promedio Académico Ponderado
fun reto8(): Double {
    val notas = listOf(Pair(4.5,0.3), Pair(3.8,0.2), Pair(4.0,0.25), Pair(4.2,0.15), Pair(3.5,0.1))
    var total = 0.0
    for (n in notas) { total += n.first * n.second }
    return total
}

// Reto 9: Traductor de Códigos de País
fun reto9(): String {
    val paises = mapOf("CO" to "Colombia", "US" to "Estados Unidos",
        "MX" to "México", "BR" to "Brasil", "AR" to "Argentina")
    return paises.entries.joinToString("\n") { "El código [${it.key}] pertenece a [${it.value}]" }
}

// Reto 10: Rotación de Turnos
fun reto10(k: Int): List<String> {
    val e = mutableListOf("Ana","Luis","Maria","Carlos","Sofia","Pedro","Juan")
    val p = k % e.size
    return e.subList(p, e.size) + e.subList(0, p)
}

// Reto 11: Organizador de Maleta
fun reto11(): Map<Int, List<String>> {
    val objetos = listOf("Camisa" to 1,"Zapatos" to 3,"Pantalon" to 2,"Libro" to 1,
        "Laptop" to 4,"Cargador" to 1,"Abrigo" to 3)
    val maleta = mutableMapOf<Int, MutableList<String>>()
    for ((obj, peso) in objetos) { maleta.getOrPut(peso) { mutableListOf() }.add(obj) }
    return maleta
}

// Reto 12: Verificador de Ruta Reversible
fun reto12(): String {
    val ruta = listOf("A","B","C","D","C","B","A")
    return "Ruta: $ruta | Es espejo: ${ruta == ruta.reversed()}"
}

// Reto 13: Reparto por Camión (chunks de 10)
fun reto13(): List<List<Int>> {
    val paquetes = (1..50).toList()
    val lotes = mutableListOf<List<Int>>()
    var i = 0
    while (i < paquetes.size) { lotes.add(paquetes.subList(i, minOf(i+10, paquetes.size))); i += 10 }
    return lotes
}

// Reto 14: Ticket Único (aparece solo una vez)
fun reto14(): List<Int> {
    val tickets = listOf(101,202,303,101,404,202,505,606,303,707,808)
    return tickets.filter { t -> tickets.count { it == t } == 1 }
}

// Reto 15: IVA Selectivo (> $50.000)
fun reto15(): Map<String, Double> {
    val precios = mapOf("TV" to 80000.0,"Celular" to 45000.0,"Laptop" to 120000.0,
        "Auriculares" to 30000.0,"Tablet" to 60000.0)
    return precios.mapValues { if (it.value > 50000) it.value * 1.19 else it.value }
}

// Reto 16: Eliminar sensores múltiplos de 3
fun reto16(): MutableList<Int> {
    val sensores = mutableListOf(1,2,3,4,5,6,7,8,9,10,12,15,18,21,24,27)
    sensores.removeAll { it % 3 == 0 }
    return sensores
}

// Reto 17: Diagonales de Almacén 4x4
fun reto17(): String {
    val m = arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8),
        intArrayOf(9,10,11,12), intArrayOf(13,14,15,16))
    var d1 = 0; var d2 = 0
    for (i in m.indices) { d1 += m[i][i]; d2 += m[i][m.size-1-i] }
    return "Diagonal principal: $d1 | Diagonal secundaria: $d2"
}

// Reto 18: Fusión de Recetas
fun reto18(): Map<String, Double> {
    val chef1 = mapOf("Harina" to 2.5,"Azúcar" to 1.0,"Huevos" to 3.0,"Leche" to 0.5)
    val chef2 = mapOf("Harina" to 1.5,"Mantequilla" to 0.75,"Huevos" to 2.0,"Sal" to 0.1)
    val compras = mutableMapOf<String, Double>()
    for ((k,v) in chef1) compras[k] = (compras[k] ?: 0.0) + v
    for ((k,v) in chef2) compras[k] = (compras[k] ?: 0.0) + v
    return compras
}

// Reto 19: Ranking Top 10 Apps (bubble sort manual)
fun reto19(): List<Pair<String, Double>> {
    val apps = mutableListOf(Pair("WhatsApp",4.2),Pair("Instagram",3.8),Pair("TikTok",4.5),
        Pair("Spotify",4.7),Pair("Gmail",4.1),Pair("YouTube",4.6),
        Pair("Maps",4.3),Pair("Netflix",4.4),Pair("Uber",3.9),Pair("Duolingo",4.8))
    for (i in 0 until apps.size-1)
        for (j in 0 until apps.size-1-i)
            if (apps[j].second < apps[j+1].second) { val t=apps[j]; apps[j]=apps[j+1]; apps[j+1]=t }
    return apps
}

// Reto 20: Unión de Agendas sin .sort()
fun reto20(): List<String> {
    val agenda1 = listOf("Carlos","Ana","Mario")
    val agenda2 = listOf("Sofia","Ana","Luis","Pedro")
    val union = mutableListOf<String>()
    union.addAll(agenda1)
    for (n in agenda2) { if (!union.contains(n)) union.add(n) }
    for (i in 1 until union.size) {
        val key = union[i]; var j = i-1
        while (j >= 0 && union[j] > key) { union[j+1]=union[j]; j-- }
        union[j+1] = key
    }
    return union
}

// Reto 21: Pisos primos (1-100) con Array
fun reto21(): Array<String> {
    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) { if (n % i == 0) return false }
        return true
    }
    return (1..100).filter { esPrimo(it) }.map { "Mantenimiento piso $it" }.toTypedArray()
}

// Reto 22: Pila LIFO de platos
fun reto22(): String {
    val pila = mutableListOf("Plato1","Plato2","Plato3","Plato4")
    val inicial = pila.toList().toString()
    val lavado = pila.removeAt(pila.size - 1)
    return "Inicial: $inicial | Lavado: $lavado | Restante: $pila"
}

// Reto 23: Diferencia calorías vs promedio anterior
fun reto23(): List<Double> {
    val calorias = listOf(2000.0,1800.0,2200.0,1900.0,2100.0,1700.0,2300.0)
    val difs = mutableListOf<Double>()
    for (i in 1 until calorias.size) { difs.add(calorias[i] - calorias.subList(0,i).average()) }
    return difs
}

// Reto 24: Balanceo de contenedores { [ ( ) ] }
fun reto24(): Boolean {
    val manifiesto = "{ [ () ] { } }"
    val pila = mutableListOf<Char>()
    val cierra = mapOf('}' to '{', ']' to '[', ')' to '(')
    for (c in manifiesto) {
        when {
            c in setOf('{','[','(') -> pila.add(c)
            c in cierra -> {
                if (pila.isEmpty() || pila.last() != cierra[c]) return false
                pila.removeAt(pila.size-1)
            }
        }
    }
    return pila.isEmpty()
}

// Reto 25: Promedio sin outliers (más rápido y más lento)
fun reto25(): Double {
    val tiempos = listOf(240.0,185.0,210.0,195.0,500.0,202.0,198.0,10.0,215.0,220.0)
    val sorted = tiempos.sorted()
    return sorted.subList(1, sorted.size-1).average()
}

// Reto 26: Compresión de logs RLE
fun reto26(): List<Pair<String, Int>> {
    val estados = listOf("UP","UP","UP","DOWN","DOWN","UP","UP","DOWN","DOWN","DOWN")
    val comp = mutableListOf<Pair<String, Int>>()
    var i = 0
    while (i < estados.size) {
        var c = 1
        while (i+c < estados.size && estados[i+c] == estados[i]) c++
        comp.add(Pair(estados[i], c)); i += c
    }
    return comp
}

// Reto 27: Vendedores sobre el promedio
fun reto27(): List<String> {
    val ventas = mapOf("Juan" to 8500.0,"Maria" to 12000.0,"Carlos" to 6000.0,
        "Sofia" to 15000.0,"Pedro" to 9500.0)
    val promedio = ventas.values.average()
    return ventas.filter { it.value > promedio }.keys.toList()
}

// Reto 28: Tarifas de Parking 1–10 horas
fun reto28(): Map<Int, Double> {
    val tarifas = mutableMapOf<Int, Double>()
    for (h in 1..10) {
        tarifas[h] = when {
            h <= 1 -> 3000.0
            h <= 3 -> 3000.0 + (h-1) * 2000.0
            h <= 6 -> 7000.0 + (h-3) * 1500.0
            else   -> 11500.0 + (h-6) * 1000.0
        }
    }
    return tarifas
}

// Reto 29: Parejas de maletas que suman target
fun reto29(target: Int): List<Pair<Int, Int>> {
    val pesos = listOf(10,15,20,25,30,35,40,45)
    val parejas = mutableListOf<Pair<Int,Int>>()
    val usados = mutableSetOf<Int>()
    for (i in pesos.indices) for (j in i+1 until pesos.size) {
        if (pesos[i]+pesos[j] == target && i !in usados && j !in usados) {
            parejas.add(Pair(pesos[i],pesos[j])); usados.add(i); usados.add(j)
        }
    }
    return parejas
}

// Reto 30: Transponer matriz 3x2 → 2x3
fun reto30(): Array<IntArray> {
    val plano = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    val f = plano.size; val c = plano[0].size
    val t = Array(c) { IntArray(f) }
    for (i in 0 until f) for (j in 0 until c) { t[j][i] = plano[i][j] }
    return t
}