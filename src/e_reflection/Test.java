package e_reflection;

public class Test extends SuperTest implements ITest{

    private String testField;


    public Test(String superField) {
        super(superField);
        this.testField = "Nothing";
    }

    protected Test(String superField, String testField) {
        super(superField);
        this.testField = testField;
    }

    private Test(){
        super();
        this.testField = "I am just a field";
    }

    @Override
    public void superTestMethod() {

    }

    @Override
    public void testMethod() {

    }

    @Override
    public String toString() {
        return "Test{" +
                "testField='" + testField + '\'' +
                '}';
    }
}
