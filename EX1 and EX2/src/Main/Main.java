package Main;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fib_sequence x = new Fib_sequence(10);
        System.out.print("even number:\n");
        x.Accept_filter(new even_number_filter());
        System.out.println();
        System.out.print(" sum of even number:\n");
        int m=(int)x.AcceptAggregator(new sum_aggregator() );
        System.out.println(m);
        System.out.print(" Square of even number:\n");
        x.Square_number();
        /*
        *
        *
        *
        *
        *
        *
        *
        * */
        text_sequence text=new text_sequence("java");
        System.out.println("the word:");
        text.print_List();
        System.out.println("convert the word to numbers:");
       text.replace_word();

    }

}
