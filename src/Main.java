import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /*Допустим, у нас есть магазин. В нашем магазине есть товары трех категорий: продукты, электроника, одежда.
    У каждого товара есть цена, наименование категория к которой он относится.
    Важно, что после создания товара ни одно из его свойств не должно быть, доступно для изменения,
    т.е. все поля должны быть private. Создать список товаров
    метод, который получает список товаров и формирует Map<String,Double> где ключ – наименование товара, значение – цена
    */

    public static void main(String[] args) {
        Produkt iphon = new Produkt("iPhone", Category.electronics, 1000);
        Produkt milk = new Produkt("Healthy Milk", Category.products, 10);
        Produkt socks = new Produkt("Happy sock", Category.clothes, 8);

        ArrayList productsList = new ArrayList<Produkt>(List.of(iphon, milk, socks)); //список товаров
        System.out.println(productsList);  //вывод списка товаров

        Map priceList = priceList(productsList); //вызов метода Map где ключ – наименование товара, значение – цена.
        System.out.println("Pricelist: " + priceList);

        iphon.setPrice(1100);
        System.out.println("New " + iphon.getName() + " price: " + iphon.getPrice());

        iphon.setPrice(1200);
        System.out.println("New " + iphon.getName() + " price: " + iphon.getPrice());

        iphon.setPrice(1300);
        System.out.println("New " + iphon.getName() + " price: " + iphon.getPrice());

        System.out.println("Price history: " +  iphon.getPriceHistory());
    }

    public static Map<String, Double> priceList(ArrayList<Produkt> array) { //Метод где ключ – наименование товара, значение – цена.
        Map priceListMap = new HashMap<>();
        for (int i = 0; i < array.size(); i++) {
            priceListMap.put(array.get(i).getName(), array.get(i).getPrice());
        }
        return priceListMap;

    }

}
