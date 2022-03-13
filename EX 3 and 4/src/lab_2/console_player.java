package lab_2;


import java.util.Scanner;

public class console_player extends player {


    @Override
    public void Win() {
        System.out.println("you Are Winner *-*");

    }

    @Override
    public void Lose() {
        System.out.println("you Are loser *^*");

    }

    @Override
    public void get_Next_Letter() {

        Scanner in = new Scanner(System.in);

      // if (!(this.getCurrentgame().GameState().getValue().equalsIgnoreCase("player is Win") || this.getCurrentgame().GameState().getValue().equalsIgnoreCase("player is lose"))) {
           System.out.print("enter the next charter:\n");
           char input = in.nextLine().charAt(0);
           super.Make_Guess(input);




    }

    @Override
    public void Output_Result(String jh) {

        System.out.println(jh);
    }


}
