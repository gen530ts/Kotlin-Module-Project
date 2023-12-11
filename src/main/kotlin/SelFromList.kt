import java.util.*

class SelFromList(
    val onRun: (String) -> Unit,
    private val strEnterName: String,
) {
    fun start() {
            println("$strEnterName или нажмите 'Ввод' для выхода")
            val res = Scanner(System.`in`).nextLine()
            if(res.isNotEmpty()) onRun(res)
    }
}