import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Collection_Demonstration {

  // List Interface classes
  public void arraylist_demon() {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");

    System.out.println(fruits.get(1));

    fruits.set(1, "mango");

    fruits.remove(2);

    fruits.clear();

    System.out.println(fruits.size());

    System.out.println(fruits.contains("apple"));

    String arr[] = new String[fruits.size()];
    fruits.toArray(arr);
    System.out.println(arr[1]);

    // for loop iteration
    for (int i = 0; i < fruits.size(); i++) {
      System.out.println(fruits.get(i));
    }

    // for each loop iteration
    for (String s : fruits) {
      System.out.println(s);
    }

    // iterator iteration
    Iterator itr = fruits.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println(fruits);
  }

  public void linkedlist_demon() {
    List<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("mango");
    fruits.add("banana");
    fruits.add("orange");

    // has same methods as arraylist

    System.out.println(fruits);
  }

  public void vector_demon() {
    Vector<String> fruits = new Vector<>();

    fruits.add("apple");
    fruits.add("banana");
    fruits.add("mango");

    // has same methods as arralist and linkedlist

    System.out.println(fruits);
  }

  public void stack_demon() {
    Stack<String> fruits = new Stack<>();

    fruits.push("apple");
    fruits.push("mango");
    fruits.push("banana");

    System.out.println(fruits.pop());

    System.out.println(fruits.peek());

    System.out.println(fruits.search("apple"));

    System.out.println(fruits.empty());
  }

  // Queue Interface classes
  public void queue_demon() {
    Queue<String> fruits = new LinkedList<>();

    fruits.add("apple");
    fruits.offer("mango");
    fruits.add("banana");

    System.out.println(fruits.remove());
    System.out.println(fruits.poll());

    System.out.println(fruits.element());
    System.out.println(fruits.peek());

    System.out.println(fruits);
  }

  public void arraydeque_demon() {
    ArrayDeque<String> fruits = new ArrayDeque<>();

    fruits.offerFirst("apple");
    fruits.addFirst("banana");

    fruits.offerLast("mango");
    fruits.addLast("Lemon");

    System.out.println(fruits.peekFirst());
    System.out.println(fruits.getFirst());

    System.out.println(fruits.peekLast());
    System.out.println(fruits.getLast());

    System.out.println(fruits.pollFirst());
    System.out.println(fruits.removeFirst());

    System.out.println(fruits.pollLast());
    System.out.println(fruits.removeLast());

    // USE AS A STACK
    System.out.println(fruits.peek());

    fruits.push("Orange");
    System.out.println(fruits);

    System.out.println(fruits.pop());

  }

  public void priorityqueue_demon() {
    PriorityQueue<String> fruits = new PriorityQueue<>();

    fruits.add("mango");
    fruits.add("banana");
    fruits.add("apple");

    System.out.println(fruits.element());

    System.out.println(fruits.remove());

    System.out.println(fruits);

    PriorityQueue<Integer> numbers = new PriorityQueue<>();

    numbers.add(457);
    numbers.add(0);
    numbers.add(12);
    numbers.add(56);
    numbers.add(2);
    numbers.add(457);

    System.out.println(numbers);
    System.out.println(numbers.remove());
    System.out.println(numbers.remove());
    System.out.println(numbers.remove());
    System.out.println(numbers.remove());
    System.out.println(numbers.remove());
    System.out.println(numbers.remove());
  }

  // Set Interface classes
  public void hashset_demon() {
    Set<String> fruits = new HashSet<>();

    fruits.add("apple");
    fruits.add("mango");
    fruits.add("banana");

    System.out.println(fruits.isEmpty());

    System.out.println(fruits.size());

    fruits.remove("apple");

    System.out.println(fruits.contains("mango"));

    System.out.println(fruits);

  }

  public void linkedhashset_demon() {
    Set<String> fruits = new LinkedHashSet<>();

    fruits.add("apple");
    fruits.add("mango");
    fruits.add("banana");

    // has same methods as HashSet

    System.out.println(fruits);
  }

  public void treeset_demon() {
    Set<String> fruits = new TreeSet<>();

    fruits.add("apple");
    fruits.add("orange");
    fruits.add("lemon");

    // has same methods as HashSet and LinkedHashSet

    System.out.println(fruits);
  }

  // Map Interface classes
  public void hashmap_demon() {
    Map<String, Integer> numbers = new HashMap<>();

    numbers.put("one", 1);
    numbers.put("two", 2);
    numbers.put("three", 3);

    numbers.putIfAbsent("one", 10);

    System.out.println(numbers.get("two"));

    System.out.println(numbers.containsKey("three"));

    System.out.println(numbers.containsValue(2));

    numbers.replace("two", 22);

    numbers.replace("one", 1, 100);

    numbers.remove("two");

    numbers.remove("one", 100);

    System.out.println(numbers.keySet());

    System.out.println(numbers.values());

    System.out.println(numbers.entrySet());

    System.out.println(numbers);

    // TO ITERATE OVER THE ENTRIES
    Set<Entry<String, Integer>> entries = numbers.entrySet();
    for (Entry<String, Integer> entry : entries) {
      System.out.println(entry);
    }

    for (Entry<String, Integer> entry : numbers.entrySet()) {
      System.out.println(entry);
    }
  }

  public static void main(String[] args) {
    // Collection_Demonstration cd = new Collection_Demonstration();
    // cd.arraylist_demon();
    // cd.linkedlist_demon();
    // cd.vector_demon();
    // cd.stack_demon();

    // cd.queue_demon();
    // cd.arraydeque_demon();
    // cd.priorityqueue_demon();

    // cd.hashset_demon();
    // cd.linkedhashset_demon();
    // cd.treeset_demon();

    // cd.hashmap_demon();
  }
}
