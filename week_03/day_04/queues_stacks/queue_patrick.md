# Stacks and Queues:
​
## Key Questions:
- What is a Stack/Queue?
- How do you create a Stack/Queue in Java?
- What are the key characteristics of a Stack/Queue?
- What are the useful methods for Stacks/Queues?
- When would you use a Stack/Queue?
- Why would you use it over an ArrayList?
​
## Queues:
### What is a Queue?
- A collection designed for holding elements prior to processing, in the order in which they are added.
- Ordered list of objects.
- Queue is an interface.
    
​
### How do you create a Queue in Java?
- Present in the java.util package.
- Extends the Collection Interface.
- Declaration: *public interface Queue extends Collection*.
- As Queue is an **interface**, objects cannot be created of the type queue.
    - We always need a class which extends this list in order to create an object.
    - i.e. we always need a concrete class for the declaration.
    - Most common classes are the Priority Queue and LinkedList in Java (neither of these implementations are "thread safe"(???)).
        - PriorityQueue does not retain insertion order - elements are stored based on the priority order which is ascending by default.
    - PriorityBlockingQueue is an alternative implementation if thread safe implementation is needed.
- It is possible to restrict the **type** of object that can be stored in the Queue (important because of Generics).
    - Type-safe queue can be defined as: 
    // Obj is the type of the object to be stored in Queue 
    Queue(angle bracketed Obj) queue = new PriorityQueue(angle bracketed Obj) (); 
​
​
### What are the key characteristics of a Queue?
- FIFO (First In First Out).
    - This means its use is limited to inserting elements at the end of the list and deleting elements from the start of the list.
- Supports all methods of Collection interface including insertion, deletion etc.
- LinkedList, ArrayBlockingQueue and PriorityQueue are most frequent implementations.
- If any null operation is performed on BlockingQueues, NullPointerException is thrown.
- The Queues which are available in java.util package are Unbounded Queues.
- - The Queues which are available in java.util.concurrent package are the Bounded Queues.
All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively.     
    - The Deques support element insertion and removal at both ends. 
​
​
### What are the useful methods for Queues?
- .add.
    - Throws an exception when an object cannot be added to queue.
- .offer
    - Same as .add, but doesn't throw an exception when an object cannot be added to the queue.
- .addAll(int index, Collection collection)
- .remove
    - (if there are multiple occurrences of the object we wish to remover, the first occurrence of the object is removed.)
    - throws NoSuchElement Exception if queue is empty.
- .poll
    - = used to removed the head of the queue, and return it. 
    - throws false if queue is empty.
- .element
    - = view an object in head of queue.
    - if queue is empty, throws NoSuchElementException.
- .peek 
    - = view an object in the head of the queue.
    - if the queue is empty, peek returns false.
- Can be iterated over by converting the queue to an array and traversing using the for loop.
- Queue also has an in-built iterator:
    - Iterator iterator = pq.iterator();
 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        } 
​
### When would you use a Queue?
- Use PriorityQueue when elements need to be processed according to priority.
- LinkedList is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
    - The elements are linked using pointers and addresses. 
    - Each element is known as a node. 
    - Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues.
- PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules as class PriorityQueue and supplies blocking retrieval operations. 
​
### Why would you use it over an ArrayList?
- Queues are very good at adding and removing elements, but bad if you need to search through them. 
- ArrayLists, on the other hand, are a bit slower to add elements, but allow easy random access.
- A List lets you look at any element whenever you want - a queue only lets you look at the "next" one. Hence, guarantees FIFO behaviour.
- With a Queue instance you don't have to worry about indexes and this makes things easier to think about if you don't need everything ArrayList has to offer.
- Overall: The limitations imposed on a queue (FIFO, no random access), as compared to an ArrayList, allow for the data structure to be better optimized, have better concurrency, and be a more appropriate and cleaner design when called for.
​
### Links:
https://www.geeksforgeeks.org/queue-interface-java/
​
https://stackoverflow.com/questions/17436530/when-to-use-queue-over-arraylist#:~:text=Queues%20are%20very%20good%20at,choosing%20one%20over%20the%20other.