package Main;

import java.util.ArrayList;

public abstract class sequence implements iaggregatable,ifilterable {
    public ArrayList<Object>List;
    protected Object start_element;
    protected Object end_element;



    public  ArrayList<Object> Generate_list ()
    {
       this.List=new ArrayList<Object>();

       return List;
    }
    public abstract ArrayList<Object> Accept_filter (filter filterobject);
    public abstract Object Accept_aggregator (aggregator aggregatorobject);




}
