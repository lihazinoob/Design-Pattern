public class Student {
    private String name;
    private int age;
    private StudentRole rolename;
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
     public void setrole(StudentRole rolename)
     {
         this.rolename = rolename;
     }
     public String showmessage()
     {
         return rolename.showrole();
     }


}
