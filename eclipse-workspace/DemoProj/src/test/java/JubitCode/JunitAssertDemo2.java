package JubitCode;
import org.junit.Assert;
import org.junit.Test;
 

public class JunitAssertDemo2 {


	
	String string1="Junit";
	String string2=null;
	
	@Test
	public void notNullTC()
	{
		Assert.assertNotNull(string1);
		System.out.println("String1 is Not null");
		
		Assert.assertNull(string2);
		System.out.println("String2 is null");
		
		Assert.assertNotNull(string2);//false
		System.out.println("String2 is null");
	}
 


}
