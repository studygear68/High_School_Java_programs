import java.util.*;
class special_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int d,f=1,m=n,sf=0,i;
        while(n!=0)
        {
            d=n%10;
            for(i=1;i<=d;i++)
            f=f*i;
            sf+=f;
            f=1;
            n=n/10;
        }
        if(m==sf)
        System.out.println(m+" is a Special Number");
        else
        System.out.println(m+" is NOT a Special Number");
    }
}