package Factory.Components;

public class MongoDBQuery implements Query{

    public Query getQuery(){
        return new MongoDBQuery();
    }
}
