package osp_lsp.lab.P04_DetailPrinter;

public abstract class Employee implements IEmployer{

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    @Override
    public String print() {
        return this.getName();
    }
}
