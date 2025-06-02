
import java.util.ArrayList;

public class Main {
    final static int studentNum = 3;
    // 0: id, 1: name, 2: status, 3: birthdate, 4: contact
    static String[][] students = new String[studentNum][5];
    static ArrayList<String>[] courseLists = new ArrayList[studentNum];



    public static void main(String[] args)
    {

        for( int i = 0; i < studentNum; i++)
            courseLists[i] = new ArrayList<>();

        setStudents(0, "2023001", "홍길동", "재학", "2001-05-10", "010-1234-5678");
        setStudents(1, "2023002", "길동홍", "휴학", "1999-08-16", "010-1644-4478");
        setStudents(2, "2023003", "동홍길", "재학", "1987-06-15", "010-1233-9978");


        addCourse(0, "자료구조");
        addCourse(0, "운영체제");


        addCourse(1, "데이터베이스");


        addCourse(2, "자료구조");
        addCourse(2, "운영체제");
        addCourse(2, "데이터베이스");
        removeCourse(2, "자료구조");



//        printALLStudents();

        printStudentInfo(1);


        ArrayList<String>[] courseLists = new ArrayList[studentNum];
        for (int i = 0; i < studentNum; i++) {
            courseLists[i] = new ArrayList<>();

        }

    }

    public static void setStudents(int index, String id, String name, String status, String birthDate, String contact)
    {
            students[index][0]=id;
            students[index][1]=name;
            students[index][2]=status;
            students[index][3]=birthDate;
            students[index][4]=contact;

        }


    public static void addCourse(int index, String CourseName)
    {
        courseLists[index].add(CourseName);
    }

    public static void removeCourse(int index, String CourseName)
    {
        courseLists[index].remove(CourseName);
    }


    public static int getCourseNumber(int index)
    {
        return courseLists[index].size();
    }

    public static void printALLStudents()
    {
            for (int i = 0; i < students.length; i++)
            {
                printStudentInfo(i);
                System.out.println();
            }
        }

    public static void printStudentInfo(int index)
    {
            System.out.println("=== 학생" + (index+1) + " 정보 ===");
            System.out.println(students[index][0]);
            System.out.println(students[index][1]);
            System.out.println(students[index][2]);
            System.out.println(students[index][3]);
            System.out.println(students[index][4]);
            System.out.println();

            int courseNum =  getCourseNumber(index);
            System.out.println("<수강 교과목 목록 : 총 " + courseNum + " 개>");
                if (courseLists[index].isEmpty())
                {
                    System.out.println("없음");
                }
                else {
                    for (String course : courseLists[index]) {
                        System.out.println(course);
                    }
                }
        }


}