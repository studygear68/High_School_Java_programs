import java.util.*;
class condition_str_ing_program
{
    public static void main(String[] args) 
    {
        String str, s = "", s1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        str = sc.nextLine();
        str=str.toUpperCase();
        if (str.endsWith(".") || str.endsWith("?")) 
        {
            s = str.replace(" ", "");
            int k = 0, j = 1, i=1, l = s.length();
            while(j <= l) 
            {
                k = k + i; 
                if (k > l) 
                { 
                    k = l;
                }
                while (j <= k) 
                { 
                    s1 = s1 + s.charAt(j - 1);
                    j++;
                }
                if (j <= l) 
                { 
                    s1 = s1 + " ";
                }
                i++;
            }
            System.out.println(s1);
        } 
        else 
        {
            System.out.println("The sentence must end with '.' or '?'.");
        }
    }
}