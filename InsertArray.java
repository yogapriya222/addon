package concepts;
import java.util.*;
class InsertArray{
public static void main(String[] args) {
   int num[]=new int[20];
Scanner sc=new Scanner(System.in);
   System.out.println("Enter ur array size");
   int size=sc.nextInt();

   for(int i=0;i<size;i++){
       num[i]=sc.nextInt();
   
   }
   for(int i=0;i<size;i++){
       System.out.print(num[i]);
   }
   System.out.println(Arrays.toString(num));
   System.out.println("Enter ur value");
   int newval=sc.nextInt();
   System.out.println("Enter the position");
   int pos=sc.nextInt();
   for(int n=size;n>=pos-1;n--)
   {
       num[n]=num[n-1];
   }
   num[pos-1]=newval;
   size++;
   System.out.println(Arrays.toString(num));
   
               sc.close();
         }
   }

