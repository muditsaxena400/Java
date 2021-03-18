
import java.util.List;

import com.model.pkart.Customer;
import com.model.pkart.Product;

public interface IProductService {
	
	boolean add(Product product);

	boolean update(Product product);

	Product getProduct(int productId);
	
	List<Product> getAllProducts();
}
