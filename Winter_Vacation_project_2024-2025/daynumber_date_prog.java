import java.util.*;
class daynumber_date_prog
{
    int[] m = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String[] mn = { "0", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };
    public String check(int dn, int y) 
    {
        if (y % 4 == 0)
            m[2] = 29;
        int s = 0, d = 0;
        String mon = "", date = "";
        for (int i = 1; i < m.length; i++) 
        {
            s += m[i];
            if (s >= dn) 
            {
                mon = mn[i];
                d = dn - (s - m[i]);
                break;
            }
        }
        if (d == 1||d==21||d==31)
            date = d + "st";
        else if (d == 2||d==32)
            date = d + "nd";
        if (d == 3||d==23)
            date = d + "rd";
        else
            date = d + "th";
        return date + " " + mon + " " + y;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day Number = ");
        int dn = sc.nextInt();
        System.out.print("Year = ");
        int y = sc.nextInt();
        if (y % 4 != 0 && dn == 366) 
        {
            System.out.println("Invalid Day Number!");
            System.exit(0);
        }
        System.out.print("Date before (n) = ");
        int n = sc.nextInt();
        if (y < 1000 || y > 9999) 
        {
            System.out.println("Invalid year");
            System.exit(0);
        }
        if (n > dn) 
        {
            System.out.println("Date before " + n + " days does not lie in the same year.");
            System.exit(0);
        }
        if (n < 1 || n > 366) 
        {
            System.out.println("Invalid date");
            System.exit(0);
        }
        daynumber_date_prog obj = new daynumber_date_prog();
        String out1 = obj.check(dn, y);
        System.out.println(out1);
        int newdn = dn - n;
        String out2 = obj.check(newdn, y);
        System.out.println("Date before " + n + " days = " + out2);
    }
}