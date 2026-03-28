public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;

        if (currentHead != null) {
            currentHead.setPreviousNode(newHead);
            newHead.setNextNode(currentHead);
        }
        this.head = newHead;

        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    public void addToTail(String data) {
        Node newTail = new Node(data);
        Node currentTail = this.tail;

        if (currentTail != null) {
            currentTail.setNextNode(newTail);
            newTail.setPreviousNode(currentTail);
        }

        this.tail = newTail;

        if (this.head == null) {
            this.head = newTail;
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }

        this.head = removedHead.getNextNode();
        if (this.head != null) {
            this.head.setPreviousNode(null);
        }

        if (removedHead == this.tail) {
            this.tail = null;
        }
        return removedHead.data;

    }

    public String removeTail() {
        Node removeTail = this.tail;
        if (removeTail == null) {
            return null;
        }
        this.tail = removeTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }

        if (removeTail == this.head) {
            this.head = null;
        }

        return removeTail.data;
    }

    public Node removeByData(String data) {
        Node removeData = null;
        Node currentHead = this.head;

        while (currentHead != null) {
            if (currentHead.data == data) {
                break;
            }
            removeData = removeData.getNextNode();
        }

        if (removeData == null) {
            return null;
        }

        Node previousNode = removeData.getPreviousNode();
        Node nextNode = removeData.getNextNode();
        
        if (nextNode == null){
            this.removeTail();
        } else if (previousNode == null) {
            this.removeHead();
        } else {
            previousNode.setNextNode(nextNode);
            nextNode.setPreviousNode(previousNode);
        }

        return removeData;
    }

    public String printList() {
        Node currentNode = this.head;
        String output = "<head> ";
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {

    }
}
