import java.util.*;  
class PrintingVowelWordsSentence 
{  
   public static void main(String[] args) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter a sentence:");  
      String s = sc.nextLine();  
      s = s + " ";  
      String w = "", v = "AEIOUaeiou";  
      int i, c = 0, lw, l = s.length();  
      for (i = 0; i < l; i++) 
      {  
        char ch = s.charAt(i);  
        if (ch != ' ') 
           w = w + ch;  
         else 
         {  
           lw = w.length();  
           for (int j = 0; j < lw; j++) 
           {  
              char chv = w.charAt(j);  
              if (v.indexOf(chv) >= 0) 
              c++;  
           }  
           if (c > 1) 
              System.out.println(w);  
           w = "";  
           c = 0;  
        }  
      }  
   }  
}