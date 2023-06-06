public abstract class Worker {
  private String name;
  private String lastName;
  private String cpf;
  private double salary;
  private int age = 0;
  private String address = "";

  public Worker(String name, String lastName, String cpf, double salary) {
    this.name = name;
    this.lastName = lastName;
    this.cpf = cpf;
    this.salary = salary;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCpf() {
    return cpf;
  }

  public double getSalary() {
    return salary;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
