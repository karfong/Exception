import java.util.Scanner;
import javax.swing.*;
public class ArrayException2 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] numbers = new int[5];

try{
   for(int i = 0; i<6; i++)
    {
    String num1Str = JOptionPane.showInputDialog("Input?");
        numbers[i] = Integer.parseInt(num1Str);

         System.out.println(numbers[i]);
   
    } 
}catch(ArrayIndexOutOfBoundsException e){
    System.out.println("exceeding array size");
}catch(NumberFormatException el){
    System.out.println("Invalid format");
}
finally{
    System.out.println("finally.....");
}
}
}
