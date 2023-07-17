class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class remove_first_occurance {  
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

   public void removefirstoccurance(int element){
        if(first.data == element){
            removefirst();
            return;
        } 
            int flag = 0;
            Node temp = first;
            Node previos = null;
           while(temp != null){
            if(temp.data == element){
                flag = 1;
                break;
            }
                previos = temp;
                temp = temp.next;
            }
            if (flag == 1){
                previos.next = temp.next;
            }size--;
            }
     
     public void print(){
   
        Node tempNode = first ;
           while(tempNode!=null){
               System.out.print(tempNode.data+"  ");
               tempNode = tempNode.next;
           }
       }
     public static void main(String[] args) {
        remove_first_occurance ll  = new remove_first_occurance();
        ll.addlast(10);
        ll.addlast(20);
        ll.addlast(30);
        ll.addlast(40);
        ll.addlast(50);
        ll.addlast(60);
        ll.print();
        System.out.println("Size ->"+ll.size);

        ll.removefirstoccurance(60);
         ll.print();
        System.out.println("Size ->"+ll.size);

    }
}
 