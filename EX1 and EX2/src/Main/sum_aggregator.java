package Main;

import java.util.ArrayList;
import java.util.List;

public class sum_aggregator extends aggregator {

    @Override
    public Object Doaggregator(ArrayList<Object> list) {
        int sum =0;
        for (Object x : list) {
            sum+=(int)x;
        }
        return sum;
    }
}
