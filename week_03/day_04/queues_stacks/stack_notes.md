# **Lesson 11**
## Java

## Stacks and queue


- ### What is a stack/queue?

The stack is a *linear data structure* that is used to **store the collection of objects**.
Or in other words is an *array or list structure* of function calls and parameters used in modern computing programming similar to a stack of plates at a buffet restaurant or cafeteria, elements in a stack are added or removed from the top of the stack, in a *“last in first, first out”* or LIFO order

The process of **adding data to a stack** is referred to as a “push” — think of git commands
While **retrieving data form a stack** is called a “pop” — like obtaining a He balloon where you have to pop it so it doesn’t fly away
		- this occurs at the top of the stack where a stack pointer indicated the extent of the stack by adjusting as elements are pushed or pooped to a stack (reusable party poppers)

		when a function is called , the address of the next instruction is pushed onto the stack

		when the function exits, the address is popped off the stack and execution continues to that address

Information obtained from: https://www.thoughtco.com/definition-of-stack-in-programming-958162

- ### How do you create a stack/queue?
	Some websites that may be useful with examples
	https://jenkov.com/tutorials/java-collections/stack.html
	https://www.journaldev.com/13401/java-stack

——————————— Java Stack to List  a stack of integers Example ————————

import java.util.ArrayList;

import java.util.List;

import java.util.Stack;

public class StackBasicExample {

    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        List<Integer> list = new ArrayList<>();
        list.addAll(stack);
        System.out.println("Non-Empty stack : "  + stack);
        System.out.println("Non-Empty List : "  + list);
    }
}

output:- 
Non-Empty stack : [1, 2, 3]

Non-Empty List : [1, 2, 3]

———————————— Java Array to stack with a given int array example ————————
import java.util.Stack;

public class ArrayToStackExample {

    public static void main(String a[]){
        Integer[] intArr = { 1001,1002,1003,1004};
        Stack<Integer> stack = new Stack<>();
        for(Integer i : intArr){
            stack.push(i);
        }
        System.out.println("Non-Empty stack : "  + stack);
    }
}

Output:-
Non-Empty stack : [1001, 1002, 1003, 1004]

—————————Java List to Stack with a given list of integers Example —————————

import java.util.ArrayList;

import java.util.List;

import java.util.Stack;

    public class ListToStackExample {

    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Non-Empty stack addAll Operation : "  + stack.addAll(list));
        System.out.println("Non-Empty stack : "  + stack);
    }
}     

Output :- 
Non-Empty stack : true

Non-Empty stack : [1, 2, 3]
—————————————————————————————————————————————

- ### What are the key characteristics for a stack/queue?

More information about stack in this link

 https://www.journaldev.com/13401/java-stack



- ### What are the useful methods for stack/queue?

Some of the common methods are:

		push(E item) - pushes an item to the top of the stack

		pop() - removes and returns the object at the top of the stack

		peek() -  returns the object at the top of the stack without removing it
		
there are other methods such as:

		boolean empty() - tests if this stack is empty (true if empty and false if not)

		int search(Object o) - returns the 1-based position where an object is on this stack (counting from 1 not 0)

Link for CharStack where a generic cannot be used since char is a primitive datatype https://www.baeldung.com/java-char-stack

- ### When would you use stack/queue?

Similar to queue where you would use it to get things out in order that you put them in. You use a tack when you want to get things out in the reverse order then you put them in

- ### Why would you use it over an ArrayList?



Array and lists are random access, they are very flexible and also easily corruptible. If you want to manage your data as FIFO (first in, first out — queue) or LIFO (last in, first out — stack) it is best to use those, already implemented, collections.

Any stack or queue implementations you find are most certainly used linked lists under the hood

Array and list structures provide a description of how the data is stored, along with guarantees of the complexity of fundamental operations on the structures.

Stacks and queues give a high level description of how elements are inserted or removed.

You can use arrays and lists with queues and stacks but there are other forms to implement with them

More information about why you would use stack/queue in comparison to array lists + why you would use them over an array list 
https://stackoverflow.com/questions/2074970/stack-and-queue-why
