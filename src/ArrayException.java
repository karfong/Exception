public class ArrayException {

public static void main(String[] args) {
int[] numbers = new int[5];

try{
   for(int i = 0; i<6; i++)
    {
    numbers[i] = i;
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
