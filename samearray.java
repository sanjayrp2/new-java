import java.util.*;
public class samearray {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=true;
        int a[]=new int [n];
        int b[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
                if(a[i]==b[i]){
                    result=true;
                }
                else{
                    result=false;
                }  
        }
        System.out.println(result);  
    }
    
}
