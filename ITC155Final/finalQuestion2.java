package ITC155Final;

	//Write a method called hasTwoConsecutive that returns whether or not a list of integer 
	//has two adjacent numbers that are consecutive integer (true if such a pair exist and 
	//false otherwise). For example, if a variable list stores the value [1,18,2,7,8,39,18,40], 
	//then the call list.hasTwoConsecutive() should return true because the list contains 
	//the adjacent number(7,8), which are a pair of consecutive numbers.

class listNode{
	int data;
	listNode next;
}

public class finalQuestion2 {
	listNode first;
	public boolean hasTwoConsequitive() {
		 if(first == null) {
			 return false;
		 }
		 listNode prev = first;
		 listNode current = prev.next;

		 while(current != null) {
			 if(prev.data + 1 == current.data) {
				 return true;
			 }
			 prev = current;
			 current = prev.next;
		 }
		 return false;
	}
	public void insertInt(int data) {
		listNode node=new listNode();
		node.data=data;
		node.next=null;
		
		if(first==null) {
			first=node;
		}
		else {
			listNode n=first;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void insertStart(int data){
		listNode node=new listNode();
		node.data=data;
		node.next=null;
		node.next=first;
		first = node;
	}
	public void insertSpecific(int index, int data) {
		listNode node=new listNode();
		node.data=data;
		node.next=null;
		if(index==0) {
			insertStart(data);
		}
		else {
			listNode n = first;
			for(int i=0;i<index;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public void deleteSpecific(int index) {
		if(index==0) {
			first=first.next;
		}
		else {
			listNode n = first;
			listNode nn = null;
			for (int i=0;i<index;i++) {
				n=n.next;
			}
			nn=n.next;
			n.next=nn.next;
		}
	}
	public void show() {
		listNode node = first;
		while (node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
}


