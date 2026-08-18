import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
public class bestfs{
    static void bestfirstsearch(HashMap<Character,List<Character>> graph,HashMap<Character,Integer> heuristic,PriorityQueue<Node> minHeap){
        HashSet<Character> visited=new HashSet<>();
        minHeap.add(new Node('a',heuristic.get('a')));
        visited.add('a');
        while(!minHeap.isEmpty()){   //incorrect condition

        
        Node current=minHeap.poll();

        if(current.vertex=='f'){
            System.out.println("visited: "+current.vertex);
            return;
        }
        for(char neighbour:graph.get(current.vertex)){
            if(!visited.contains(neighbour)){
                minHeap.add(new Node(neighbour,heuristic.get(neighbour)));
                visited.add(neighbour);
            }
         
        }
        System.out.println("visited: "+current.vertex);
        }
        System.out.println("visited: f");
    }

    public static void main(String args[]){
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