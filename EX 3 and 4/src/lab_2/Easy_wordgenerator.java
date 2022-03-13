package lab_2;

public class Easy_wordgenerator extends word_generator {
    String[]easy_word;
   public Easy_wordgenerator()
    {
        easy_word= new String[]{"food", "water", "sun", "moon", "air"};
    }
    @Override
    public String word_generator() {
       int m=(int) Math.random()*easy_word.length;
        return easy_word[m];
    }
}
