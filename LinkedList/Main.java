public class Main {
    public static void main(String[] args) {
		System.out.println("=====================LINKED LIST IMPLEMENTATION==========================");
		LinkedList list = new LinkedList();
		list.insert(3);
		list.insert(4);
		list.InsertAtFirst(5);
		list.InsertAtLast(3, 7);
		list.show();
		list.delete(2);
		System.out.println("=====================AFTER DELETION LINKED LIST==========================");
		list.show();

		
        System.out.println("=====================STACK IMPLEENTATION==========================");
		Stack stack = new Stack(3);
 
        stack.push(1);      // inserting 1 in the stack
        stack.push(2);      
        stack.pop();        // removing the top element (2)
        stack.pop();       
        stack.push(3);     
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
        stack.pop(); 
 
        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
        
}

