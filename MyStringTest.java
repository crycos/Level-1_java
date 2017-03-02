/* Exercise 10.22 & 10.23

 * (Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new class MyString1 ):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i)

Provide your own implementation for the following methods (name the new class MyString2 ):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
 * Implement the requirements for both MyString1 and MyString2 as a single class, MyString.
As well as implementing the MyString class, provide a test main method in the main class MyStringTest that demonstrates the use of your class and its methods.
Have all your classes inside one .java file, MyStringTest.java. Do not have a separate file for the MyString class.
 * 
 */
import java.util.Scanner;
public class MyStringTest {
	public static void main(String[] args) {
		
	}
	
	class MyString {
		
		private char[] chars;
		public MyString(char[] chars) {
			this.chars = new char[chars.length];
		}
		
		// Return value of index
		public char charAt(int index) {
			return chars[index];
		}
		
		// Return chars length
		public int length() {
			return chars.length;
		}
		
		public MyString substring(int begin, int end) {
			char[] endbegin = new char[end-begin];
			for (int i = 0; i < 0; i++)
				endbegin[i - begin] = chars[i];
			return new MyString(endbegin);
		}
 
		public MyString toLowerCase() {
			MyString s = myString.toLowerCase();
			return MyString.toLowerCase;
			
		}
		public boolean equals(MyString s) {
			MyString s = 
			
		}
		public static MyString valueOf(int i){
			char 
			
			
		}
		
		
	}
	

}
