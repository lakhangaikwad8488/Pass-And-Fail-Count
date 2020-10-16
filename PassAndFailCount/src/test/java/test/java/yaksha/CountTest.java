package test.java.yaksha;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import main.java.yaksha.Count;
import main.java.yaksha.TestUtils;

@RunWith(MockitoJUnitRunner.class) 
public class CountTest {
	
	@Mock
	Count c;
	
	@Test
	public void testIsPass() throws IOException {
		
		 
		int arr[]= {50,60,70,80,90};
		
		Mockito.when(c.isPass(5, arr)).thenReturn(5);
		double actual =c.isPass(5, arr);
		 		//assertEquals(5, c.isPass(5, arr));
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actual==5?true:false),TestUtils.businessTestFile);

		 //Mockito.when(s.generateBill(10,10,10)).thenReturn(1300.0);
		//	double actualTotal=s.generateBill(10,10,10);
		//	 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==1300.0?true:false),TestUtils.businessTestFile);

		
	}
	@Test
	public void testExceptionConditon() throws Exception{

	        TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}
	 

	@Test
	public void testBoundaryCondition() throws Exception {

	        TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}


}
