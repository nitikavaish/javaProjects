package Stacks;

import java.util.*;

public class prefix_to_postfix {
    public static void main(String[] args) {
           String prefix="-9/*+5346";
           Stack<String>val=new Stack<>();
           int n=prefix.length();
           for(int i=n-1;i>=0;i--){
               char ch=prefix.charAt(i);
               int ascii=(int)ch;
               if(ascii>=48&&ascii<=57){
                   val.push(ch+"");
               }else{
                   String v1=val.pop();
                   String v2=val.pop();
                   char o=ch;
                   String ans=v1+v2+o;
                   val.push(ans);

               }
           }
        System.out.println(val.peek());
    }
}
