
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class add_last {
     Node first,last = null;
        int size = 0;

    public void addlast(int data){
    Node newNode = new Node(data);
       if(first == null && last == null){
        first = newNode;
        last = newNode;
        return;
    }
    else {
        Node tempNode = first ;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode = null;
    }size++;
}
public void print(){
   
     Node tempNode = first ;
        while(tempNode!=null){
            System.out.print(tempNode.data+"  ");
            tempNode = tempNode.next;
        }
    }
    public static void main(String[] args) {
        add_last ll = new add_last();
        ll.addlast(20);
        ll.addlast(10);
        ll.addlast(0);
        ll.print();

    }
    
}
