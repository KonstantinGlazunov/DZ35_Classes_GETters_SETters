import java.util.ArrayList;

public class Produkt {
    /*Реализовать в классе Товар возможность изменения цены.
    При этом система не должна давать возможность поставить отрицательную цену или 0
 **НЕОБЯЗАТЕЛЬНОЕ.Добавить возможность вести истории изменения цены у товара.*/

    private String name;
    private Category category;
    private double price;

    private ArrayList priceHistory = new ArrayList<>();

    public Produkt(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            priceHistory.add(this.price);
            this.price = price;

        }
    }
    public ArrayList getPriceHistory(){
        return priceHistory;
    }
}
