import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

  public static void main(String[] args) throws IOException {
    // System.out.println("Hello World !!!");
    try{
      // loading a file into in variable
      InputStream in = new FileInputStream("java/main/resources/students.txt");
      OutputStream  out = new FileOutputStream("java/main/resources/output.txt");
      // initializing  x to 0
      int x = 0;
      String name = "";
      // while loop until the end of the file
      while ((x = in.read()) != -1){
        // printing  each character
        System.out.println((char) x);
        name = name + (char) x;
      }
      System.out.println(name);
      // closing the file
      in.close();

      for (int index = 0; index < name.length(); index++) {
        out.write(name.charAt(index));
      }
      out.close();

    }catch (Exception e){
      System.out.println(e.getMessage());
    }

  }
}
