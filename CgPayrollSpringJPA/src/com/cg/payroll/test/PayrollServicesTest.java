package com.cg.payroll.test;

public class PayrollServicesTest {

//public static PayrollServices services;
//	
//	@BeforeClass
//	 public static void setUpTestEnv() {
//		services = new PayrollServicesImpl();
//	}
//	
//	@Before
//	public void setUpTestData() {
//		Associate associate1 = new Associate(101, 78000, "Anup", "Banerjee", "SE", "Analyst", "KDTY654CG", "anup123@capgemini.com",
//				new Salary(35000,1800,1800), new BankDetails(54321,"Citi","citi0001"));
//		Associate associate2 = new Associate(102, 87654, "Patit", "Pawan", "SE", "Analyst", "PPTY6754CG", "patitpawan123@capgemini.com",
//				new Salary(45000,2800,2800), new BankDetails(54654,"HDFC","hdfc0005"));
//		
//		PayrollDBUtil.associates.put(associate1.getAssociateId(), associate1);
//		PayrollDBUtil.associates.put(associate2.getAssociateId(), associate2);
//		
//		PayrollDBUtil.ASSOCIATE_ID_COUNTER=102;
//	}
//	
//	@Test(expected=AssociateDetailsNotFoundException.class)
//	public void testGetAssociateDetailsForInvalidAssociateId() throws AssociateDetailsNotFoundException{
//		services.getAssociateDetails(123);
//	}
//	
//	@Test
//	public void testGetAssociateDetailsForValidAssociateId() throws AssociateDetailsNotFoundException{
//		Associate expectedAssociate = new Associate(102, 87654, "Patit", "Pawan", "SE", "Analyst", "PPTY6754CG", "patitpawan123@capgemini.com",
//				new Salary(45000,2800,2800), new BankDetails(54654,"HDFC","hdfc0005"));
//		Associate actualAssociate = services.getAssociateDetails(102);
//		Assert.assertEquals(expectedAssociate, actualAssociate);
//	}
//	
//	@Test
//	public void testAcceptAssociateDetailsForValidData(){
//		int expectedId = 103;
//		int actualId = services.acceptAssociateDetails("Sonu", "Sharma", "sonusharma@gmail.com", "ATC", "Clerk", "SISU9876DC", 78906, 23456, 1234, 2134, 987650, "Citi", "citi00001");
//		Assert.assertEquals(expectedId, actualId);
//	}
//	
//	@Test(expected=AssociateDetailsNotFoundException.class)
//	public void testCalculateNetSalaryForInvalidAssociateId() throws AssociateDetailsNotFoundException{
//		services.calculateNetSalary(123);
//	}
//	
//	@Test
//	public void testCalculateNetSalaryForValidAssociateId() throws AssociateDetailsNotFoundException{
//		int expectedNetSalary = 75950;
//		int actualNetSalary = services.calculateNetSalary(102);
//		Assert.assertEquals(expectedNetSalary, actualNetSalary);
//	}
//	
//	@Test
//	public void testGetAllAssociatesDetails() {
//		Associate associate1 = new Associate(101, 78000, "Anup", "Banerjee", "SE", "Analyst", "KDTY654CG", "anup123@capgemini.com",
//				new Salary(35000,1800,1800), new BankDetails(54321,"Citi","citi0001"));
//		Associate associate2 = new Associate(102, 87654, "Patit", "Pawan", "SE", "Analyst", "PPTY6754CG", "patitpawan123@capgemini.com",
//				new Salary(45000,2800,2800), new BankDetails(54654,"HDFC","hdfc0005"));
//		
//		ArrayList<Associate> expectedAssociateList = new ArrayList<Associate>();
//		expectedAssociateList.add(associate1);
//		expectedAssociateList.add(associate2);
//		ArrayList<Associate>actualAssociateList = (ArrayList<Associate>) services.getAllAssociatesDetails();
//		Assert.assertEquals(expectedAssociateList, actualAssociateList);
//	}
//	
//	@After
//	public void tearDownTestData() {
//		PayrollDBUtil.associates.clear();
//		PayrollDBUtil.ASSOCIATE_ID_COUNTER=100;
//	}
//
//	@AfterClass
//	public static void tearDownTestEnv() {
//		services=null;
//	}
}
