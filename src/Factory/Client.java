package Factory;

import Factory.Components.Query;

public class Client {
    public static void main(String[] args) {
        DataBase db = new PostgressDB();
        DataBaseFactory dbf = db.getFactory();
        Query query = dbf.createQuery();

    }
}
