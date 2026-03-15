//MuhammadFaizNajmuddin
//255150707111013

public class lingkaran {
    int alas, tinggi;

    public lingkaran(int alas) {
        this.alas = alas;
    }

    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public lingkaran(String alas, String tinggi) {
        this.alas = parseToInt(alas);
        this.tinggi = parseToInt(tinggi);
    }


    public int parseToInt(String nilai) {
        return Integer.parseInt(nilai);
    }

    public void setAlas(int alas) { this.alas = alas; }
    public void setTinggi(int tinggi) { this.tinggi = tinggi; }
    public int getAlas() { return alas; }
    public int getTinggi() { return tinggi; }

    public double hitungLuas() {
        return (double)(getAlas() * getTinggi()) / 2;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}
