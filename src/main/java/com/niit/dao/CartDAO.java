package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;

public interface CartDAO 
{

  public boolean addCart(Cart cart);
   
  public boolean deleteCart(Cart cart);
   
  public List<Cart> getCartList();
  
  public Cart getCartById(int cartId);
  
}
