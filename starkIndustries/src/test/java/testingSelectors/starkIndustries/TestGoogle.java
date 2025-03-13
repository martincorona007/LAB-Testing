package testingSelectors.starkIndustries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestGoogle extends BaseTest {
	
	@Test
    public void testGooglePage() {
		driver.get("https://www.google.com");
        assertEquals("Google",driver.getTitle(),"Page title did not match.");
    }
	
}
