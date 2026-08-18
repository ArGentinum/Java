import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.HashSet;
public class BestFirstSearch{
    public static void main(String args[]){
        HashMap<Character,List<Character>> graph=new HashMap<>();
        graph.put('a',Arrays.asList('b','d'));
        graph.put('b',Arrays.asList('a','c','e'));
        graph.put('c',Arrays.asList('b','e','f'));
        graph.put('d',Arrays.asList('a','e'));
        graph.put('e',Arrays.asList('d','b','c','f'));
        graph.put('f',Arrays.asList('c'));
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(1);
        System.out.print(minHeap.peek());
    }
}