import java.util.List;

public interface Iproduct {
       boolean addProduct(String product);
       String getProduct(String food);
       List<String> displayProducts();
       void deleteProducts(int id);
}
