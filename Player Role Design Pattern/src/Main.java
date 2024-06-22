import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        Student student  = new Student("Naveed",22);
        StudentRole role1 = new FullTime();
        student.setrole(role1);
        System.out.println(student.showmessage());

        Student abid = new Student("Abid",15);
        StudentRole role2 = new PartTime();
        abid.setrole(role2);
        System.out.println(abid.showmessage());

    }
}
