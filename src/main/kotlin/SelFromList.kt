import java.util.*

class SelFromList(
    val onRun: (String) -> Unit,
   // private val strComplete: String,
    private val strEnterName: String,
) {
    fun start() {
           // println("Список архивов")
            println("$strEnterName или нажмите 'Ввод' для выхода")
            val res = Scanner(System.`in`).nextLine()
            if(res.isNotEmpty()) onRun(res)
    }
}