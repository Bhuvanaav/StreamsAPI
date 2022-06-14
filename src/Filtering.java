
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(2, "HP Laptop", 35000));
        productList.add(new Product(1, "Sony Laptop", 25000));
        productList.add(new Product(3, "Lenovo Laptop", 40000));
        productList.add(new Product(5, "Apple Laptop", 65000));
        productList.add(new Product(4, "Dell Laptop", 45000));

        System.out.println(productList);

        Map<Integer, Integer> productList1 = productList.stream()
                /*.filter(product -> product.price > 30000)
                .map(Product :: getPrice)*/
                .collect(Collectors.toMap(product -> product.id, product -> product.price));
        System.out.println(productList1);
    }


}
