package CLASS_12_PROGRAMS;
import java.util.*;
class WordWise 
{
String str;
    WordWise() 
    {
        str = ""; 
    }

    void readsent() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        str = sc.nextLine();
    }

    
    int freq_vowel(String w) 
    {
        int c = 0;
        for (int i = 0; i < w.length(); i++) 
        {
            char ch = Character.toLowerCase(w.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                c++;
            
        }
        return c;
    }

 void arrange() 
    {
        System.out.println("Word\t\tVowel Frequency");
        System.out.println("-------------------------------");
        str=str+" ";
        int i,l = str.length();
        String wo="";
        for(i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            wo=wo+ch;
            else
            System.out.println(wo+"\t\t" +freq_vowel(wo));
            wo="";
        }
    }
    public static void main(String[] args) 
    {
        WordWise obj = new WordWise(); 
        obj.readsent();                
        obj.arrange();                
    }
}












