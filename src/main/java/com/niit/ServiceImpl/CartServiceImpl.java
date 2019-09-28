package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Service.CartService;
import com.niit.dao.CartDAO;
import com.niit.model.Cart;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDAO cartdao;

	public boolean addCart(Cart cart) {
		cartdao.addCart(cart);
		return true;
	}

	public boolean deletCart(Cart cart) {
		cartdao.deleteCart(cart);
		return true;
	}

	public Cart getCartById(int cartId) {
		Cart cart = cartdao.getCartById(cartId);
		return cart;
	}

	public List<Cart> getCartList() {
		return cartdao.getCartList();
	}
	
	
}