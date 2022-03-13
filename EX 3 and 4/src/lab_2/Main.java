package lab_2;

import java.util.Random;
import java.util.Scanner;


public class Main {
 static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        console_player currentPlayer = new console_player();
        System.out.println("enter :\n 1 for easy game\n 2 for fixed word \n 3 for random word \n Thanks");
        int x=in.nextInt();
        switch (x) {
            case 1:
                word_generator generator = new Easy_wordgenerator();
                currentPlayer.startanewgame(generator);
                currentPlayer.getnextletter();
                break;
            case 3:
            word_generator generatorr = new random_wordgenerator();
            currentPlayer.startanewgame(generatorr);
            currentPlayer.getnextletter();
            break;
            case 2:
                word_generator generatorrr = new Fixed_wordgenerator();
                currentPlayer.startanewgame(generatorrr);
                currentPlayer.getnextletter();
                break;
            default:
                System.out.println("Wrong choice,for that we will send you to default game");
                currentPlayer.startanewgame();
                currentPlayer.getnextletter();
                break;
        }

    }
}
