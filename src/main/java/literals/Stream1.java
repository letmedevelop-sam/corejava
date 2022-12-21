package literals;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Stream1 {

    public static void main(String[] args) {
        char[] characters = new char[8];
        try {
            InputStreamReader inputReader = new InputStreamReader(System.in, "utf-8");
            System.out.print("Write some characters :");
            int bytesread = inputReader.read(characters);
            System.out.println("I've read :" + bytesread + " characters from the InputStreamReader");
            System.out.println(Arrays.toString(characters));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String fileName = "src/main/resources/sample.txt";
        //
        try {
            InputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis,
                    StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            br.lines().forEach(line -> System.out.println(line));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


