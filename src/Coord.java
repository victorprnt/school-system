public class Coord extends Worker {
  private double salaryBonus; // Salary bonus for being a teacher and a coordinator

  public Coord(String name, String lastName, String cpf, double salary, double salaryBonus) {
    super(name, lastName, cpf, salary);
    this.salaryBonus = salaryBonus;
  }

  public double getSalaryBonus() {
    return salaryBonus;
  }

  public void setSalaryBonus(int salaryBonus) {
    this.salaryBonus = salaryBonus;
  }

  public double getSalaryPlusBonus() {
    return getSalary() + getSalaryBonus();
  }

  public Double getSalaryMinusDiscounts() {
    return getSalaryPlusBonus() * 0.78;
  }

  public void getJobDescription() {
    System.out.println(getName() + " is the coordinator of the Department");
  }
}
