class Node{
    int data;
    Node next;

    Node(int d){
    this.data = d;
    this.next = null;
  } 
  }
  public class palindrome {
    Node first,last = null;
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
       
         Node tempNode = first ;
            while(tempNode!=null){
                System.out.print(tempNode.data+"  ");
                tempNode = tempNode.next;
            }
        }
    public boolean palindrome(){
        if(first == null) return false;

        Node last = first;
        while(first != null){
            if(first == last){
                last.next = last;
                if(first.next == first){
                    raja ne khana khaya;
                    System.out.println("first step - ");
                    System.out.println("this is after change");
                }
            }
        }

    } 
    
}
