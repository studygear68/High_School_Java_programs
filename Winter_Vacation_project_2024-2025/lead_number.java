import java.util.*;
class lead_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int se=0,so=0,d,m=n;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
            se+=d;
            else
            so+=d;
            n=n/10;
        }
        if(se==so)
        System.out.println(m+ " is a Lead Number");
        else
        System.out.println(m+ " is not a Lead Number");    
    }
}