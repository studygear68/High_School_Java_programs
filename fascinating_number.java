import java.util.*;
class fascinating_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int n2,n3,c=0,d,j,c2=0,c3=0,m=n;
        char i;
        String nn;
        n2=n*2;
        n3=n*3;
        nn=Integer.toString(n)+Integer.toString(n2)+Integer.toString(n3);
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        if(c%3==0)
        {
            for(i='1';i<='9';i++)
            {
                for(j=0;j<nn.length();j++)
                {
                    char ch = nn.charAt(j);
                    if(i==ch)
                    c2++;
                }
                if(c2==1)
                c3++;
                c2=0;
            }
        }
        if(c3==9)
        System.out.println(m+ " is a Fascinating Number");
        else
        System.out.println(m+ " is NOT a Fascinating Number");
    }
}

