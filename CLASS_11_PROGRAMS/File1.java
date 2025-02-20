import java.io.*;
import java.util.*;
class File1
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("D:/File Programs Java/student.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for(int i =1;i<=5;i++)
        {
            System.out.println("Enter roll no");
            int r =sc.nextInt();
            System.out.println("Enter name");
    String s = sc.next();
            System.out.println("Enter %");
            double p =sc.nextDouble();
            pw.println(r+"\t"+s+"\t"+p);
        }
        pw.close();
    }
}