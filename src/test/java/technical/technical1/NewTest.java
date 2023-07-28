package technical.technical1;

import java.io.IOException;

import org.testng.annotations.Test;

public class NewTest extends Testbase {
 
	@Test
  public void f() throws InterruptedException, IOException {
	  
		 youtubobj.verifysearch();
		 
		 youtubobj.verifysearchbut();
		
		 youtubobj.verifylogo();
		
		 
  }
}
