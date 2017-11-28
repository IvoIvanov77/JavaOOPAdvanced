package e_reflection;

public abstract class SuperTest implements ISuperTest{

    public String superTestField;

    public SuperTest(String superField) {
        this.superTestField = superField;
    }

    protected SuperTest(){
        this.superTestField = "I am SUPER field";
    }
}
