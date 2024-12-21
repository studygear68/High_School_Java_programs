import java.util.*;
class twist_number
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            String fd="",ld="";
            String s=Integer.toString(n);   
            int l=s.length();
             fd+=s.charAt(0);
             ld+=s.charAt(l-1);
             if(Integer.parseInt(fd)%2==0&&Integer.parseInt(ld)%2!=0||Integer.parseInt(fd)%2!=0&&Integer.parseInt(ld)%2==0)
            System.out.println(n+" is a twist number");
            else 
            System.out.println(n+" is not a twist number");

    }
}
