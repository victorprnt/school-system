import java.util.ArrayList;

public class Teacher extends Worker {
  private String disciplineName;

  public Teacher(String name, String lastName, String cpf, double salary, String disciplineName) {
    super(name, lastName, cpf, salary);
    this.disciplineName = disciplineName;
  }

  public String getDisciplineName() {
    return disciplineName;
  }

  public void setDisciplineName(String disciplineName) {
    this.disciplineName = disciplineName;
  }

  public void printAllInformation() {
    System.out.println("Professor " + getName() + " " + getLastName());
    System.out.println("CPF: " + getCpf());
    System.out.println("Salary: " + getName());
    System.out.println("Teaches: " + getDisciplineName());
    System.out.println(getAge() != 0 ? "Age: " + getAge() : "Age: NOT REGISTERED");
    System.out.println(getAddress() != "" ? "Address: " + getAddress() : "Address: NOT REGISTERED");
  }

  public Double getSalaryMinusDiscounts() {
    return getSalary() * 0.83;
  }

  public void getJobDescription() {
    System.out.println("Teacher " + getName() + " teaches " + getDisciplineName());
  }

  public void getStudentsList(ArrayList<Student> students) {
    for (Student student : students) {
      student.getStudentInfo(student);
    }
  }
}
