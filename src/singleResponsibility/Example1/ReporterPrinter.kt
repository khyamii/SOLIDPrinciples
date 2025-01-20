package singleResponsibility.Example1

class ReporterPrinter {

    fun printBooksReport(books:List<String>) {
        println("Number of books : ${books.size}")
        books.forEach { println(it) }
    }
}