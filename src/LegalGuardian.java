public class LegalGuardian {
  private String name;
  private String lastName;
  private String cpf;
  private Student student;

  public LegalGuardian(String name, String lastName, String cpf, Student student) {
    this.name = name;
    this.lastName = lastName;
    this.cpf = cpf;
    this.student = student;
  }

  // getters
  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCpf() {
    return cpf;
  }

  public Student getStudent() {
    return student;
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public void retrieveStudentInformation() {
    System.out.println(
        "The legal guardian of the student" + getStudent().getName() + " is " + getName() + " " + getLastName());
  }

  public void retrieveLegalGuardianInformation() {
    System.out.println(
        "The legal guardian name is: " + getName() + " " + getLastName());
    System.out.println(
        "His document number is: " + getCpf());
  }

}