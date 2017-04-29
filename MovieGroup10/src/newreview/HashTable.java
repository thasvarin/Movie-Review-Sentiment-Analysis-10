package newreview;

public class HashTable {

    private WordEntry[] Word;
    private int size;

    public HashTable(int size) {
        this.size = size;
        Word = new WordEntry[size];
    }

    public int compute(String reviewText) {
        int x = 2;
        reviewText = reviewText.toLowerCase();
        for (int temp = 0; temp < reviewText.length(); temp++) {
            x = (x * 2) + reviewText.charAt(temp);
            x = x % size;
        }
        return x;
    }

    public double getAverage(String word) {
        double x = 2;
        if (contains(word)) {
            x = Word[compute(word)].getAverage();
        }
        return x;
    }

    public void put(String word, double score) {
        if (contains(word)) {
            Word[compute(word)].addNewAppearance(score);
        } else {
            Word[compute(word)] = new WordEntry(word, score);
        }
    }

    public boolean contains(String s) {
        boolean x = false;
        if (Word[compute(s)] != null) {
            x = true;
        }
        return x;
    }
}
