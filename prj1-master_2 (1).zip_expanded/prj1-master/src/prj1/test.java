package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {
	@Test //аннотация, метод является тестом
	public void testMaxC() {
		int result = Program.maxC(1200, 800, 1400, 750,50, 150, 250, 0.5 ); //тестовые параметры
		assertEquals(result, 600); //ожидаемый результат
		System.out.println ("Значение поля равно "+result);
	}

}
