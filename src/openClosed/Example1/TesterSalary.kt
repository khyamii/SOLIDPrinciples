package openClosed.Example1

class TesterSalary : SalaryType {
    override fun calculateSalary(baseSalary: Double): Double {
        return baseSalary + 500
    }
}