package Main;

import java.util.ArrayList;

public abstract class num_sequence extends sequence {

public num_sequence(){}


    @Override
    public abstract Object AcceptAggregator(aggregator aggregatorObject);

    @Override
    public abstract ifilterable AcceptFilter(filter filterObject);

    @Override
    public ArrayList<Object> Accept_filter(filter filterobject) {
        return null;
    }

    @Override
    public Object Accept_aggregator(aggregator aggregatorobject) {
        return null;
    }
    public abstract void Square_number();
}
