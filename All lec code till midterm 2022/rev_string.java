import java.util.*;

public class rev_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String rev="";

        for(int i=(str.length()-1);i>=0;i--){
        rev+=str.charAt(i);

        }
    System.out.println(rev);

}
}
