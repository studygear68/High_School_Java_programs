import java.util.*;
class zippo_number
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            String fd="",ld="";
            String s=Integer.toString(n);   
            int l=s.length(),sd=0,d,m=n;
            fd+=s.charAt(0);
            ld+=s.charAt(l-1);
             while(n!=0)
            {
                 d=n%10;
                 sd+=d;
                 n=n/10;
            }
            if(sd==Integer.parseInt(fd)+Integer.parseInt(ld))
             System.out.println(m+ " is a zippo number");
            else
             System.out.println(m+ " is NOT a zippo number");
    }
}