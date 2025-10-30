import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Текущая рабочая директория: " + System.getProperty("user.dir"));
        String name = "src\\ttt.txt";
        List<String> str = Files.readAllLines(Paths.get(name));
        for(int i = 0; i < str.size(); i += 2){
            String s = (str.get(i));
            System.out.print(s);
            System.out.println();
        }
    }
}