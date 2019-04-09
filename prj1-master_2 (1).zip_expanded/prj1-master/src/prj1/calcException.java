package prj1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calcException {

	@Test // аннтоация теста
	(expected = ArithmeticException.class) //ожидаемый результат Exception при делении на ноль
	public void testMaxV() {
		double result = Program.maxV(50, 150, 250, 0.5, 0, 800, 1400, 750); //тестовые параметры
	}

}
