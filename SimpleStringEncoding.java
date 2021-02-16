/* Read a 5 letter word into the computer then encode the word on a letter-by-letter basis by 
   subtracting 1 from the numerical value that is used to represent each letter  */

package Java;

import java.util.Scanner;

public class SimpleStringEncoding {
    public static void main(String[] args) {
        String s;
        String res = "";

        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter a five letter word : ");
        s = in.nextLine();

        res += Character.toString((char) (s.charAt(0) - 1));
        res += Character.toString((char) (s.charAt(1) - 1));
        res += Character.toString((char) (s.charAt(2) - 1));
        res += Character.toString((char) (s.charAt(3) - 1));
        res += Character.toString((char) (s.charAt(4) - 1));

        System.out.print(res);
    }
}
/*
 * int a; char c; a=s.charAt(0);
 * System.out.print("\nCharacter at 0 position : %d", a); a=a-1; c=(char)a; res=
 * Character.toString(c);
 * 
 */