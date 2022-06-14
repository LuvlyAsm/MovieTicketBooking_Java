package Calculator;

public class ArithmeticOperations {
	public int add() {
		int num=2;
		int num1=5;
		int sum =num+num1;
		return sum;
		}
		public int sub() {
		int num =23;
		int num1= 41;
		int sum = num-num1;
		return sum;

}
		public double mul() {
			double num =4;
			double num1 =4;
			double sum= num*num1;
			return sum;


			}
			public float div() {
			float num =88;
			float num1= 999;
			float sum = num/num1;
			return sum;
			}
			public void getresult() {
				System.out.println();
}
			public void printnum() {
}
			public void getvalue() {
}
			public static void main(String[] args) {
			ArithmeticOperations obj =new ArithmeticOperations();
			obj.add();
			System.out.println(obj.add());
}
}
