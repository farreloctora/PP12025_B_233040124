package pertemuan3;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Buat list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah 2.1 di akhir list
        list.addTail(2.1);
        // 3. Tambah 4.5 di akhir list
        list.addTail(4.5);
        // 4. Tambah 3.4 di index 2
        list.addMid(3.4, 2);

        // Menampilkan list
        list.printList();
        
     // 1. Buat list dengan keyword new
        StrukturList list2 = new StrukturList();

        // 2. Tambah 2.1 di akhir list
        list2.addTail(2.1);
        // 3. Tambah 5.5 di akhir list
        list2.addTail(5.5);
        // 4. Tambah 4.5 di index 2
        list2.addMid(4.5, 2);
        // 5. Tambah 1.1 di index 2
        list2.addMid(1.1, 2);
        // 6. Tambah 3.4 di awal list
        list2.addHead(3.4);

        list2.printList();
    }
}