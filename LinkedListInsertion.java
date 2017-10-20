public class LinkedListInsertion	
{
	Node head;

	class Node
	{
	int data;
	Node next;
		Node (int d)
		{
		data=d;
		next=null;
		}
	}
	
	public void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next=head;
		head=new_node; 
	}

	public void append(int data)
	{
	Node new_node = new Node(data);
	
	if(head==null)
	{
		head = new Node(data);
		return;
	}

	new_node.next=null;
	Node last=head;

	while(last.next!=null)
	last=last.next;
	
	last.next=new_node;
	return;
	}

	public void atpos(Node prev,int data)
	{
		if(prev==null)
		return;
		
		Node new_node = new Node(data);
		new_node.next=prev.next;
		prev.next=new_node;
	}
	public void printing()
	{
	Node tnode=head;
		while(head!=null)
		{
		System.out.print(tnode.data+" ");
		tnode=tnode.next;
		}
	}
	
	public static void main(String[] args)
	{
	LinkedListInsertion a = new LinkedListInsertion();
	a.push(1);
	a.push(2);
	a.append(4);
	a.append(5);
	a.atpos(a.head.next,8);
	a.printing();
	}
}
