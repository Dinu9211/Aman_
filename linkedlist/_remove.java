class Node{
    int data;
    Node next;

    Node(int d){
    this.data = d;
    this.next = null;
  } 
  }
public class _remove {
    Node first,last = null;
    int size = 0;

    public void removefirst(){
  
        if(first == null && last == null){
          System.out.println("linked list is empty");
          return;
        }
          else               // remove first 
          first = first.next; 
        
         size--; 
        }
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
           
             Node tempNode = first ;
                while(tempNode!=null){
                    System.out.print(tempNode.data+"  ");
                    tempNode = tempNode.next;
                }
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
                    temp = temp.next;  // dought this line 
                  }
                  temp.next = null; // dought this line 
                  
                  last = temp;
                }size--;
            
              }
        public static void main(String[] args) {
            _remove ll = new _remove();

            ll.addfirst(50);
            ll.addfirst(40);
            ll.addfirst(30);
            ll.addfirst(20);
            ll.addfirst(10);
            ll.addfirst(0);
            ll.print();
            System.out.println(" size - "+ll.size);

            ll.removefirst();
            ll.removelast();
            ll.print();
            System.out.println(" size - "+ll.size);
            


            
        }
}
