package Easy;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculator(10,'/',12));
		}
	public static int calculator(int num1, char operator, int num2) {
		int result =0;
		if(operator == '+'){
			result = num1 + num2;
		}else 	if(operator == '-'){
			result = num1 - num2;
		}else 	if(operator == '*'){
			result = num1 * num2;
		}else 	if(operator == '/'){
			result = num1 / num2;
		}else if((operator == '/') && (num2 == 0)){
			result = 0;
		}
		return result;
  }
}
