package lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class single_game {

    private String secret;
    private String dis_secret;

    private int count = 0;
    private Game_state state;
    word_generator generator;

    public single_game() {
        this.secret = "java";
        this.dis_secret = get_size(this.secret.length());
        this.count = 0;

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public single_game(word_generator generator) {
        this.secret = generator.word_generator();
        this.dis_secret = get_size(this.secret.length());
    }

    public Game_state Accept_Guess(char k) {
        int pos = this.secret.indexOf(k);
        if (pos == -1) {

            this.count++;
        }
        return this.GameState();
    }

    public Game_state GameState() {
        if (this.count == 6 && (this.dis_secret.contains("*"))) {

            state = Game_state.Lose;
            return state;
        } else if (this.count < 6 && !(this.dis_secret.contains("*"))) {

            state = Game_state.Win;
            return state;
        } else if (this.count == 0 && !(this.secret.contains("*"))) {
            state = Game_state.new_Game;
            return state;
        } else {
            state = Game_state.Running;
            return state;
        }


    }

    public static Scanner in = new Scanner(System.in);

    public void set(String secret) {
        this.secret = secret;
        this.dis_secret = get_size(this.secret.length());
    }


    public void getHiddenWord() {
        System.out.println(this.dis_secret);
    }

    public String getWord() {
        return this.dis_secret;
    }

    public String getWword() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setDis_secret(String dis_secret) {
        this.dis_secret = dis_secret;
    }

    public String replace_char(String word, int index, char c) {
        return word.substring(0, index) + c + word.substring(index + 1);
    }

    public String get_size(int size) {
        char[] temp = new char[size];
        Arrays.fill(temp, '*');
        return new String(temp);
    }


}
