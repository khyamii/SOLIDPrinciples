package LiskovSubstitution.Example1

class FuelCar : Vehicle() {
    override fun energySource(amount: Double): String {
        return "Vehicle refueled with $amount liters of fuel."
    }
}