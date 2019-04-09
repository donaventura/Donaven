package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class argException {
	
	@Test (expected = IllegalArgumentException.class) //ожидаемый результат Exception при вводе отрицательного значения
	public void testMaxV() {
			double result = Program.maxV(-2, 150, 250, 0.5, 0, 800, 1400, 750); //тестовые параметры
	}
}
