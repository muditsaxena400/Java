package com.service.pkart;

import java.util.List;

import com.model.pkart.Cart;

public interface ICartService {

	boolean viewProducts(Cart cart);
	
	Cart viewCart(int custId);
	
	List<Cart> viewProduct();
}
