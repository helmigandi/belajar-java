import java.util.ArrayList;

public class ListTest{
	public static void addList(){
        ArrayList<Integer> arrli = new ArrayList<Integer>();
		for (int i=1; i<=5; i++) 
            arrli.add(i); 

        int x = 4;
        arrli.add(x);

        // Integer X = x; // Hapus objek yang ada di 4 (Benar)
		System.out.println(arrli.toString());
		arrli.remove(x); // Hapus index ke 4 (Salah)
		System.out.println(arrli.toString());
	}
	public static void main(String[] args){
		addList();
	}
}