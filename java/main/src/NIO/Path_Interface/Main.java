package NIO.Path_Interface;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws IOException {

    // absolute path is like :
    // '/Users/safwankherallah/Documents/DCI_Java/Java_Files_and_IO/java/main/resources/movies.txt'


    String fileName = "java/main/resources/movies.txt";
    Path filePath = Paths.get(fileName);
    System.out.println("Path '"+filePath+"' is "+ (filePath.isAbsolute() ? "absolute" : "relative"));
    try {
      Path realFilePath = filePath.toRealPath();
      System.out.println("Path '"+realFilePath+"' is "+ (realFilePath.isAbsolute() ? "absolute" : "relative"));
    }catch (IOException e){
      e.printStackTrace(System.err);
    }

    /**
     * Output:
     * Path 'java/main/resources/movies.txt' is relative
     * Path '/Users/safwankherallah/Documents/DCI_Java/Java_Files_and_IO/java/main/resources/movies.txt' is absolute
     * */
  }
}
