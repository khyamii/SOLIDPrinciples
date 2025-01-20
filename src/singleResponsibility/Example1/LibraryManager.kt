package singleResponsibility.Example1

class LibraryManager {
    val books = mutableListOf<String>()

    fun addBook(book: String) {
        books.add(book)
    }


}