import java.util.Scanner;
import java.util.Arrays;

public class latihan1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ulg = "y";
		while(ulg.equals("y")){

			int jml = sc.nextInt();

			while(jml <= 20){

				String[] noHP = new String[jml];

				for(int i = 0; i < noHP.length; i++){
					noHP[i] = sc.next();
				}
		    	System.out.println(Arrays.toString(noHP));
		    	//System.out.println(noHP[0].substring(0,2));
		    	// System.out.println(noHP[1].charAt(0));


		    	for (int j = 0; j < noHP.length; j++) {
		   			if(noHP[j].length() == 10 && (noHP[j].charAt(0) == '7' || noHP[j].charAt(0) == '8' || noHP[j].charAt(0) == '9')){
		   				System.out.println("Valid");
		   			}else if(noHP[j].length() == 11 && noHP[j].charAt(0) == '0' && (noHP[j].charAt(1) == '7' || noHP[j].charAt(1) == '8' || noHP[j].charAt(1) == '9')){
		   				System.out.println("Valid");
		   			}else if(noHP[j].length() == 12 && noHP[j].charAt(0) == '9' && noHP[j].charAt(1) == '1' && (noHP[j].charAt(2) == '7' || noHP[j].charAt(2) == '8' || noHP[j].charAt(2) == '9')){
		   				System.out.println("Valid");
		   			}else{
		   				System.out.println("Invalid");
		   			}
		    	}
		    	break;
		    }
	    	System.out.print("Apakah anda ingin mengulang (y/t)? ");
        	ulg = sc.next();
	    }
	    sc.close();
	}
}