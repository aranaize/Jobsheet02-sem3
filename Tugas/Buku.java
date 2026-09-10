public class Buku {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public int stok;

    public void displayInfo(){
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Stok         : " + stok);
    }

    public void pinjam(){
        if (stok > 0){
            stok = stok - 1;
            System.out.println(judul + " berhasil dipinjam. Sisa stok: " + stok);
        } else {
            System.out.println(judul + " tidak dapat dipinjam, stok habis.");
        }
    }

    public void tambahStok(int jumlah){
        stok = stok + jumlah;
        System.out.println("Stok " + judul + " ditambah menjadi: " + stok);
    }
}