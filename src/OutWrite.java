import java.io.*;



class OutWrite {



public static void main(String[] args) {
try {
FileWriter fw = new FileWriter("Yourout.txt");
PrintWriter pw = new PrintWriter(fw);
pw.println("COS3024 4 credits");
pw.println("COS3033 3 credits");
pw.println("CPR3023 4 credits");
pw.println("CDB3023 3 credits");



pw.close();
System.out.println("written succesfully into Yourout.txt. Check the file");
} catch (IOException e) {
System.out.println("error");
}



}
}