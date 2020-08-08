package programs;

public class P_06_A  extends P_06_abstractclass{

	@Override
	void fun() {
		// TODO Auto-generated method stub
		
		System.out.println("fun1");
	}

	@Override
	void fun2() {
		// TODO Auto-generated method stub
		
		System.out.println("fun2");
		
	}
	
	
	public static void main(String[] args)
	{
		P_06_A obj = new P_06_A();
		
		obj.fun();
	}

}
