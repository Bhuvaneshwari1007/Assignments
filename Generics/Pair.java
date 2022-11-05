public class Pair<K,V> {
        private K key;
        private V Value;
        //setter
        public void setKey(K key){
            this.key= key;
        }
        public void setValue(V Value){
            this.Value= Value;
        }
        //getter
        public K getKey(){
            return key;
        }
        public V getValue(){
            return Value;
        }
    }

