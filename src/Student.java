public abstract class Student {
  private String name;
  private String lastName;
  private String registrationNumber;
  private String legalGuardianName;

  public Student(String name, String lastName, String registrationNumber, String legalGuardianName) {
    this.name = name;
    this.lastName = lastName;
    this.registrationNumber = registrationNumber;
    this.legalGuardianName = legalGuardianName;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public String getLegalGuardianName() {
    return legalGuardianName;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public void setLegalGuardianName(String legalGuardianName) {
    this.legalGuardianName = legalGuardianName;
  }
}
