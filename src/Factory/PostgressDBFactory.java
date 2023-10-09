package Factory;

import Factory.Components.PostgressDBQuery;
import Factory.Components.PostgressDBTransaction;
import Factory.Components.Query;
import Factory.Components.Transaction;

public class PostgressDBFactory implements DataBaseFactory {

    public Query createQuery(){
        return new PostgressDBQuery();
    }

    public Transaction createTransaction(){
        return new PostgressDBTransaction();
    }
}
