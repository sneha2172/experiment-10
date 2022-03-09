import java.util.*;
class linkedlist{
	Scanner obj=new Scanner(System.in);
	class Node{
	 	int data;
	 	Node prev;
	 	Node next;
	}
	linkedlist(){
		System.out.println("Enter no.of nodes:");
		int n =obj.nextInt();
		System.out.println("Enter numbers:");
		Node h= new Node();
		Node n1 = h;
		n1.prev=null;
		for(int i=0;i<n;i++){
		    Node temp=n1;
			n1.data = obj.nextInt();
			n1.next=new Node();
			n1=n1.next;
			n1.prev=temp;
		}
		n1.next=null;
		System.out.println("Do you want to delete a node?(1 for Yes/0 for No)");
		int a =obj.nextInt();
		if(a==1){
			System.out.println("Enter number to be deleted:");
			int c=obj.nextInt();
			if(h==null){
				System.out.println("List is empty");
			}
			else if(h.data==c){
			 Node temp=h;
			 h=h.next;
			 temp.next=null;
			 n=n-1;
			}
			else{
				Node crnt=h; 
				while(crnt!=null && crnt.data!=c)
					crnt=crnt.next;
				crnt.prev.next=crnt.next;
				crnt.next.prev=crnt.prev;
				crnt.prev=null;
				crnt.next=null;
				n=n-1;
			}	
		}
		System.out.println("NUMBERS IN LIST ARE:");
		Node temp=h;
		for(int i=0;i<n;i++){
			System.out.print(temp.data+" ");
			temp=temp.next; 
		}
	}
	public static void main(String args[]){
		new linkedlist();
	}
}




/*
OUTPUT:
Enter no.of nodes:
5
Enter numbers:
1
3
5
7
9
Do you want to delete a node?(1 for Yes/0 for No)
1
Enter number to be deleted:
5
NUMBERS IN LIST ARE:
1 3 7 9
*/
