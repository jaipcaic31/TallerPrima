package PRIMA;
import org.junit.Test;
/**
 * Pruebas Unitarias
 * @author jimmyCelly
 *
 */
public class primaGradleTest {
	primaGradle prima1 = new primaGradle();
	@Test public void testPrimaC1() {
		prima1.prima(18, 0);
	}
	@Test
	public void testPrimaC2() {
		prima1.prima(18, 24);
	}
	@Test
	public void testPrimaC3() {
		prima1.prima(18, 30);
	}
	@Test
	public void testPrimaC4() {
		prima1.prima(28, 30);
	}
	@Test
	public void testPrimaC5() {
		prima1.prima(26, 10);
	}
	@Test
	public void testPrimaC6() {
		prima1.prima(36, 28);
	}
	@Test
	public void testPrimaC7() {
		prima1.prima(37, 24);
	}
	@Test
	public void testPrimaC8() {
		prima1.prima(80, 20);
	}
	@Test
	public void testPrimaC9() {
		prima1.prima(70, 26);
	}
	@Test
	public void testPrimaC10() {
		prima1.prima(50, 10);
	}
	@Test
	public void testPrimaC12() {
		prima1.prima(55,29);
	}
	@Test
	public void testPRIMA_CASO12() {
		prima1.prima('o', 30);
	}
	@Test
	public void testPRIMA_CASO13() {
		prima1.prima(25, 36);
	}
	@Test
	public void testPRIMA_CASO14() {
		prima1.prima(16, 30);
	}
	//*****CASOS COBERTURA DE RAMAS*****
	@Test
	public void testPRIMA_CASO15() {
		prima1.prima(18, 30);
	}
	@Test
	public void testPRIMA_CASO16() {
		prima1.prima(17, 30);
	}
	@Test
	public void testPRIMA_CASO17() {
		prima1.prima(24, 30);
	}
	@Test
	public void testPRIMA_CASO18() {
		prima1.prima('l', 27);
	}
	@Test
	public void testPRIMA_CASO19() {
		prima1.prima(28, '0');
	}
	@Test
	public void testPRIMA_CASO20() {
		prima1.prima(25, 35);
	}
	@Test
	public void testPRIMA_CASO21() {
		prima1.prima(34, 28);
	}
	@Test
	public void testPRIMA_CASO22() {
		prima1.prima(26, 25);
	}
	@Test
	public void testPRIMA_CASO23() {
		prima1.prima(34, 29);
	}
	@Test
	public void testPRIMA_CAS4() {
		prima1.prima(44, 26);
	}
	@Test
	public void testPRIMA_CASO25() {
		prima1.prima(44, 23);
	}
	@Test
	public void testPRIMA_CASO26() {
		prima1.prima(64, 23);
	}
	@Test
	public void testPRIMA_CASO27() {
		prima1.prima(64, 21);
	}
	@Test
	public void testPRIMA_CASO28() {
		prima1.prima(70, 26);
	}
	@Test
	public void testPRIMA_CASO29() {
		prima1.prima(71, 21);
	}
	@Test
	public void testPRIMA_CASO30() {
		prima1.prima('o', 'l');
	}

	//*****CASOS PRUEBAS *****
	@Test

	public void testPrima_Caso31() {
		System.out.println("***Caso de PRUEBAS UNITARIAS***");
		System.out.println("Edad:65, Puntos:27");
		prima1.prima(65, 27);
		System.out.println("Edad:65, Puntos:26");
		prima1.prima(65, 26);
		System.out.println("Edad:65, Puntos:25");
		prima1.prima(65, 25);
		
	}
	
}
