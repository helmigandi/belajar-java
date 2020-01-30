public class IntTest{
	public static void compare(){
		int i = 1000;
		Integer j = 1000;
		Integer k = 1000;

		if(i == j)System.out.println("int == Integer");
		else System.out.println("int != Integer");
		// int == Integer

		if(k == j)System.out.println("Integer == Integer");
		else System.out.println("Integer != Integer");
		// Integer != Integer
	}

	public static void main (String[] args){
		compare();
	}
}