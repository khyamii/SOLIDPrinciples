package openClosed.Example1

class SalaryCalculator {
    fun calculateSalary(salaryType: SalaryType, baseSalary: Double): Double {
       return salaryType.calculateSalary(baseSalary)
    }
}