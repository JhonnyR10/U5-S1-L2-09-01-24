package giovannilongo.U5S1L2090124.entities;


public abstract class MenuItem {
    private String name;
    private double price;
    private int nutritionalInfo;

    public MenuItem(String name, double price, int nutritionalInfo) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nutritionalInfo=" + nutritionalInfo +
                '}';
    }
}
