package newreview;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        File reviewFile = new File("movieReviews.txt");
        Scanner sc = new Scanner(System.in);

        int reviewScore;
        String reviewText;
        String review;
        double s = 0;
        HashTable table = new HashTable(1000);

        System.out.println("Enter a your opinion :");
        review = sc.nextLine();
        String[] arr = review.split(" ");

        for (String word : arr) {
            Scanner reviewScanner = new Scanner(reviewFile);
            word = (" " + word + " ").toLowerCase();
            while (reviewScanner.hasNext()) {
                reviewScore = reviewScanner.nextInt();
                reviewText = reviewScanner.nextLine().toLowerCase();
                if (reviewText.contains(word)) {
                    table.put(reviewText, reviewScore);
                    s = table.getAverage(reviewText);
                }
            }
        }
        
        if (s > 2) {
            System.out.println("The review has an average value of " + s);
            System.out.println("Positive Sentiment");
        } else {
            System.out.println("The review has an average value of " + s);
            System.out.println("Negative Sentiment");
        }
    }
}
