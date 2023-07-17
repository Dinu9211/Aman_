class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class reverse_elements {
   int size = 0;
   Node first,last = null;

   public Node reverse_recursive(Node first){ //sradha didi in youtube 
    if(first == null || first.next == null) {
        return first;
    }
    Node newfirst = reverse_recursive(first.next);
    first.next.next = first;
    first.next = null;

    return newfirst;
}
   
   public void reverse__elementsfun(){

    if(first == null || first.next == null)  {
       System.out.println("please enter the more than 3 elements - ");
        return;
     }

    Node previousNode = first;
    Node currentNode = first.next;
    Node nextNode;
    while(currentNode != null){
        nextNode = currentNode;
        currentNode.next = previousNode;

        //update
        previousNode = currentNode;
        currentNode = nextNode;
    }
    first.next = null;
    first = previousNode;
}

   public void print(){
   
    Node tempNode = first ;
       while(tempNode!=null){
           System.out.print(tempNode.data+"  ");
           tempNode = tempNode.next;
       }
   }
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
   public static void main(String[] args) {
    reverse_elements ll = new reverse_elements();
    ll.addlast(10);
    ll.addlast(20);
    ll.addlast(30);
    ll.addlast(40);
    ll.addlast(50);
    ll.print();
    System.out.println("size ->"+ll.size);

    // ll.reverse__elementsfun ();
    ll.first = ll.reverse_recursive(ll.first);
    ll.print();
 
      
    
   }
}
