package sem4;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {
//        Create a FileCreate a File
        File file = new File("abc.txt");
        if (file.createNewFile()){
            System.out.println("File created: " + file.getName());
        }
        else {
            System.out.println("file is already exists !!");
        }
//        write() method to write some text to the file we created in the example above. Note that when you are done writing to the file, you should close it with the close() method:
    }
}
