import java.util.*

class SelFromList(
    val onRun: (String) -> Unit,
    private val strEnterName: String,
) {
    fun start() {
        println("Введите $strEnterName или нажмите 'Ввод' для выхода")
        while (true) {
            val res = Scanner(System.`in`).nextLine()
            when {
                res.trim().isNotEmpty() -> {
                    onRun(res.lowercase())
                    break
                }
                res.isNotEmpty() && res.trim().isEmpty() -> println("Введите " +
                        "корректное значение:")
                else -> break
            }
        }
    }
}
