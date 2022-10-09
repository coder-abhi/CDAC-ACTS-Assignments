

public class ASCII_Values {
public static void main(String[] args){

		// Brute Force Method:	simply assign the character to a new variable
		//of integer type.
		// Java automatically stores the ASCII value of that character
		//inside the new variable.
		char ch = 'a';
        int ascii = ch;

        // Type Cast method: You can also cast char to int
        int castAscii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);



        // Printt ASCII of A to Z
        for(int i = 65; i <= 90; i++)
        {
        System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
	}


}
