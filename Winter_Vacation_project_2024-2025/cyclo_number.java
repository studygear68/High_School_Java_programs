import java.util.*;
class cyclo_number
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            String s=Integer.toString(n);
            int l=s.length(),c=0;
            if(s.charAt(0)==s.charAt(l-1))
            System.out.println(s+" is a cyclo number");
            else
            System.out.println(s+" is NOT a cyclo number");
        }
    }