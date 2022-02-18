import javax.swing.*;

class Add1 {

public static void main(String[] args) {
        try{
        String num1Str = JOptionPane.showInputDialog("Input?");
        int num1 = Integer.parseInt(num1Str);

        String num2Str = JOptionPane.showInputDialog("Input?");
        int num2 = Integer.parseInt(num2Str);
        int total = num1 + num2;
        System.out.println("the total is " + total);
        }catch(NumberFormatException nfe){
            System.out.println("Please enter an integer");
        }
    }
}
