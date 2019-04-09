package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class maxV {
	@Test //аннотация теста
	public void testMaxV() {
		double result = Program.maxV(1200, 800, 1400, 750,50, 150, 250, 0.5 ); //тестовые параметры
		assertTrue(Math.round(result*1000) == 837);//ожидаемый результат (с округлением)
		System.out.println ("Значение поля равно "+result);
	}

}
