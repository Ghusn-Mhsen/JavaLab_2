package lab_2;

public enum  Game_state  {
   new_Game ("start new Game"),
    Win ("player is Win"),
    Lose ("player is lose"),
    Running ("Game is continue");

private  String value;
    Game_state(String s) {
        this.value=s;
    }



    public String getValue() {
        return value;
    }
}
