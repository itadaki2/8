import java.util.Scanner
// Здесь собраны все задания

// Функции для всех заданий
fun summa(spisok: List<Int>) = spisok.sum()
fun raznostMinMax(spisok: List<Int>) = spisok.maxOrNull()!! - spisok.minOrNull()!!
fun obyedinenie(spisok1: List<Int>, spisok2: List<Int>) = spisok1 + spisok2
fun isVygodno(prob: Double, prize: Double, pay: Double) = prob * prize > pay
fun summaMenee100(chislo1: Int, chislo2: Int) = (chislo1 + chislo2) < 100
fun delitsyaNa100(chislo: Int) = chislo % 100 == 0
fun kolichestvoKadrov(minuty: Int, fps: Int) = minuty * 60 * fps
fun proverkaStepeni(k: Int, n: Int) = Math.pow(k.toDouble(), k.toDouble()).toInt() == n
fun repetition(txt: String, n: Int) = txt.repeat(n)
fun equation(uravnenie: String): Int {
    val parts = uravnenie.split("+", "-", "*", "/").map { it.toInt() }
    return parts.reduce { acc, next -> acc + next }
}
fun google(number: Int) = "G" + "o".repeat(number) + "gle"
fun privetMiry() = println("Привет, мир!")
fun summaDvuh(chislo1: Int, chislo2: Int) = chislo1 + chislo2
fun bolsheeChislo(chislo1: Int, chislo2: Int) = if (chislo1 > chislo2) chislo1 else chislo2
fun chetnoeChislo(chislo: Int) = chislo % 2 == 0
fun factorial(chislo: Int): Int = if (chislo == 0) 1 else chislo * factorial(chislo - 1)
fun prostoeChislo(chislo: Int): Boolean {
    if (chislo < 2) return false
    for (i in 2 until chislo) if (chislo % i == 0) return false
    return true
}
fun summaMassiva(massiv: List<Int>) = massiv.sum()
fun maksimalnoeChislo(massiv: List<Int>) = massiv.maxOrNull()!!
fun sortirovkaMassiva(massiv: List<Int>) = massiv.sorted()
fun palindrom(stroka: String) = stroka.replace("\\s".toRegex(), "").lowercase() == stroka.reversed()
fun kolichestvoSimvolov(stroka: String) = stroka.length
fun vVerhniyRegistr(stroka: String) = stroka.uppercase()
fun obyedinenieStrok(stroka1: String, stroka2: String) = stroka1 + stroka2
fun posledniyElement(massiv: List<Int>) = massiv.last()
fun nalichieElementa(massiv: List<Int>, element: Int) = element in massiv
fun massivOt1DoN(n: Int) = (1..n).toList()
fun maxMinMassiv(massiv: List<Int>) = Pair(massiv.maxOrNull()!!, massiv.minOrNull()!!)
fun summaOt1DoN(n: Int) = (1..n).sum()
fun celsiusVFahrenheit(celsius: Double) = celsius * 9 / 5 + 32
fun obratniyPoryadok(stroka: String) = stroka.reversed()
fun poiskPoIndeksu(massiv: List<Int>, index: Int) = massiv.getOrNull(index) ?: throw IndexOutOfBoundsException("индекс вне диапазона")
fun udaleniyeProbelov(stroka: String) = stroka.replace(" ", "")
fun summaPervyhN(n: Int) = (1..n).sum()
fun proverkaPodstroki(stroka: String, podstroka: String) = stroka.contains(podstroka)
fun tablitsaYmnozheniya(chislo: Int) {
    for (i in 1..10) println("$chislo * $i = ${chislo * i}")
}
fun dlinnaStroki(stroka: String) = stroka.length
fun perevorotMassiva(massiv: List<Int>) = massiv.reversed()
fun kopirovanieMassiva(massiv: List<Int>) = massiv.toList()
fun kolichestvoGlasnyh(stroka: String) = stroka.count { it.lowercaseChar() in "аеёиоуыэюя" }
fun indeksPervogoVkhodeniya(massiv: List<Int>, element: Int) = massiv.indexOf(element)

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\nЗдесь собранны все задания 8 лабы, спасибо за использование!")
        println("\nВыберите задание (1-41), или 0 для выхода:")
        (1..41).forEach { println("$it. Задание $it") }
        println("0. Выход")

        when (scanner.nextInt()) {
            1 -> {
                println("Введите количество элементов списка:")
                val n = scanner.nextInt()
                val spisok = List(n) { scanner.nextInt() }
                println("Сумма элементов списка: ${summa(spisok)}")
            }
            2 -> {
                println("Введите количество элементов списка:")
                val n = scanner.nextInt()
                val spisok = List(n) { scanner.nextInt() }
                println("Разность максимального и минимального: ${raznostMinMax(spisok)}")
            }
            3 -> {
                println("Введите количество элементов первого списка:")
                val n1 = scanner.nextInt()
                val spisok1 = List(n1) { scanner.nextInt() }
                println("Введите количество элементов второго списка:")
                val n2 = scanner.nextInt()
                val spisok2 = List(n2) { scanner.nextInt() }
                println("Результат объединения списков: ${obyedinenie(spisok1, spisok2)}")
            }
            4 -> {
                println("Введите prob, prize и pay:")
                val prob = scanner.nextDouble()
                val prize = scanner.nextDouble()
                val pay = scanner.nextDouble()
                println("Выгодно ли? ${isVygodno(prob, prize, pay)}")
            }
            5 -> {
                println("Введите два числа:")
                val chislo1 = scanner.nextInt()
                val chislo2 = scanner.nextInt()
                println("Сумма меньше 100? ${summaMenee100(chislo1, chislo2)}")
            }
            6 -> {
                println("Введите число:")
                val chislo = scanner.nextInt()
                println("Делится на 100? ${delitsyaNa100(chislo)}")
            }
            7 -> {
                println("Введите количество минут и fps:")
                val minuty = scanner.nextInt()
                val fps = scanner.nextInt()
                println("Кадров за время: ${kolichestvoKadrov(minuty, fps)}")
            }
            8 -> {
                println("Введите числа k и n:")
                val k = scanner.nextInt()
                val n = scanner.nextInt()
                println("k^k == n? ${proverkaStepeni(k, n)}")
            }
            9 -> {
                println("Введите строку и количество повторений:")
                val txt = scanner.next()
                val n = scanner.nextInt()
                println("Результат: ${repetition(txt, n)}")
            }
            10 -> {
                println("Введите уравнение:")
                val uravnenie = scanner.next()
                println("Результат уравнения: ${equation(uravnenie)}")
            }
            11 -> {
                println("Введите количество букв o:")
                val number = scanner.nextInt()
                println(google(number))
            }
            12 -> {
                privetMiry()
            }
            13 -> {
                println("Введите два числа:")
                val chislo1 = scanner.nextInt()
                val chislo2 = scanner.nextInt()
                println("Сумма чисел: ${summaDvuh(chislo1, chislo2)}")
            }
            14 -> {
                println("Введите два числа:")
                val chislo1 = scanner.nextInt()
                val chislo2 = scanner.nextInt()
                println("Большее число: ${bolsheeChislo(chislo1, chislo2)}")
            }
            15 -> {
                println("Введите число:")
                val chislo = scanner.nextInt()
                println("Число четное? ${chetnoeChislo(chislo)}")
            }
            16 -> {
                println("Введите число:")
                val chislo = scanner.nextInt()
                println("Факториал числа: ${factorial(chislo)}")
            }
            17 -> {
                println("Введите число:")
                val chislo = scanner.nextInt()
                println("Число простое? ${prostoeChislo(chislo)}")
            }
            18 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Сумма чисел массива: ${summaMassiva(massiv)}")
            }
            19 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Максимальное число в массиве: ${maksimalnoeChislo(massiv)}")
            }
            20 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Отсортированный массив: ${sortirovkaMassiva(massiv)}")
            }
            21 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Строка палиндром? ${palindrom(stroka)}")
            }
            22 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Количество символов: ${kolichestvoSimvolov(stroka)}")
            }
            23 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Строка в верхнем регистре: ${vVerhniyRegistr(stroka)}")
            }
            24 -> {
                println("Введите первую строку:")
                val stroka1 = scanner.next()
                println("Введите вторую строку:")
                val stroka2 = scanner.next()
                println("Объединенные строки: ${obyedinenieStrok(stroka1, stroka2)}")
            }
            25 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Последний элемент массива: ${posledniyElement(massiv)}")
            }
            26 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Введите элемент для поиска:")
                val element = scanner.nextInt()
                println("Элемент в массиве? ${nalichieElementa(massiv, element)}")
            }
            27 -> {
                println("Введите число N:")
                val n = scanner.nextInt()
                println("Массив от 1 до $n: ${massivOt1DoN(n)}")
            }
            28 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                val (max, min) = maxMinMassiv(massiv)
                println("Максимум: $max, Минимум: $min")
            }
            29 -> {
                println("Введите число N:")
                val n = scanner.nextInt()
                println("Сумма от 1 до $n: ${summaOt1DoN(n)}")
            }
            30 -> {
                println("Введите температуру в Цельсиях:")
                val celsius = scanner.nextDouble()
                println("Температура в Фаренгейтах: ${celsiusVFahrenheit(celsius)}")
            }
            31 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Строка в обратном порядке: ${obratniyPoryadok(stroka)}")
            }
            32 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Введите индекс:")
                val index = scanner.nextInt()
                println("Элемент по индексу: ${poiskPoIndeksu(massiv, index)}")
            }
            33 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Строка без пробелов: ${udaleniyeProbelov(stroka)}")
            }
            34 -> {
                println("Введите число N:")
                val n = scanner.nextInt()
                println("Сумма первых $n натуральных чисел: ${summaPervyhN(n)}")
            }
            35 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Введите подстроку:")
                val podstroka = scanner.next()
                println("Подстрока найдена? ${proverkaPodstroki(stroka, podstroka)}")
            }
            36 -> {
                println("Введите число для таблицы умножения:")
                val chislo = scanner.nextInt()
                tablitsaYmnozheniya(chislo)
            }
            37 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Длина строки: ${dlinnaStroki(stroka)}")
            }
            38 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Перевернутый массив: ${perevorotMassiva(massiv)}")
            }
            39 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Копия массива: ${kopirovanieMassiva(massiv)}")
            }
            40 -> {
                println("Введите строку:")
                val stroka = scanner.next()
                println("Количество гласных: ${kolichestvoGlasnyh(stroka)}")
            }
            41 -> {
                println("Введите количество элементов массива:")
                val n = scanner.nextInt()
                val massiv = List(n) { scanner.nextInt() }
                println("Введите элемент для поиска:")
                val element = scanner.nextInt()
                println("Индекс первого вхождения: ${indeksPervogoVkhodeniya(massiv, element)}")
            }
            0 -> {
                println("Выход из программы")
                return
            }
            else -> println("Неверный выбор")
        }

        // Пауза перед следующим выбором
        println("Нажмите Enter для продолжения...")
        scanner.nextLine() // Чистим буфер ввода
        scanner.nextLine() // Ждем нажатия Enter
    }
}