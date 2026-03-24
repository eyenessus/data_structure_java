public class Node {
    public String data;
    public Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node Node = new Node("Hello, I'm a node.");
        System.out.println(Node.data);
        System.out.println(Node.next);
        System.out.println();
    }
}