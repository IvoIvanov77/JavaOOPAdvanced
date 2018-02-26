package osp_lsp.lab.P05_Square;

public class Square extends Rectangle {


    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(int width) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void setHeight(int height) {
        throw new UnsupportedOperationException("Unsupported operation");
    }


}
