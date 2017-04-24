package com.cubic.util;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathUtiltest {

	private MathUtil util = new MathUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeCLass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDOwn");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardDOwn");
	}

	@Test
	public void testAdd() {

		int result = util.add(5, 10);
		assertEquals(15, result);

	}

	@Test
	public void testSub() {
		int result = util.sub(10, 5);
		assertEquals(5, result);
		result = util.add(5, -10);
		assertEquals(-5, result);
		result = util.add(-5, -10);
		assertEquals(-15, result);
		result = util.add(-5, 10);
		assertEquals(5, result);
	}

	@Test
	public void testDiv() {
		int result = util.div(10, 10);
		assertEquals(1, result);
		result = util.div(-10, 10);
		assertEquals(-1, result);
		result = util.div(-10, -10);
		assertEquals(1, result);
		result = util.div(10, -10);
		assertEquals(-1, result);

	}

	@Test(expected = ArithmeticException.class)
	public void testDivbyZero() {
		int result = util.div(10, 0);
	}

	@Test
	public void testMul() {

		int result = util.mul(5, 10);
		assertEquals(50, result);
		result = util.mul(-5, 10);
		assertEquals(-50, result);
		result = util.mul(-5, -10);
		assertEquals(50, result);
		result = util.mul(5, -10);
		assertEquals(-50, result);
	}

}
