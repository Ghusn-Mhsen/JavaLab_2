package lab_2;

import java.util.ArrayList;
import java.util.Random;

public class random_wordgenerator extends word_generator {
    Random random_object=new Random();
   ArrayList<String>Words_rand=new ArrayList<String>() ;

    public random_wordgenerator() {
        Words_rand.add("html");
        Words_rand.add("python");
        Words_rand.add("scratch");
        Words_rand.add("delphi");
        Words_rand.add("pascal");

    }

    @Override
    public String word_generator() {
       int y=random_object.nextInt(Words_rand.size());
        return  Words_rand.get(y);
    }
}
