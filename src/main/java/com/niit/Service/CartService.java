package com.niit.Service;

import java.util.List;

import com.niit.model.Cart;



public interface CartService {
	
	public boolean addCart(Cart cart);
	
	public boolean deletCart(Cart cart);
	
	public Cart getCartById(int Id);
	
    public List<Cart> getCartList();

}
