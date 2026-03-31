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
        this.queue.addToHead(data);
        this.size++;
        System.out.println("Enqueued: " + data);
    }
}