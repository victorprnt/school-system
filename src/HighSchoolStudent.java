public class HighSchoolStudent extends Student {
  private String studentClass;

  public HighSchoolStudent(String name, String lastName, String registrationNumber, String legalGuardianName,
      String studentClass) {
    super(name, lastName, registrationNumber, legalGuardianName);
    this.studentClass = studentClass;
  }

  public String getStudentClass() {
    return studentClass;
  }

  public void setStudentClass(String studentClass) {
    this.studentClass = studentClass;
  }

}
