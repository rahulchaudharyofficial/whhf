package in.rahulchaudharyofficial.api.v01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TypeTest {

	@Test
	void testGetIntSize() {
		assertTrue(Type.getIntSize() == Integer.MAX_VALUE);
	}

}
