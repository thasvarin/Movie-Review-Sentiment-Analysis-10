import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 4/18/2017.
 */
public class HashTable {

    List<WordEntry> wordEntryList = new ArrayList<>();

    public int compute(String word){
        int x = 1;
        for (WordEntry a: wordEntryList){
            if(a.getWord().equals(word)){
                x++;
            }
        }
        return x;
    }

    public void put(String word, int score){

        if (contains(word)) {
             getWordEntry(word).addNewAppearance(score);
        }else {
            WordEntry a = new WordEntry(word,score);
            wordEntryList.add(a);
        }
    }

    public double getAverage(String word) {
        double x = 2.0D;
        if (contains(word)) {
            getWordEntry(word).getAverange();
        }
        return x;
    }

    public WordEntry getWordEntry(String word){
        WordEntry a = null;
        for (WordEntry s: wordEntryList){
            if (s.getWord().equals(word)){
                a = s;
            }
        }
        return a;
    }

    public boolean contains(String word){
        boolean x = false;
        for (WordEntry a: wordEntryList){
            if (a.getWord().equals(word)){
                x = true;
            }
        }
        return x;
    }

    public void printAll(){
        for (WordEntry a: wordEntryList){
            System.out.print(a.getWord()+" ");
        }
        System.out.println();
        for (WordEntry a: wordEntryList){
            System.out.print(a.getScore()+" ");
        }
        System.out.println();
    }

    public void printWordSelect(String word){
        System.out.println(getWordEntry(word).getAverange());
    }
}
