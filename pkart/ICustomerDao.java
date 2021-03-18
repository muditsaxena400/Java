
import java.util.List;

import com.model.pkart.Customer;
import com.model.pkart.Product;

public interface ICustomerDao {

	//void addProducts(Product product);
	
	void selfRegister(Customer customer);
	
	boolean viewNonExpiredProducts(Customer customer);
	
	Customer viewCart(int customerId);
	
	List<Customer> viewCustomer();

}
