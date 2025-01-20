import LiskovSubstitution.Example1.ElectricVehicle
import LiskovSubstitution.Example1.FuelCar
import LiskovSubstitution.Example1.Vehicle
import LiskovSubstitution.Example2.Bird
import LiskovSubstitution.Example2.FlyingBird
import LiskovSubstitution.Example2.Penguin

fun main() {

    // Example 1
    val gasCar = FuelCar()
    processVehicle(gasCar)

    val electricCar = ElectricVehicle()
    processVehicle(electricCar)

//    // Example 2
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