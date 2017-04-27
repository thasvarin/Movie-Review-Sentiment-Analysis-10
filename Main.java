import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws IOException {
        HashTable hashTable = new HashTable();
        BufferedReader br = new BufferedReader(new FileReader("MR.txt"));
        for (String line; (line = br.readLine()) != null; ) {
            int index = 2;
            int lastIndex = 2;
            int score = Character.getNumericValue(line.charAt(0));

            String word;

            //System.out.println(score);
            while (lastIndex != line.length()) {
                if (line.charAt(lastIndex) == ' '){
                    word = line.substring(index,lastIndex);


                    hashTable.put(word,score);
                    hashTable.getAverage(word);

                    index = lastIndex+1;
                }/*else if (line.charAt(lastIndex) == '\'' ){
                    index+=3;
                    lastIndex+=2;
                }else if (line.charAt(lastIndex) == ','||line.charAt(lastIndex) == '`'){
                    index+=2;
                    lastIndex+=1;
                }
*/


                lastIndex++;


            }

           // hashTable.printWordSelect("fun");

        }
        //hashTable.printAll();

        hashTable.printAverageAll();

    }
}

