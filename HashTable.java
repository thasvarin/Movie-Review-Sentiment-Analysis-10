

public class HashTable {

    private WordEntry[] Word;
    private int size;
    public HashTable(int size) {
        this.size = size;
        Word = new WordEntry[size];
    }

    public int computeHash(String reviewText) {
        int x = 2;
        reviewText = reviewText.toLowerCase();
        for (int temp = 0; temp < reviewText.length(); temp++) {
            x = (x * 2) + (int) reviewText.charAt(temp);
            x = x % size;
        }
        return x;
    }

    public double getAverage(String reviewText) {
        double x = 2.0;
        if (contains(reviewText)) {
            x = Word[computeHash(reviewText)].getAverage();
        }
        return x;
    }

    public void put(String reviewText, int score) {
        if (contains(reviewText)) {
            Word[computeHash(reviewText)].addNewAppearance(score);
        } else {
            Word[computeHash(reviewText)] = new WordEntry(reviewText, score);
        }
    }

    public boolean contains(String s) {
        boolean still = false;
        if (Word[computeHash(s)] != null) {
            still = true;
        }
        return still;
    }
}
