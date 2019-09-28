package com.niit.Backend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.Service.CartService;
import com.niit.model.Cart;
import com.niit.model.Product;
import com.niit.model.User;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppContext.class)
public class CartTest {
	
	@Autowired
	CartService cartservice;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		cartservice = null;
	}

	@Test
	public void addCart()
	{
		Cart cart = new Cart();
		cart.setQuantity(2);
		cart.setTotalPrice(200);
		cart.setProductId(1);
		
		assertEquals(true, cartservice.addCart(cart));
	}
}
