package Factory;

import Factory.Components.Connection;
import Factory.Components.Refresh;

public class PostgressDB implements DataBase {

    public Connection createConnection() {
        return new Connection();
    }

    public Refresh refresh() {
        return new Refresh();
    }

    public DataBaseFactory getFactory() {
        return new PostgressDBFactory();
    }
}