package openClosed.Example1

class ManagerSalary :SalaryType {
    override fun calculateSalary(baseSalary: Double): Double {
        return baseSalary + 2000
    }
}