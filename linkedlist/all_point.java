class Node{ 
    int data;
    Node next;

    Node(int d){
    this.data = d;
    this.next = null;
  } 
  }

public class all_point {
    Node first,last = null;
    int size = 0;

public void addlast(int d){
  Node newNode = new Node(d);
      
      if(first == null && last == null){
        first = newNode;
        last=newNode;
      }

      else{
         last.next=newNode;
         last=newNode;
        
      } size++;                  
}


public void addfirst(int d){
    Node newNode = new Node(d);
      
      if(first == null && last == null){
        first = newNode;
        last=newNode;
      }

      else{
         newNode.next=first;
         first=newNode;
        
      } size++;                  
}
public void removefirst(){
  
  if(first == null && last == null){
    System.out.println("linked list is empty");
    return;
  }
    else if (first == last){
      first = last = null;
    }
    else               // remove first 
    first = first.next; 
  
   size--; 
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
    }

  }
public void printlist(){
  Node head =first;
  while(head!=null){
    System.out.print(head.data+"  ");
    head=head.next;
  }
}

public void addAtIndex(int index,int element ){
  if(index>size){
    System.out.println("index out of bound - ");
    return;
  }
  Node newNode = new Node(element);

  if(index == 0){
    addfirst(element);
  }
  
  else if(index == size){
    addlast(element);
  }
  else {
    Node temp = first;
    int i = 0;

    while(i<index-1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode.next;
    size++; 

  }
}
public static void main(String[] args) {
      
   all_point ll=new all_point();
  //  ll.add(10);
  //  ll.add(30);
  //  ll.add(40);
  //  ll.add(50); 
  //  ll.printlist();  
  //  System.out.println(ll.size+"  ");
  //  System.out.println( "after add starting point -" );
   
   
//    ll.addfirst(0);
//    ll.addfirst(-10);
//    ll.addfirst(-20);
//   ll.addfirst(-30);
//    ll.printlist();

// System.out.println();

//    ll.removefirst();


  ll.addAtIndex(0,10);
  ll.addAtIndex(1,20);
  ll.addAtIndex(2,30);
  ll.addAtIndex(3,40);
  ll.addAtIndex(4,50);
  ll.addAtIndex(4,60);
  ll.addAtIndex(3,80);
  ll.printlist();
  System.out.print(ll.size+" \n size-");

    }
}  
  