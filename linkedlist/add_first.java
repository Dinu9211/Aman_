class ll{
    int data;
    Node next;

    ll(int data){
        this.data = data;
        this.next = null;
    }
}
public  class add_first {
   Node first=null,last = null; // declartion
    int size = 0;

    public  void addfirst(int data){
        Node newNode = new Node(data);
        
        if(first == null && last == null){
            first = newNode;
            last=newNode;
          }
    
          else{
             newNode.next=first;
             first=newNode;
            
          } size++;                  
    }
public void print(){
    if(first == null){
        System.out.println("list is empty");
        return;
    }
     Node tempNode = first ;
        while(tempNode!=null){
            System.out.print(tempNode.data+"  ");
            tempNode = tempNode.next;
        }
    }
    public static void main(String[] args) {
        add_first ll = new add_first();
        ll.addfirst(40);
        ll.addfirst(30);
        ll.addfirst(20);
        ll.addfirst(10);
        ll.addfirst(0);
        ll.print();
        System.out.println("ll.size -> "+ll.size);

    }
}
