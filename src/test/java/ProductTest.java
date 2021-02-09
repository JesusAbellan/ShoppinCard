import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testEquals() {
		Product p1 = new Product("PS5",500);
		Product p2 = new Product("PS5",499);
		assertTrue(p1.equals(p2));
	}

}
