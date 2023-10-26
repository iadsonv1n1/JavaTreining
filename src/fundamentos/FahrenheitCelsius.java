package fundamentos;

import java.math.BigDecimal; //Class responsavel pelo arredondamento de números decimais
import java.math.RoundingMode; //Class que define o tipo de arredondamento

public class FahrenheitCelsius {

	public static void main(String[] args) {
		int f = 86;
		final int PMIN = 32;
		final double K = 1.8;
		double c = (f - PMIN)/K;
		BigDecimal bd = new BigDecimal(c).setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("o valor de 100°F em °C = " + bd.doubleValue());
	}
}
