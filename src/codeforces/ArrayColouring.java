package codeforces;
import java.util.*;
import static codeforces.FastInput.*;

//import static codeforces.FastInput.out;

public class ArrayColouring {
    public static void main(String[] args) throws Exception{
        FastScanner sc=new FastScanner();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean flag=false;
            for(int i=0;i<n-1;i++){
                if((arr[i]%2!=0&&arr[i+1]%2!=0)||(arr[i]%2==0&&arr[i+1]%2==0)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                out.append("No").append('\n');
                System.out.println(out.toString());
//                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
