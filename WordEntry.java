

/**
 * Created by 1 on 4/18/2017.
 */
public class WordEntry {

    private String word;
    private int numAppearance;
    private int score;
    private int totalScore;


    public WordEntry(String word, int score) {
        this.word = word;
        this.score=score;
        this.totalScore+=score;
        this.numAppearance = 1;

    }

    public void addNewAppearance(int score){
        this.score = score;
        this.totalScore+=score;
        ++this.numAppearance ;

    }



    public double getScore(){return (double)score;}

    public String getWord() {
        return this.word;
    }

    public double getAverange(){
       return (double)totalScore/(double)numAppearance;
    }


}
