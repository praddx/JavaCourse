package ru.plahotin;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** 
 * Calculate Test
 * @author Alexander Plakhotin
 * since 14.11.2016
 */

public class CalculateTest {
	
	@Test
	public void whenExecuteThenDisplayPhrase() {		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello World!\r\n"));
	}
}