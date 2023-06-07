import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {

    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    Teacher teacher_01 = new Teacher("John", "Smith", "123.456.789-00", 12345.67, "Antropology", true);
    Teacher teacher_02 = new Teacher("Joseph", "Nobody", "098.765.432-1", 2345.12, "Math", false);
    teachers.add(teacher_01);
    teachers.add(teacher_02);

    ArrayList<Coord> coords = new ArrayList<Coord>();
    Coord coord_01 = new Coord("Joana", "Darc", "086.975.642-53", 43345.67, 5000);
    Coord coord_02 = new Coord("Isa", "Newt", "456.234.987-34", 65432.12, 4300);
    coords.add(coord_01);
    coords.add(coord_02);

    ArrayList<Student> students = new ArrayList<Student>();
    HighSchoolStudent highSchoolStudent_01 = new HighSchoolStudent("Chris", "Rog", "6789", "Carter", "1A");
    HighSchoolStudent highSchoolStudent_02 = new HighSchoolStudent("Elizabeth", "Ols", "3456", "Carol", "82C");

    LegalGuardian legalGuardian_01 = new LegalGuardian("John", "Malk", "056.234.567-01", highSchoolStudent_01);
    LegalGuardian legalGuardian_02 = new LegalGuardian("Rich", "Gervs", "987.345.654-43", highSchoolStudent_02);

    students.add(highSchoolStudent_01);
    students.add(highSchoolStudent_02);

    teachers.get(0).getStudentsList(students);
    teachers.get(1).getInfoAboutCoordination(teacher_02);

    legalGuardian_01.retrieveLegalGuardianInformation();
    legalGuardian_02.retrieveStudentInformation();
  }
}
