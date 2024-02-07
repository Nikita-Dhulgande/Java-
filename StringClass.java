import java.util.*;
public class StringClass {
    public static void main(String[] args) {
        String s1="Nikita Dhulgande";
        System.out.println(s1.toLowerCase());

        String s2="nikita Dhulgande";
        System.out.println(s1.toUpperCase());

        String s3="   James   ";
        System.out.println(s3.trim());

        String s4="Maharashtra";
        System.out.println(s4.replace('a','v'));
        
        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.length());

        System.out.println(s1.charAt(2));

        System.out.println(s1.substring(0, 6));

        System.out.println(s4.indexOf('M'));

        String str1="Hello";
        String str3="Hello";
        System.out.println(str1.compareTo(str3));

    }
}
