import java.util.*;

public class bestfspath(){
    static void bestfirstpath(HashMap<Character,List<Character> graph,){

    }
    public staic void main(String[] args){
        HashMap<Character,List<Character>> graph=new HashMap<>();
        graph.put('a',Arrays.asList('b','d'));
        graph.put('b',Arrays.asList('a','c','e'));
        graph.put('c',Arrays.asList('b','e','f'));
        graph.put('d',Arrays.asList('a','e'));
        graph.put('e',Arrays.asList('d','b','c','f'));
        graph.put('f',Arrays.asList('c'));

        HashMap<Character,Integer> heuristic=new HashMap<>();
        heuristic.put('a',50);
        heuristic.put('b',10);
        heuristic.put('c',2);
        heuristic.put('d',5);
        heuristic.put('e',11);
        heuristic.put('f',0);
        PriorityQueue<Node> minHeap=new PriorityQueue<>((a,b)->a.heuristic-b.heuristic);
        bestfirstsearch(graph,heuristic,minHeap);
        //System.out.print(minHeap.peek());
    }
}