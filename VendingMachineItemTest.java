package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineItemTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test  // Test for item "Reeses" at $2.00
	public void testVendingMachineItem() {
		VendingMachineItem Reeses = new VendingMachineItem();
		assertEquals("Reeses", 2.00);
	}

	@Test // Test name "Chips"
	public void testGetName() {
		VendingMachineItem "Chips" = new GetName();
		assertEquals("Chips");
	}

	@Test // Test to see that Mint are $ 1.00
	public void testGetPrice() {
		VendingMachineItem "Mints" = new GetPrice();
		assertEquals("Mints", 1.00, 0.1);
	}

}
