import java.util.*;
class emirp_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i,c=0,rev=0,d,c2=0,m=n;
        for(i=1;i< n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==1)
        {
            while(n!=0)
            {
                d=n%10;
                rev=rev*10+d;
                n=n/10;
            }
            for(i=1;i<rev;i++)
        {
            if(rev%i==0)
            c2++;
        }
        if(c2==1)
        System.out.println(m+ " is a Emirp Number");
        else
        System.out.println(m+ " is not a Emirp Number");    
    }
}
}