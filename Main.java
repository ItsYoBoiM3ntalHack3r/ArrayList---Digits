//Write a constructor for a class called Digits. This constructor takes an integer number as its argument and divides it up into its digits and puts the digits into an ArrayList. For example, new Digits(154) creates an ArrayList with the digits [1, 5, 4].

import java.util.*;
import java.util.Collections;

class digits{
  ArrayList<Integer> dig = new ArrayList<Integer>();
  public void collection(int input){
    int digit = input;
    //This will determine each digit and insert it into the array list, by a loop
    while(input>0){
      digit = input%10;
      dig.add(digit);
      input= input/10;
    }
    //Since the while loop would make the arraylist in the reverse order it would nee an algorithm to reverse that order
    Collections.reverse(dig);
}
}
class Main {
  public static void main(String[] args) {
    digits test = new digits();
    test.collection(14382715);
    for(int a = 0;a<test.dig.size();a++){
    System.out.print(test.dig.get(a)+" ");
  }
  }
}