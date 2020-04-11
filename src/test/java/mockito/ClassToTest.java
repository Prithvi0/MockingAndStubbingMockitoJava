package mockito;

public class ClassToTest {
    private final MyDatabase myDatabase;

    public ClassToTest(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    public boolean query(String query) {
        return this.myDatabase.query(query);
    }
}
