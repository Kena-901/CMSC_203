/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: The BevShop offers 3 types of beverages: Coffee, Alcoholic and Smoothie. Beverages can 
 * 				be ordered in 3 different sizes: Small, medium, and large. All the beverage types have a 
 * 				base price. In addition, there are additional charges depending on the size and specific 
 * 				add-ons for each type of beverage. Create a Program to run the BevShop.
 * Due: 12/09/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Kenawak Abebe
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
	Order orderTwo,  orderOne;
	BevShop test ;

	@BeforeEach
	void setUp() throws Exception {
		 test = new BevShop();
		 orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		 orderTwo = new Order(12, Day.SATURDAY, new Customer("John", 45));

	}

	@AfterEach
	void tearDown() throws Exception {
		orderTwo= orderOne= null;
		test =null;
	}

	@Test
	void testIsValidTime() {
		assertTrue(test.isValidTime(9));
		assertFalse(test.isValidTime(2));
		assertFalse(test.isValidTime(24));

	}

	@Test
	void testIsMaxFruit() {
		assertFalse(test.isMaxFruit(3));
		assertTrue(test.isMaxFruit(7));
	}

	@Test
	void testIsEligibleForMore() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertTrue(test.isEligibleForMore());
	}

	@Test
	void testIsValidAge() {
		
		assertFalse(test.isValidAge(19));
		assertTrue(test.isValidAge(21));

	}

	@Test
	void testStartNewOrder() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(1, test.getNumOfAlcoholDrink());
	}

	@Test
	void testProcessCoffeeOrder() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(test.getOrderAtIndex(0), test.getCurrentOrder());
	}

	@Test
	void testProcessAlcoholOrder() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processAlcoholOrder("Beer", Size.SMALL);
		
		assertEquals(1, test.getNumOfAlcoholDrink());
	}

	@Test
	void testProcessSmoothieOrder() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		
		assertEquals(test.getOrderAtIndex(0), test.getCurrentOrder());
	}

	@Test
	void testFindOrder() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(0, test.findOrder(test.getCurrentOrder().getOrderNumber()));
	}

	@Test
	void testTotalOrderPrice() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(8.6, test.totalOrderPrice(test.getCurrentOrder().getOrderNumber()));
	}

	@Test
	void testTotalMonthlySale() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(8.6, test.totalMonthlySale());
	}

	@Test
	void testTotalNumOfMonthlyOrders() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(8.6, test.totalMonthlySale());
	}

	@Test
	void testGetCurrentOrder() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		
		assertEquals(test.getCurrentOrder(),test.getOrderAtIndex(0));
	}

	@Test
	void testGetOrderAtIndex() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		assertEquals(test.getCurrentOrder(), test.getOrderAtIndex(0));
	}

	@Test
	void testSortOrders() {
		test.startNewOrder(11, Day.SUNDAY, "Alex", 22);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		test.startNewOrder(15, Day.MONDAY, "Tom", 24);
		test.processSmoothieOrder("Latte", Size.SMALL, 3, false);
		test.processAlcoholOrder("Beer", Size.SMALL);
		test.processCoffeeOrder("Latte", Size.SMALL, true, false);
		
		test.sortOrders();
		
		assertEquals(-1,test.getOrderAtIndex(0).compareTo(test.getOrderAtIndex(1)));
		
		
	}

}
