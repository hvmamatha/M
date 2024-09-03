 
class type_casting{
    public static void main(String[] args) 
    {
        int a=100;
        long b=a;
        float c=(float)b;
        double d=a;
        char e=(char)a;
        System.out.println(b);//int to long
        System.out.println(c);//int to float
        System.out.println(d);//int to double
        System.out.println(e);//int to char,output is printed the ascii value of the symbol
        
        int p=(int)d;
        float q=(float)d;
        long r=(long)d;
        System.out.println(p);//double to int
        System.out.println(q);//double to float
        System.out.println(r);//double to long
        
        
        char t=15;
        int j=t;
        System.out.println(j);//char to int
        
        short u=123;
        byte v=(byte)u;
        System.out.println(v);//short to byte
        
        double w=q;
        System.out.println(w);//float to double
        }
}
