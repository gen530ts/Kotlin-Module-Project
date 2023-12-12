import java.util.*

class EntryMenu(
    val onCreate: () -> Unit,
    val onEntry: () -> Unit,
    val onStart: () -> Unit,
    private val strCreate: String,
    private val strEntry: String,
) {

    fun start() {
        var notThisDigit = false
        var isNotDigit = false
        while (true) {
            onStart()
            println("0 - $strCreate")
            println("1 - $strEntry")
            println("2 - Выход")
            if (notThisDigit) println("Введите корректный символ:")
            val res = Scanner(System.`in`).nextLine().toByteArray()
            if (res.isNotEmpty()) {
                notThisDigit = when (res[0]) {
                    48.toByte()  -> {
                        onCreate()
                        false
                    }
                    49.toByte() -> {
                        onEntry()
                        false
                    }
                    50.toByte() -> {
                        break
                    }
                    in 51..57 -> {//такой цифры нет
                        println("Нет такой цифры")
                        true
                    }
                    else -> {
                        isNotDigit=true
                        false
                    }
                }
            }else isNotDigit=true
            if (isNotDigit){
                isNotDigit=false
                println("Следует ввести цифру")
            }
        }
    }
}


