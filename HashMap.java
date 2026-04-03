public class HashMap {
    public LinkedList[] hashMap;

    public HashMap(int size) {
        this.hashMap = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            this.hashMap[i] = new LinkedList();
        }
    }

    private int hash(String key) {
        int hashCode = 0;

        for (int i = 0; i < hashMap.length; i++) {
            hashCode = hashCode + Character.codePointAt(key, i); // soma de todos os caracters da key
        }

        hashCode = hashCode % this.hashMap.length; // operação de modulo para obter o indice final
        return hashCode;
    }

    public void assign(String key, String value) {
        int indexKey = this.hash(key);
        LinkedList list = this.hashMap[indexKey]; // encontra a lista do indice correto.

        // caso não exista nenhuma lista
        if (list.head == null) {
            list.addToHead(key, value);
            return;
        }

        // percorrer lista
        Node current = list.head;
        while (current != null) {
            // È o mesmo hash
            if (current.key == key) {
                current.setKeyValue(key, value);
                break;
            }

            // tail vázio
            if (current.getNextNode() == null) {
                // definindo No
                current.setNextNode(new Node(key, value));
                break;
            }
            current = current.getNextNode();
        }

    }

    public String retrieve(String key) {
        int indexKey = this.hash(key);
        Node current = this.hashMap[indexKey].head;

        while (current != null) {
            if (current.key == key) {
                return current.data;
            }

            current = current.getNextNode();
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap(10);
        // hashMap.assign("1", "Emerson S.");
        hashMap.assign("mandarin duck", "Central Park Pond");
        hashMap.assign("monk parakeet", "Brooklyn College");
        hashMap.assign("horned owl", "Pelham Bay Park");
        System.out.println(hashMap.retrieve("mandarin duck"));
        System.out.println(hashMap.retrieve("monk parakeet"));
        System.out.println(hashMap.retrieve("emerson"));
    }

}