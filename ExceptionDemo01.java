class ExceptionDemo01 
{
	public static void main(String[] args) 
	{
		try{
			int x = 10/0;
			//int x[]= {};
			//System.out.println(x.length);
		}catch(Exception e){
			System.out.println("Exception:");
			e.printStackTrace();
		}
		//catch(ArithmeticException e){
		//	System.out.println("AE");
		//}
		System.out.println("Hello World!");
	}
}
