package osp_lsp.lab.P05_Square;



public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());
        Square square = new Square();
//        square.setHeight(5);
//        square.setWidth(3);
        square.setSide(10);

        System.out.println(square.getArea());
    }
}
