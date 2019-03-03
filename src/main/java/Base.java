/**
 * @author Литвинцова Юлия
 */

import java.io.*;
import java.util.*;

public class Base {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Integer> wordStat = new TreeMap<String, Integer>();
            int maxCount = 0;
            String maxCountWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                Integer count = wordStat.get(word);
                if (count == null) {
                    count = 0;
                }
                wordStat.put(word, ++count);
                if (maxCount < count) {
                    maxCount = count;
                    maxCountWord = word;
                }
            }
            System.out.println(wordStat);
            System.out.println("Слово с максимальным количеством повторений: " + maxCountWord + " - " + maxCount);
        } catch (FileNotFoundException io_exc) {
            System.out.println("Файл не найден: " + io_exc);
        }
    }
}
