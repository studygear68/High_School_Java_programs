import java.util.*;  
class array_sort
 {  
   public static void main(String args[]) 
   {  
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter n");  
      int n = sc.nextInt();  
      int a[][] = new int[n][n];  
      int i, j, k, t,s=0;  
      System.out.println("Enter array elements");  
      for (i = 0; i < n; i++) 
      {  
        for (j = 0; j < n; j++) 
        {  
           a[i][j] = sc.nextInt();  
        }  
      }  
      System.out.println("Original array");  
      for (i = 0; i < n; i++) 
      {  
        for (j = 0; j < n; j++) 
        {  
           System.out.print(a[i][j] + "\t");  
        }  
        System.out.println();  
      }  
      System.out.println("Rearranged array");  
      for (i = 0; i < n; i++) 
      {  
        for (j = 0; j < n - 1; j++) 
        {  
           for (k = j + 1; k < n; k++) 
           {  
              if (a[i][j] > a[i][k]) 
              {  
                t = a[i][j];  
                a[i][j] = a[i][k];  
                a[i][k] = t;  
              }  
           }  
        }  
      }  
      for (i = 0; i < n; i++) 
      {  
        for (j = 0; j < n; j++) 
        {  
           System.out.print(a[i][j] + "\t");  
        }  
        System.out.println();  
      }  
      System.out.println("Diagonal Elements");
      for (i = 0; i < n; i++) 
      {  
        for (j = 0; j < n; j++) 
        {  
            if(i==j||i+j==n-1)
            {
            System.out.print(a[i][j]+"\t");
            s+=a[i][j];
        }
        else
        System.out.print("\t");
   }
   System.out.println();
}
System.out.println("The sum of the diagonal elements = "+s);
}
}