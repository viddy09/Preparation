package Factory;

import Factory.Components.Connection;
import Factory.Components.Refresh;

public interface DataBase {

    public Connection createConnection();

    public Refresh refresh();

    public DataBaseFactory getFactory();
}
