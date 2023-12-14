package NIO.Files_Class;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

  public static void main(String[] args) throws IOException {

    String sourceName = "java/main/src/NIO/Files_Class/source", targetName = "java/main/src/NIO/Files_Class/target", oldPackagesName = "older";
    String packageName;

    // Copy package1.txt from source to target
    packageName = "package1.txt";
    Files.copy(Paths.get(sourceName + File.separator + packageName),
        Paths.get(targetName + File.separator + packageName),
        StandardCopyOption.REPLACE_EXISTING);
    System.out.println("File '" + packageName + "' copied from '" + sourceName + "' to '" + targetName + "'");

    // Delete package1.txt from source
    Files.delete(Paths.get(sourceName + File.separator + packageName));
    System.out.println("File '" + packageName + "' deleted from '" + sourceName + "'");

    // Move package2.txt from target to older (creates older directory before move)
    Files.createDirectory(Paths.get(targetName + File.separator + oldPackagesName));
    System.out.println("Directory '" + oldPackagesName + "' created in '" + targetName + "'");
    packageName = "package2.txt";
    Files.move(Paths.get(targetName + File.separator + packageName),
        Paths.get(targetName + File.separator + oldPackagesName + File.separator + packageName),
        StandardCopyOption.REPLACE_EXISTING);
    System.out.println("File '" + packageName + "' moved from '" + targetName + "' to '" +
        targetName + File.separator + oldPackagesName +
        "'");
  }
}
