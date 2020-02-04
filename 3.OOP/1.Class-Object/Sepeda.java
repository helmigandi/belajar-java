public class Sepeda {

    private Integer roda = 2;
    private Integer kecepatan = 0;

    public void meningkatkanSpeed(Integer value) {
        this.kecepatan = this.kecepatan + value;
    }

    public void turunkanSpeed(Integer value) {
        this.kecepatan = this.kecepatan - value;
    }

    public Integer kecepatanSekarang() {
        return this.kecepatan;
    }

}