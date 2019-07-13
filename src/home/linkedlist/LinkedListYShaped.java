package home.linkedlist;

public class LinkedListYShaped {

	public static void main(String[] args) {
		Node head1 = new Node(1);
		  Node middle1 = head1.append(2).append(3).append(4);
		  middle1.append(6).append(7).append(8).append(9);
		  Node head2 = new Node(10);
		  Node middle2 = head2.append(3).append(5).append(6).append(11)
		    .append(24);
		  middle2.next = middle1;
		  printList(head1, "List1");
		  printList(head2, "List2");
		  findIntersection(head1,head2);
	}
	
	private static void printList(Node node,String nodeName) {
		System.out.println(nodeName+"[");
		while(node!=null) {
			System.out.println(node.value+",");
			node=node.next;
		}
		System.out.println("]");
	}
	
	private static void findIntersection(Node head1,Node head2) {
		int length1=0;
		int length2=0;
		Node currHead1=head1;
		Node currHead2=head2;
		int diffLength=0;
		
		boolean isMerged=false;
		
		while(currHead1!=null) {
			length1++;
			currHead1 = currHead1.next;
		}
		
		while(currHead2!=null) {
			length2++;
			currHead2 = currHead2.next;
		}
		
		if(length1>length2) {
			diffLength=length1-length2;
			while(diffLength!=0) {
				head1 = head1.next;
				diffLength--;
			}
		}
		else {
			diffLength=length2-length1;
			while(diffLength!=0) {
				head2 = head2.next;
				diffLength--;
			}
		}
		
		while(head1!=null&&head2!=null) {
			if(head1.value==head2.value) {
				isMerged=true;
				break;
			}
			else {
				head1=head1.next;
				head2=head2.next;
			}
		}
		
		if(isMerged) {
			System.out.println("The linked lists are merged");
			System.out.println("Merged Node value : "+head1.value);
		}
	}
	
	private static class Node
	 {
	  public Node next;
	  public int value;

	  public Node(int value)
	  {
	   this.value = value;
	  }

	  public Node append(int value)
	  {
	   Node node = new Node(value);
	   next = node;
	   return node;
	  }
	 }

}
