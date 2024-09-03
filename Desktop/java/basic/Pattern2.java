class Pattern1
{
    public static void main(String[] args)
    {
       int rows=3;
       int k=1;
       for(int r=1;r<=rows;r++)
       {
           for(int c=1;c<=rows;c++)
           {
               System.out.print(k+" ");
               k++;
           }
           System.out.println();
        }
   }
}