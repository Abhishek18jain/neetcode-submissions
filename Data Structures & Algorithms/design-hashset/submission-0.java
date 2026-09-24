class MyHashSet {
  ArrayList<LinkedList<Integer>>buckets;
    public MyHashSet() {
        buckets = new ArrayList<LinkedList<Integer>>();
        for(int i = 0; i<10;i++){
      buckets.add(new LinkedList<Integer>());
        }  
    }
    
    public void add(int key) {
        int index = key % buckets.size();
          LinkedList<Integer> bucket = buckets.get(index);
        if(!bucket.contains(key)){
bucket.add(key);
        }
    }
    
    public void remove(int key) {
            int index = key % buckets.size();
          LinkedList<Integer> bucket = buckets.get(index);
          if(bucket.contains(key)){
            bucket.remove(Integer.valueOf(key));
          }
    }
    
    public boolean contains(int key) {
                int index = key % buckets.size();

        LinkedList<Integer> bucket = buckets.get(index);

        return bucket.contains(key);

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */