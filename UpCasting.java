class UpCasting{
    public static void main(String[] args) {
        Parent p=new child();
        p.display();
    }
}
class Parent
{
    void display()
    {
        System.out.println(" i am parent");
    }
}
class child extends Parent
{
    void display()
    {
        System.out.println(" i am child");
    }
}