package osp_lsp.lab.P04_DetailPrinter;

public class DetailsPrinter {

    private Iterable<IEmployer> employees;

    public DetailsPrinter(Iterable<IEmployer> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        for (IEmployer employee : employees) {
            System.out.println(employee.print());
        }
    }


}
