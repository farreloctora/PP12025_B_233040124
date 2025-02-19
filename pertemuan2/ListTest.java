package pertemuan2;

public class ListTest {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		System.out.println("Elemen: ");
		list.displayElement();
		
		// Tes-1 Bagian A
		StrukturList listA = new StrukturList();
		listA.addTail(3);
		listA.addTail(2);
		listA.addTail(1);
		
		System.out.println("");
		System.out.println("Elemen A: ");
		listA.displayElement();
		
		// Tes-1 Bagian B
		StrukturList listB = new StrukturList();
		listB.addTail(1);
		listB.addTail(4);
		listB.addTail(5);
		listB.addTail(7);
		
		System.out.println("");
		System.out.println("Elemen B: ");
		listB.displayElement();
		
		// 1. Create list dengan keyword new
       StrukturList listHEAD = new StrukturList();
       
       // 2. Tambah elemen 5 di awal list
       listHEAD.addHead(5);
       
       // 3. Tambah elemen 4 di awal list
       listHEAD.addHead(4);
      
       // 4. Tambah elemen 3 di awal list
       listHEAD.addHead(3);
       
       // 5. Tampilkan elemen list
       System.out.println("Elemen: ");
       listHEAD.displayElement();
		
        
        // List a: 3 2 1
        StrukturList listAHead = new StrukturList();
        listAHead.addHead(1);
        listAHead.addHead(2);
        listAHead.addHead(3);
        
        System.out.println("");
        System.out.println("Elemen A: ");
        listAHead.displayElement();
        
        System.out.println("");
        
        // List b: 1 4 5 7
        StrukturList listBHead = new StrukturList();
        listBHead.addHead(7);
        listBHead.addHead(5);
        listBHead.addHead(4);
        listBHead.addHead(1);
        
        System.out.println("Elemen B: ");
        listBHead.displayElement();
	}

}