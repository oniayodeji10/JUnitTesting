/**
 * @author oniAyo
 * Description: Creating a Java Project and Junit test Code, using Junit to test its functionality including testing with exception
 */
package Testing;

import java.security.InvalidParameterException;

import junit.framework.TestCase;

public class BoxTest extends TestCase {
	
	
	Box m_box;

	protected void setUp() throws Exception {
		super.setUp();
		m_box = new Box(100, 15);  
	}
	
	
	public void testPrintArea() {
		int area = m_box.getArea();
		assertEquals(1500, area);
		
		
	}
	public void testSetSize( ) {
		m_box.setSize(2, 3);
		int area = m_box.getArea();
		assertEquals(6, area);
	}
	public void testSetSizeFails( ) {
		try {
		m_box.setSize(-2, 3);
		fail();
		} catch (InvalidParameterException e) {
			
		}
		
	}
}
