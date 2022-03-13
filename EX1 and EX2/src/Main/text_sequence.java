package Main;

import java.util.ArrayList;

public class text_sequence extends text {
    private  String word;

    public void setWord(String word) {
        this.word = word;
    }

    text_sequence(String word) {
        this.word=word;
       ArrayList<Object>a= super.Generate_list();
        ArrayList<Object>List= super.Generate_list();
        for (int i = 0; i < this.word.length(); i++) {
            a.add(this.word.charAt(i));
        }
        this.List.clear();
        for (Object c:a) {
            this.List.add(c);
        }
    }

    public void print_List() {

        for (Object x :this.List) {

            System.out.println(x);
        }
    }

    public void replace_word() {
        ArrayList<Object> a = new ArrayList<Object>();

        for (int i = 0; i < this.List.size(); i++) {
            char m = (char) List.get(i);
            a.add(((m - 'a')+1));
        }
        this.List.clear();
        for (Object x : a) {
            List.add(x);
        }
this.print_List();

    }
}


