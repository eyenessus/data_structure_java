public class HashMap {
    public String[] hashMap;

    public HashMap(int size) {
        this.hashMap = new String[size];
    }

    private int hash(String key) {
        int hashCode = 0;

        for (int i = 0; i < hashMap.length; i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }

        hashCode = hashCode % this.hashMap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int indexKey = this.hash(key);
        this.hashMap[indexKey] = value;
    }

    public String retrieve(String key) {
        int indexKey = this.hash(key);
        return this.hashMap[indexKey];
    }

    public static void main(String[] args) {
        HashMap hashMap = new HashMap(10);
        hashMap.assign("1", "Emerson S.");
    }

}