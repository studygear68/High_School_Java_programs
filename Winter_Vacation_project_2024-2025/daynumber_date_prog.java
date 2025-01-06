import java.util.*;  
class DayNumberDateProg 
{  
   int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  
   String[] monthNames = {"0", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};  
   public String checkDate(int dayNumber, int year) 
   {  
      if (year % 4 == 0 ) 
        months[2] = 29;  
      int sum = 0; 
      String month = "";  
      for (int i = 1; i < months.length; i++) 
      {  
        if (dayNumber <= months[i]) 
        {  
           month = monthNames[i];  
           break;  
        } 
        else 
           dayNumber -= months[i];  
      }  
      String suffix;  
      if (dayNumber >= 11 && dayNumber <= 13)  
        suffix = "th";  
      else 
      {  
        switch (dayNumber % 10) 
        {  
           case 1:  
              suffix = "st";  
              break;  
           case 2:  
              suffix = "nd";  
              break;  
           case 3:  
              suffix = "rd";  
              break;  
           default:  
              suffix = "th";  
        }  
      }  
      return dayNumber + suffix + " " + month + " " + year;  
   }  
   public static void main(String[] args) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.print("Day Number = ");  
      int dayNumber = sc.nextInt();  
      System.out.print("Year = ");  
      int year = sc.nextInt();  
      if (year%4!=0 && dayNumber==366) 
      {  
        System.out.println("Invalid Day Number!");  
        System.exit(0);  
      }  
      if (year < 1000 || year > 9999) 
      {  
        System.out.println("Invalid year");  
        System.exit(0);  
      }  
      System.out.print("Date before (n) = ");  
      int n = sc.nextInt();  
      if (n < 1 || n > 366) 
      {  
        System.out.println("Invalid date");  
        System.exit(0);  
      }  
      DayNumberDateProg obj = new DayNumberDateProg();  
      String output1 = obj.checkDate(dayNumber, year);  
      System.out.println("Date = " + output1); 
      if (n > dayNumber) 
      {  
        System.out.println("Date before " + n + " days does not lie in the same year.");  
        System.exit(0);  
      }  
      int newDayNumber = dayNumber - n;  
      String output2 = obj.checkDate(newDayNumber, year);  
      System.out.println("Date before " + n + " days = " + output2);  
   }  
}