class StaticVariable{
    public static void main(String[] args) {
      Static s=new Static();
      System.out.println(s.a+2);
      System.out.println(Static.b+2);
        
    }
}
class Static
{
    int a=10;
    static int b=15;
}