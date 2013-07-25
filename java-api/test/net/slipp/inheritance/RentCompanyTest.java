package net.slipp.inheritance;

import junit.framework.TestCase;

public class RentCompanyTest extends TestCase {
	private static final String NEWLINE = System.getProperty("line.separator");
	
	public void testReport() throws Exception {
		RentCompany company = RentCompany.create(); // factory method를 사용해 생성
		company.addCar(new Sonata(150, 10));
		company.addCar(new K5(260, 13));
		company.addCar(new Sonata(120, 10));
		company.addCar(new Avante(300, 15));
		company.addCar(new K5(390, 13));
		
		String report = company.generateReport();
		assertEquals(
			"Sonata : 15리터" + NEWLINE +
			"K5 : 20리터" + NEWLINE +
			"Sonata : 12리터" + NEWLINE +
			"Avante : 20리터" + NEWLINE +
			"K5 : 30리터" + NEWLINE, report);
	}
}
