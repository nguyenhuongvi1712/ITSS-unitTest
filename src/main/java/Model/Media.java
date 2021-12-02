package Model;

public class Media {
    private String name;
    private boolean isRushProduct ;

    public Media(){}

    public Media(String name, boolean isRushProduct) {
        this.name = name;
        this.isRushProduct = isRushProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsRushProduct() {
        return isRushProduct;
    }

    public void setIsRushProduct(boolean rushProduct) {
        isRushProduct = rushProduct;
    }
}
