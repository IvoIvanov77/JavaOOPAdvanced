package osp_lsp.lab.P04_DetailPrinter;

public class Manager extends Employee {

    private Iterable<String> documents;

    private Manager(String name, Iterable<String> documents) {
        super(name);
        this.documents = documents;
    }

    @Override
    public String print() {
        return super.print() + this.documents.toString();
    }
}
