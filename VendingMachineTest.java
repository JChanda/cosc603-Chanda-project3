package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test // Test to add item "Gum" for $ 1.00
	public void testAddItem() {
		VendingMachine Gum = new addItem();
		assertArrayEquals("Gum", 1.00, 0.1);
	}

	@Test // Test to remove 'Gum' from slot A
	public void testRemoveItem() {
		VendingMachine Gum = new removeItem();
		assertArrayEquals("Gum", 1.00, 'A');
	}

	@Test //Test when $ 1.00 is inserted
	public void testInsertMoney() {
		VendingMachine dollars = new insertMoney();
		assertEquals(5.00, 1.00, .01)
	}

	@Test // Test to get balance
	public void testGetBalance() {
		VendingMachine balance = new getBalance();
		assertEquals(5.00, 2.00, .01)
	}

	@Test // Test when $ 1.00 purchase is made
	public void testMakePurchase() {
		VendingMachine buy = new makePurchase();
		assertArrayEquals(this.balance >= item.getPrice(), 1.00, 0.1);
	}

	@Test // Test to see if $1.00 is returned
	public void testReturnChange() {
		VendingMachine returr = new returnChange();
		assertArrayEquals(1.00, double change = this.balance, this.balance = 0;)
	}

}
