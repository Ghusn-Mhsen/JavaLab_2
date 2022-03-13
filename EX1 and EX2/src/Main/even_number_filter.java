package Main;

public class even_number_filter extends filter {


    @Override
    public boolean IsAcceptable(Object obj) {
        return  ((int) obj)%2==0;
    }
}

