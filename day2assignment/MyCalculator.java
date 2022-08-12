package day2assignment;

public class MyCalculator {

	public static void main(String[] args) {
		CalculatorClass Output = new CalculatorClass();
		int add = Output.add(10, 15, 20);
		System.out.println(add);
		System.out.println(Output.sub(25, 20));
		System.out.println(Output.mul(10, 10));
		System.out.println(Output.div(5.25f,  5.13f));

	}

}
