class Store {
    private var main: MutableMap<String, MutableMap<String, String>> = mutableMapOf()

    private var selArh: String = ""
    private var selNote: String = ""
    fun getArh() {
        val listArh = main.keys
        if (listArh.size > 0) {
            println("список архивов:")
            for (elem in listArh) {
                println(elem)
            }
        } else println("архивов нет")
        //main.keys
    }
    fun getNotes(){
        val listNotes = main[selArh]?.keys
        if (listNotes?.isEmpty() != true){
            if (listNotes != null) {
                println("список заметок:")
                for (elem in listNotes) {
                    println(elem)
                }
            }
        } else println("заметок нет")
    }
    fun createArh(str:String){
        main[str]
        main[str] = mutableMapOf()
    }
    fun createNote(txtNote:String){
       main[selArh]?.put(selNote, txtNote)
        if (main[selArh]?.containsKey(selNote) == true) println("заметка $selNote успешно добавлена")
        else println("не удалось добавить заметку")
    }
    fun getTextNote(key:String){
       val txtNote= main[selArh]?.get(key)
        if (txtNote!=null){
            println("содержание заметки $key:")
            println(txtNote)
        }
    }
    fun isThisArh(arh:String):Boolean{
        return main.containsKey(arh)
    }
    fun isThisNote(note:String):Boolean{
        return main[selArh]?.containsKey(note) ?:false
    }
    fun setSelArh(arh:String){
        selArh=arh
    }
    fun setSelNote(note:String){
        selNote=note
    }
}