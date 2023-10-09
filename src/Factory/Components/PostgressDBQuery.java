package Factory.Components;

public class PostgressDBQuery implements Query{
    public Query getQuery(){
        return new PostgressDBQuery();
    }
}
