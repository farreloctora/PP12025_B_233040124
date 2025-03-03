package pertemuan3;

public class StrukturList {
    private Node head;

    // Menambahkan elemen di awal list (head)
    public void addHead(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    // Menambahkan elemen di akhir list (tail)
    public void addTail(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Menambahkan elemen di posisi tertentu dalam list
    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (head == null || position == 1) {
            addHead(data);  // Jika list kosong atau posisi 1, panggil addHead
        } else {
            Node curNode = head;
            int i = 1;
            while (curNode != null && i < position - 1) {
                curNode = curNode.getNext();
                i++;
            }
            if (curNode != null) {
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            }
        }
    }
 // Menampilkan elemen list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}