class Pattern3
{
    public static void main(String[] args)
    {
       int rows=3;
       for(int r=1;r<=rows;r++)
       {
          int k=r;
           for(int c=1;c<=rows;c++)
           {
               System.out.print(k+" ");
               k++;
              
           }
           System.out.println();
        }
   }
}