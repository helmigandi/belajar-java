import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class FunctionArgs{
	
	public static Long getYearsOld(LocalDate date){
		return ChronoUnit.YEARS.between(date, LocalDate.now());
	}

	public static void setNamaLengkap(String namaLengkap){
		System.out.println("Nama Lengkap: " + namaLengkap);
	}

	public static void main (String[] args){
		Long umurSaya = getYearsOld(LocalDate.of(1995, 05, 21));
		System.out.format("Umur: %d \n", umurSaya);
		setNamaLengkap("Helmi Sugandi");
	}
}