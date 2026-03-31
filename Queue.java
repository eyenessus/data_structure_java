public class Queue {
    public LinkedList queue;
    public int size;
    public int max = 100;
    static final int DEFAULT_MAX_SIZE = 100;
    public Queue() {
        this.queue = new LinkedList();
        this.size = 0;
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize){
        this.queue = new LinkedList();
        this.size = 0;
        this.max = maxSize;
    }

    public void enqueue(String data){
        if(!this.hasSpace()){
            System.out.println("Queue is full");
            return;
        }
        this.queue.addToHead(data);
        this.size++;
        System.out.println("Enqueued: " + data);
    }

    public void dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        this.queue.removeHead();
        this.size--;
        System.out.println("Dequeued: " + this.queue.head.data);
    }

    public String peek(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        return this.queue.head.data;
    }

    public boolean hasSpace(){
        return this.size < this.max;
    };

    public boolean isEmpty(){
        return this.size == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");

        System.out.println(queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println(queue.peek());
    }
}