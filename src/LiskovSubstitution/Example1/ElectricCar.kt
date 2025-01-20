package LiskovSubstitution.Example1

class ElectricVehicle : Vehicle() {


    override fun energySource(amount: Double): String {
        return "Electric car recharged with $amount"
    }

}

