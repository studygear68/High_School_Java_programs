import java.util.*;  
class ValidDate 
{  
   public static void main(String[] args) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter date ");  
      String da = sc.nextLine();  
      System.out.println("Enter the first day of the year");  
      String dnam = sc.nextLine();  
      int s = 0, c = 0, i, dw;  
      int[] nm = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
      String[] dn = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};  
      int p = da.indexOf('/');  
      int q = da.lastIndexOf('/');  
      int d = Integer.parseInt(da.substring(0, p));  
      int m = Integer.parseInt(da.substring(p + 1, q));  
      int y = Integer.parseInt(da.substring(q + 1));  
      if (y % 4 == 0) 
        nm[2] = 29;  
      if (y < 1000 || y > 9999) 
        System.out.println("Invalid date");  
       else if (m <= 0 || m > 12)   
        System.out.println("Invalid date");  
       else if (d <= 0 || d > nm[m])  
        System.out.println("Invalid date");  
       else 
       {  
        for (i = 0; i < m; i++)   
           s += nm[i];  
        s += d - 1;  
        dw = s % 7;  
        for (i = 0; i < 8; i++) 
        {  
           if (dnam.equals(dn[i])) 
              break;
        }  
        dw += i;  
        dw = dw % 7;  
        System.out.println("Day = " + dn[dw]);  
      }  
   }  
}