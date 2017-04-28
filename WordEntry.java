package test;
public class WordEntry {
  String word;
  int numAppearances=0;
  int score = 0;
  int totalScore = 0;
  
  public WordEntry(String text,int score){
    word = text;
    totalScore=score;
     numAppearances=1;
  }
  public void addNewAppearance(int s){
    totalScore+=s;
    numAppearances++;
  }
  public String getWord(){
    return word;
  }
  public double getAverage(){
    return (double)totalScore/numAppearances;
  }
}
