package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class maxW {

	@Test //аннотаци¤ теста
	public void testMaxW() {
		double result = Program.maxW(1200, 800, 1400, 750,50, 150, 250, 0.5 ); //тестовые параметры
		assertTrue(result == 300); //ожидаемый результат
		System.out.println ("Значение поля равно "+result);
	}

}
