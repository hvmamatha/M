class Operator{
	public static void main(String[]args)
	{
	int a=10,b=5;
	String oper="+";
	switch(oper)
	{
	case "+":
		System.out.println("addition :"+(a+b));
		break;
	case "-":
		System.out.println("subtraction :"+(a-b));
		break;
	case "*":
		System.out.println("multiplication :"+(a*b));
		break;
	case "/":
		System.out.println("division :"+(a/b));
		break;
	case "%":
		System.out.println("modulus :"+(a%b));
		break;
	default:
		System.out.println("not a arithmetic operator");
	}
}
}
	