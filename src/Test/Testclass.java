package Test;

import org.testng.annotations.Test;

import Base.Baseclass;
import Page.Pageclass;

public class Testclass extends Baseclass  {
		@Test
		public void testing() throws InterruptedException
		{
			Pageclass ob = new Pageclass(driver);
			ob.a();
			ob.b();
			ob.c();
			ob.d();
			ob.e();
			Thread.sleep(3000);
			ob.f();
			Thread.sleep(5000);
			ob.search("sunscreen");
			Thread.sleep(3000);
			ob.product();
			Thread.sleep(3000);
			ob.addcart();
			
			
			
		}
}
