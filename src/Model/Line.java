package Model;

public class Line {
    private String item;
    private int quantity;
    private double unitPrice;

    private double totalPrice;


    public Line()
    {
        item = "";
        quantity = 0;
        unitPrice = 0;
        totalPrice = 0;

    }
    public Line (String item, int quantity, int unitPrice)
    {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = getTotalPrice();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return (unitPrice * quantity);
    }

    @Override
    public String toString() {
        return " Line{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                "}\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
    }
}
