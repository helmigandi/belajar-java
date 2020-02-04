public class MainAplikasi{

    public static void main(String[] args){
        Sepeda ontel = new Sepeda();
        ontel.meningkatkanSpeed(20);
        System.out.println("Kecepatan sepeda ontel saat ini adalah " + ontel.kecepatanSekarang());

        Sepeda balap = new Sepeda();
        balap.meningkatkanSpeed(120);
        System.out.println("Kecepatan sepeda balap saat ini adalah " + balap.kecepatanSekarang());
    }
}