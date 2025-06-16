import java.util.ArrayList;

public class Professor extends Person {
    private ArrayList<String> lectures;

    public Professor(String id, String name, String status, String birthDate, String contact)
    {
        super(id, name, status, birthDate, contact);
        this.lectures = new ArrayList<>();

    }

    public void addLecture(String lecture)
    {
        this.lectures.add(lecture);
    }

    public void printInfo()
    {
        super.printInfo();
        printLectures();
    }

    public void printLectures()
    {
        System.out.println("담당 강의 목록");
        if(lectures.isEmpty())
            System.out.println("없음");
        else
            for(String lecture : lectures)
                System.out.println(lecture);
    }

}
