
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Student student2 = new Student("2023001", "홍길동", "재학", "2001-05-10", "010-1234-5678");

        student2.addCourses("Java");
        student2.addCourses("Python");

        System.out.println("학생2의 정보");
        student2.printInfo();

        Professor professor = new Professor("P001", "홍당무", "재직", "1965-05-23", "010-5678-1234");
        professor.addLecture("Java");
        professor.addLecture("Application Security");

        System.out.println("교수의 정보");
        professor.printInfo();


    }
}
