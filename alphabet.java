public class alphabet
{
  public static void main(String args[])
  {
     int n,c,k,space;//declaring variables n,c,k,space of int type
     
     System.out.println("Enter the no. of rows:");
     n=Integer.parseInt(System.console().readLine());//This prompts the user to give input
     space=n-1;
     
     
     
     for(k=1;k<=n;k++)//This for loop is for no. of rows
     {
        
        for(c=1;c<=space;c++)//This for loop is for printing spaces
        System.out.print(" ");
        
      space--;
        for(c=1;c<=2*k-1;c++)//This for loop is for printing  alphabets in ascending order
       {
          if(c<=k)//This condition is for printing the alphabets in desired pattern
          System.out.print((char)(c+96)+"");
          else 
          System.out.print((char)(2*k-c+96));
          
          
        }
       System.out.println();
  }
     space=1;
     for(k=1;k<=n-1;k++)//This for loop is for printing rows
     {
        for(c=1;c<=space;c++)//This for loop is for printing spaces
          System.out.print(" ");

     space++;
        for(c=1;c<=2*(n-k)-1;c++)//This for loop is for printing alphabets in descending order
        {
           if(c<=(n-k))//This condition is for printing the alphabets in desired pattern
           System.out.print((char)(c+96)+"");
           else
           System.out.print((char)(2*(n-k)-c+96));          
           
        }
     System.out.println();
    }
}
}