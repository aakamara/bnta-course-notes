import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("src/hello.text");

        if (!file.exists()){ //does this file exist
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("hello world");

        printWriter.flush();
        printWriter.close();
    }
}
