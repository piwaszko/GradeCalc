
public class main{

	public static void main(String[] main){
		Class test = new Class("GLY103");
		test.addHW(100.00);
		test.addHW(50.00);
		test.addHW(30.00);
		test.removeHW(100.00);
		double testAvg = test.calcHWAvg();
		System.out.println(testAvg);
	}
}