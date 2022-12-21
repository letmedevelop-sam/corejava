package literals;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        //String fileName = "src/main/resources/sample.txt";
        BufferedReader inputStream = new BufferedReader(new FileReader("src/main/resources/xanadu.txt"));
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get("src/main/resources/xanadu.txt"));
            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println(sb);
    }
}
