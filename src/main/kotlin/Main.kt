

fun main() {
    val store = Store()
    val viewTxtNote = SelFromList(
        onRun = { res: String -> if(store.isThisNote(res)) store.getTextNote(res)
                else println("нет такой заметки") },
        strEnterName = "имя заметки")
    val entTxtNote = SelFromList(
        onRun = { res: String -> store.createNote(res) },
        strEnterName = "текст заметки")
    val entNameNote = SelFromList(
        onRun = { res: String -> store.setSelNote(res)//
            entTxtNote.start() },
        strEnterName = "имя заметки")
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
    }, "имя архива")
    val createArch = SelFromList(
        onRun = { res: String -> store.createArh(res) },
        strEnterName = "имя архива")
    val entryArch = EntryMenu(
        onCreate = { createArch.start() },
        onEntry = { selArh.start() },
        onStart = { store.getArh() },
        "Создать архив",
        "Войти в архив"
    )
    entryArch.start()
}

