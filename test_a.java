package c3;

import java.util.Scanner;

public class test {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter three edges of the triangle:");
  double edge1 = input.nextDouble();
  double edge2 = input.nextDouble();
  double edge3 = input.nextDouble();
 
  if (edge1 > edge2 + edge3 || edge2 > edge1 + edge3 || edge3 > edge1 + edge2) {
   System.out.print("The input is invalid");
   System.exit(0);
  }
 
  System.out.print("The perimeter is " + (edge1 + edge2 + edge3));
 
 }
 
}