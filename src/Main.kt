import LiskovSubstitution.Example1.ElectricVehicle
import LiskovSubstitution.Example1.FuelCar
import LiskovSubstitution.Example1.Vehicle
import LiskovSubstitution.Example2.Bird
import LiskovSubstitution.Example2.FlyingBird
import LiskovSubstitution.Example2.Penguin
import openClosed.Example2.CustomLogger
import openClosed.Example1.SalaryCalculator
import openClosed.Example1.TesterSalary
import singleResponsibility.Example1.LibraryManager
import singleResponsibility.Example1.ReporterPrinter
import singleResponsibility.Example2.ErrorLogger
import singleResponsibility.Example2.LoginManager

fun main() {

// singleResponsibility
    // Example 1
    val libraryManager = LibraryManager()
    libraryManager.addBook("Kotlin Book")
    libraryManager.addBook("SOLID Book")
    val reporterPrinter = ReporterPrinter()
    reporterPrinter.printBooksReport(libraryManager.books)

    // Example 2
    val logger = ErrorLogger()
    val loginManager = LoginManager(logger)
    loginManager.login("user", "wrong_password")

// OpenClosed

// Example 1
    val salaryCalculator = SalaryCalculator()
    val salary = salaryCalculator.calculateSalary(TesterSalary(), 3000.0)
    println("Salary After Calculate = $salary")

// Example2
    val loggerError = CustomLogger()
    loggerError.logError("an error has occurred see the log file")

// LiskovSubstitution

    // Example 1
    val gasCar = FuelCar()
    processVehicle(gasCar)

    val electricCar = ElectricVehicle()
    processVehicle(electricCar)

// Example 2
    val sparrow = FlyingBird()
    makeBirdMove(sparrow)

    val penguin = Penguin()
    makeBirdMove(penguin)

}

fun processVehicle(vehicle: Vehicle) {
    println(vehicle.energySource(10.0)) // Assumes refuel() works for all vehicles
}

fun makeBirdMove(bird: Bird) {
    println(bird.move()) // Assumes all birds can fly
}