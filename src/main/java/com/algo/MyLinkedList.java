package com.algo;

public class MyLinkedList {
	
	private Node link;
	private Node first;

	public void add(int data){
		if(link==null){
			first=new Node(data);;
			link=first;
		}else{
			while(link.next!=null){
				link=link.next;				 
			 }			
			link.next=new Node(data);			
		}
	}
	
	 public void print(){	
		 link=first;
		 while(link!=null){			 
			 System.out.println(link.data);
			 link=link.next;		 
		 }
	 }
	  
	 void del(int val){		 
		 Node cur=first;
		 Node prev=first;		 
		 while (cur!=null){
			 if(cur.data==val){
				 System.out.println("got");
				 prev.next=cur.next;
				 cur=cur.next;				 
			 }else{
				 prev=cur;
				 cur=cur.next;
				 
			 }
		 }
	 }
	 public static void main(String[] args) {
		MyLinkedList l=new MyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.del(30);
		l.print();
	}
	 
}
