class StaticMethod{
    public static void main(String[] args) {
      Static s=new Static();
      s.multiply(2,3);
      Static.add(20,12);
    }
}
class Static
{
    void multiply(int a,int b)
    {
        System.out.println(a*b);
    }
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
}