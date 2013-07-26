package net.slipp.inheritance;

public class RentCompanyTest extends TestCase {
	private static final String NEWLINE = System.getProperty("line.separator");

	public void testReport() throws Exception {
		RentCompany company = RentCompany.create(); 
		company.addCar(new Sonata(150));
		company.addCar(new K5(260));
		company.addCar(new Sonata(120));
		company.addCar(new Avante(300));
		company.addCar(new K5(390));
		String report = company.generateReport();
		assertEquals("Sonata : 15리터" + NEWLINE + 
				"K5 : 20리터" + NEWLINE + 
				"Sonata : 12리터" + NEWLINE + 
				"Avante : 20리터" + NEWLINE + 
				"K5 : 30리터" + NEWLINE, report);
	}
}
