fun main() {
    println("Введите первую цифру:")
    val digit1 = readLine()?.toIntOrNull()

    println("Введите вторую цифру (различную от первой):")
    val digit2 = readLine()?.toIntOrNull()

    if (digit1 != null && digit2 != null && digit1 != digit2) {
        val result = createOddNumber(digit1, digit2)
        if (result != null) {
            println("Созданное нечетное число: $result")
        } else {
            println("Создать нечетное число невозможно")
        }
    } else {
        println("Пожалуйста, введите две различные цифры.")
    }
}

fun createOddNumber(digit1: Int, digit2: Int): Int? {
    // Проверяем, есть ли среди введенных цифр хотя бы одна нечетная
    if (digit1 % 2 != 0 || digit2 % 2 != 0) {
        // Создаем нечетное число, используя введенные цифры
        return digit1 + digit2
    }
    return null
}
