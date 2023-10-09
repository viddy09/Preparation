package Factory;

import Factory.Components.Query;
import Factory.Components.Transaction;

public interface DataBaseFactory {

    public Query createQuery();

    public Transaction createTransaction();
}
