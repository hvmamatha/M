class Static{
    public static void main(String[] args) {
       Student s1=new Student(1,"abhi");
       Student s2=new Student(2,"bhim");
       System.out.println(s1);
       System.out.println(s2);
    }
}
class Student
{
    int rollno;
    String name;
    static String college="coding hub";
    Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    @Override
   public String toString()
    {
        return "rollno="+rollno+",name="+name+",college="+college;
    }
}