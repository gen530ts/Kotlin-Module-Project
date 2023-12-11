

fun main() {
    val store = Store()
    val viewTxtNote = SelFromList(
        onRun = { res: String -> if(store.isThisNote(res)) store.getTextNote(res)
                else println("нет такой заметки") },
        strEnterName = "Введите имя заметки")
    val entTxtNote = SelFromList(
        onRun = { res: String -> store.createNote(res) },
        strEnterName = "Введите текст заметки")
    val entNameNote = SelFromList(
        onRun = { res: String -> store.setSelNote(res)//
            entTxtNote.start() },
        strEnterName = "Введите имя заметки")
    val entryNote = EntryMenu(
        onCreate = { entNameNote.start() },
        onEntry = { viewTxtNote.start() },
        onStart = { store.getNotes() },
        "Создать заметку",
        "Прочитать заметку"
    )
    val selArh = SelFromList(onRun = { res: String ->
        if (store.isThisArh(res)) {store.setSelArh(res)
        entryNote.start()}
        else println("нет такого архива")
    }, "Введите имя архива")
    val createArch = SelFromList(
        onRun = { res: String -> store.createArh(res) },
        strEnterName = "Введите имя архива")
    val entryArch = EntryMenu(
        onCreate = { createArch.start() },
        onEntry = { selArh.start() },
        onStart = { store.getArh() },
        "Создать архив",
        "Войти в архив"
    )
    entryArch.start()
}


//if(Scanner(System.`in`).)
/*when(Scanner(System.`in`).nextLine().toInt()){
    RetVal.CREATE.ordinal -> println(0)
   RetVal.ENTRY.ordinal -> println(1)
    RetVal.QUIT.ordinal -> println(2)
    else -> println("not")
}*/

/*while (!(Scanner(System.`in`).hasNextInt())) {
    println("That's not a number!");
    Scanner(System.`in`).nextLine()
}*/


/*println(res)
 println(res.toByteArray().size)
 println(res.toByteArray().toList())*/
/*when(res.toByteArray()){
    "3","9"
}*/
// print("Scan = $res")
//println()
//String.to
// break
// createArch.start()
//val st=Store()
// st.setSelNote("ty")
/*
enum class RetVal {
    CREATE, ENTRY, QUIT
}*/
