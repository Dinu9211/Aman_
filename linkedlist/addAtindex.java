class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class addAtindex {

    Node first, last = null;
    int size = 0;

    public void addfirst(int data) {
        Node newNode = new Node(data);

        if (first == null && last == null) {
            first = newNode;
            last = newNode;
        }

        else {
            newNode.next = first;
            first = newNode;

        }
        size++;
    }

    public void print() {

        Node tempNode = first;
        while (tempNode != null) {
            System.out.print(tempNode.data + "  ");
            tempNode = tempNode.next;
        }
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (first == null && last == null) {
            first = newNode;
            last = newNode;
        }

        else {
            Node tempNode = first;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
            newNode = null;
        }
        size++;
    }

    public void addAt_index(int index,int data) {
        Node newNode = new Node(data);
        if (index > size) {
            System.out.println("index is larger then size - ");
            return;
        }

        if (index == 0) addfirst(data);

         else if (index == size)     addlast(data);

        else {
            Node temp = first;  //problem
            int i = 0;

            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next  = temp.next;
             temp.next = newNode;
            
            size++;

        }
    }

    public static void main(String[] args) {
        addAtindex ll = new addAtindex();

        ll.addAt_index(0, 10);
        ll.addAt_index(1, 20);
        ll.addAt_index(2, 30);
        ll.print();
        System.out.println("size - " + ll.size);

        ll.addAt_index(0, 5);
        ll.addAt_index(2, 15);
        ll.addAt_index(4, 40);

        ll.print();
        System.out.println("size - " + ll.size);

    }

}
