
  import java.util.*;
public class remove_spaces {
  


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string:");
            String str=sc.nextLine();
            String abc="";
    char a=32;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==a){
                    continue;
                }
                else
                    abc+=str.charAt(i);
    
            }
        System.out.println(abc);
    
    }
}
    
     

