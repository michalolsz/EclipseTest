import static org.junit.Assert.*;

import org.junit.Test;


public class CaffeineBuzzTest {

	 @Test
	    public void Tests1() throws Exception {
	        CaffeineBuzz gs = new CaffeineBuzz();
	        System.out.println(gs.caffeineBuzz(1));
	        assertEquals("caffeineBuzz(1)", "mocha_missing!", gs.caffeineBuzz(1));
	    }
	 @Test
	  public void Tests2() throws Exception {
	        CaffeineBuzz gs = new CaffeineBuzz();
	        System.out.println(gs.caffeineBuzz(3));
	        assertEquals("caffeineBuzz(3)", "Java", gs.caffeineBuzz(3));
	    }
	 @Test
	 public void Tests3() throws Exception {
	        CaffeineBuzz gs = new CaffeineBuzz();
	        assertEquals("caffeineBuzz(6)", "JavaScript", gs.caffeineBuzz(6));
	    }
	 @Test
	 public void Tests4() throws Exception {
	        CaffeineBuzz gs = new CaffeineBuzz();
	        assertEquals("caffeineBuzz(12)", "CoffeeScript", gs.caffeineBuzz(12));
	    }

}
