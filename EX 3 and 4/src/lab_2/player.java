package lab_2;

public abstract class player extends game_rules {
    private single_game Current_Game;


    public abstract void Win();

    public abstract void Lose();

    public abstract void get_Next_Letter();

    public abstract void Output_Result(String j);

    public single_game Start_New_Game() {
        Current_Game = new single_game();
        return Current_Game;
    }

    public single_game Start_New_Game(word_generator generator) {
        Current_Game = new single_game(generator);
        return Current_Game;
    }

    public String Make_Guess(char c) {
        int index_char = Current_Game.getWword().indexOf(c);
        if (this.check_repeat(c)) {
            System.out.println("don't guess this character again");
            int cc = Current_Game.getCount();
            --cc;
            Current_Game.setCount(cc);


        } else {
            Game_state g = Current_Game.Accept_Guess(c);

            if ((g == Game_state.Running && index_char != -1) || g == Game_state.new_Game && index_char != -1) {

                Current_Game.setDis_secret(Current_Game.replace_char(Current_Game.getWord(), index_char, c));
                Current_Game.setSecret(Current_Game.replace_char(Current_Game.getWword(), index_char, '*'));
            } else if (g == Game_state.Win) {
                this.Win();
                return "";
            } else if (g == Game_state.Lose) {
                this.Lose();
                return "";

            }
        }
        String word = Current_Game.getWord();
        this.Output_Result(word);
        this.get_Next_Letter();

        return word;


    }

    @Override
    public boolean check_repeat(char c) {

        int index = (int) (c - 'a');
        if (Current_Game.getWword().contains(String.valueOf(c)))
            return false;
        if (x[index] == true) {

            return true;
        } else {
            x[(int) (c - 'a')] = true;
            return false;
        }

    }

    public single_game get_Current_Game() {
        return Current_Game;
    }
}
