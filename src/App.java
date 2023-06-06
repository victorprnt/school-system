import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {

    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    Teacher teacher_01 = new Teacher("John", "Smith", "123.456.789-00", 12345.67, "Antropology");
    Teacher teacher_02 = new Teacher("Joseph", "Nobody", "098.765.432-1", 2345.12, "Math");

    teachers.add(teacher_01);
    teachers.add(teacher_02);

    System.out.println(teachers.get(0).getName());
    System.out.println(teachers.get(1));
  }
}
