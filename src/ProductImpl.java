import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements Iproduct{
  ArrayList<String> stuff = new ArrayList<>();
    @Override
    public boolean addProduct(String product) {
        return stuff.add(product);

    }

  @Override
    public String getProduct(String food) {
        if (stuff.contains(food)){
          return food;
        }
        return "Food is unavailable";
    }

    @Override
    public List<String> displayProducts() {
        return stuff;
    }

    @Override
    public void deleteProducts(int id) {
        stuff.remove(id);
    }
}
