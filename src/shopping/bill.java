/**
 * 
 */
package shopping;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**madhur
 *
 */
class bill {

	@Test
	void test() {
		shopping test = new shopping();
		int output=test.Bill();
		assertEquals(0,output);
	}

}
