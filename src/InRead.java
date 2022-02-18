import java.io.*;



class InRead {



public static void main(String[] args) {
try {
FileReader fr = new FileReader("test.txt");
BufferedReader br = new BufferedReader(fr);
String str;
while ((str = br.readLine()) != null) {
System.out.println(str + "\n");
}



br.close();
} catch (IOException e) {
System.out.println("file not found");
}



}
}
