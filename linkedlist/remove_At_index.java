class Node{    //problem this program 
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class remove_At_index {
    
    Node first,last = null;
    int size = 0;

    public void removefirst(){ 
        if(first == null && last == null){
            System.out.println("linked list is empty");
        }
        else {
            first = first.next;
        }size--;
    }

    public void removelast(){
         if(first == null && last == null){
            System.out.println("linked list is empty");
            return;
        }
        else if (first == last){
            first = last = null;
          }
        else{
            Node temp = first;
            while(temp.next != last){
                temp = temp.next;
            }
            temp.next = null;
            last = temp;
        }   size--;
    }

    public void removeatindex(int index){
        if(index == 0){
            removefirst();
        }
        else if(index == size){
            removelast(); 
        }
        else{
            Node temp = first;
            int i = 0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(first == null && last == null){
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
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
        remove_At_index ll = new remove_At_index();

        ll.addlast(10);
        ll.addlast(20);
        ll.addlast(30);
        ll.print(); 
        System.out.println();
        System.out.println("Size ->"+ll.size);

        ll.removeatindex(0);
        ll.print();
        System.out.println("Size ->"+ll.size);
         ll.removeatindex(1);
         ll.print();
        System.out.println("Size ->"+ll.size);
        
        
    }
    
}
