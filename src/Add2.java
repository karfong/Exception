import javax.swing.*;

class Add2 {

public static void main(String[] args) {
        try{
        String num1Str = JOptionPane.showInputDialog("Input?");
        int num1 = Integer.parseInt(num1Str);

        String num2Str = JOptionPane.showInputDialog("Input?");
        int num2 = Integer.parseInt(num2Str);
        int answer = num1/num2;
        System.out.println("the answer is: " + answer);
        }catch(ArithmeticException ae){
            System.out.println("Second number can't be zero");
        }
    }
}
