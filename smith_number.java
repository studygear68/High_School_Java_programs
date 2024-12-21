import java.util.*;  
class smith_number 
{  
   public static void main(String args[]) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter a number:");  
      int n = sc.nextInt();  
      int i, j, c = 0, d, s = 0, m = n, co = n, d1, sd = 0;  
      while (m != 0) 
      {  
        d1 = m % 10;  
        sd += d1;  
        m = m / 10;  
      }  
      for (i = 2; i <= n; i++) 
      {  
        if (n % i == 0) 
        {  
           c = 0;  
           for (j = 1; j <= i; j++) 
           {  
              if (i % j == 0)  
                c++;  
           }  
           if (c == 2) 
           {  
              int k = i; 
              while (k != 0) 
              {  
                d = k % 10;  
                s += d;  
                k = k / 10;  
              }  
           }  
        }  
      }  
      System.out.println("Sum of digits: " + sd);  
      System.out.println("Sum of digits of prime factors: " + s);  
      if (sd == s)  
        System.out.println(co + " is a Smith number");  
      else  
        System.out.println(co + " is NOT a Smith number");  
   }  
}