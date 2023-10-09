package Factory;

import Factory.Components.MongoDBQuery;
import Factory.Components.MongoDBTransaction;
import Factory.Components.Query;
import Factory.Components.Transaction;

public class MongoDBFactory implements DataBaseFactory{

    public Query createQuery(){
        return new MongoDBQuery();
    }

    public Transaction createTransaction(){
        return new MongoDBTransaction();
    }
}
