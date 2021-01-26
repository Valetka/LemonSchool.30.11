package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException{
        String[] pretexts = {"в", "без", "до", "из", "к", "на", "по", "о", "от", "перед", "при", "через", "с", "у", "за", "над", "об", "под", "про", "для"};
        getWordCount("У лукоморья дуб зеленый.txt", pretexts);
    }

    public static void getWordCount(String filename, String[] pretexts) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;
        int pret = 0;

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(" ");
            for(String word: array){
                for (String pretext: pretexts){
                    if (word.equals(pretext)){
                        pret++;
                    }
                }
            }
            words = words + array.length;
        }
        System.out.println("Number of words: " + words);
        System.out.println("Number of pretexts: " + pret);
        scanner.close();
    }
}
