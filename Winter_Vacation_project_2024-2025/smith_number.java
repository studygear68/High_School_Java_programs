import java.util.*;  
class smith_number 
{  
   public static void main(String args[]) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter a number:");  
      int n = sc.nextInt();  
      int i, d, s = 0, m = n, co = n, d1, sd = 0;  
      while (m != 0) 
      {  
        d1 = m % 10;  
        sd += d1;  
        m = m / 10;  
      }  
      int c1 = 0;  
      for (i = 1; i <= n; i++) 
      {  
        if (n % i == 0)  
          c1++;  
      }  
      if (c1 == 2) 
      {
        System.out.println(co + " is NOT a Smith number");  
        System.exit(0);
      } 
      for (i = 2; i <= n; i++) 
      {  
        while (n % i == 0) // Handle repeated prime factors
        {  
           int k = i; 
           while (k != 0) 
           {  
             d = k % 10;  
             s += d;  
             k = k / 10;  
           }  
           n /= i;  
        }  
      }
      if (sd == s)  
        System.out.println(co + " is a Smith number");  
      else  
        System.out.println(co + " is NOT a Smith number");  
   }  
}  
