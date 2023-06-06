public class ElementaryStudent extends Student {
  private Teacher responsibleTeacher;

  public ElementaryStudent(String name, String lastName, String registrationNumber, String legalGuardianName,
      Teacher responsibleTeacher) {
    super(name, lastName, registrationNumber, legalGuardianName);
    this.responsibleTeacher = responsibleTeacher;
  }

  public Teacher getResponsibleTeacher() {
    return responsibleTeacher;
  }

  public void setResponsibleTeacher(Teacher responsibleTeacher) {
    this.responsibleTeacher = responsibleTeacher;
  }

}
