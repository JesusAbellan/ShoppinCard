import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	ShoppingCart sc;
	@BeforeEach
	void setup() {
		sc = new ShoppingCart();
	}
	@Test
	void testAddItem() {
		Product p = new Product("Test",10);
		sc.addItem(p);
		assertEquals(1,sc.getItemCount());
	}

	@Test
	void testRemoveItem() throws Exception{
		Product p = new Product("Test",10);
		sc.addItem(p);
		sc.removeItem(p);
		assertEquals(0,sc.getItemCount());
		assertThrows(Exception.class, () -> sc.removeItem(p),"El item p no se encuentra en el carrito");
	}

	@Test
	void testEmpty() {
		Product p = new Product("Test",10);
		sc.addItem(p);
		sc.empty();
		assertEquals(0,sc.getItemCount());
	}
	
	@Test
	void testGetBalance() {
		Product p = new Product("Test",10);
		sc.addItem(p);
		p = new Product("Test2",15);
		sc.addItem(p);
		assertEquals(25,sc.getBalance());
	}
	
	@Test
	void testGetItemCount() {
		assertEquals(0,sc.getItemCount());
	}

}
