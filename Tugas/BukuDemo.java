public class BukuDemo {
    public static void main(String[] args) {
        // Instansiasi objek pertama
        Buku buku1 = new Buku();
        buku1.judul = "Belajar Java Dasar";
        buku1.penulis = "Andi Wijaya";
        buku1.tahunTerbit = 2020;
        buku1.stok = 3;

        // Instansiasi objek kedua
        Buku buku2 = new Buku();
        buku2.judul = "Pemrograman Berorientasi Objek";
        buku2.penulis = "Sri Handayani";
        buku2.tahunTerbit = 2019;
        buku2.stok = 1;

        System.out.println("=== Data Awal ===");
        buku1.displayInfo();
        System.out.println("--------------------");
        buku2.displayInfo();

        System.out.println("\n=== Update & Eksekusi Method ===");
        // Update atribut objek 1
        buku1.stok = 5;
        buku1.pinjam();

        // Update atribut objek 2 lalu eksekusi method
        buku2.tahunTerbit = 2021;
        buku2.pinjam(); // stok jadi 0
        buku2.pinjam(); // stok habis, tidak bisa pinjam
        buku2.tambahStok(2);

        System.out.println("\n=== Data Akhir ===");
        buku1.displayInfo();
        System.out.println("--------------------");
        buku2.displayInfo();
    }
}