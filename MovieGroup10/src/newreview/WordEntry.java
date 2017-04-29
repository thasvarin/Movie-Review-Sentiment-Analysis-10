package newreview;

public class WordEntry {

    private String word;
    private int numAppearances = 0;
    private int score = 0;
    private int totalScore = 0;

    public WordEntry(String word, double score) {
        this.word = word;
        this.totalScore += score;
        this.numAppearances = 1;
    }

    public void addNewAppearance(double score) {
        this.totalScore += score;
        this.numAppearances++;
    }

    public String getWord() {
        return word;
    }

    public double getAverage() {
        return (double) totalScore / numAppearances;
    }
}
