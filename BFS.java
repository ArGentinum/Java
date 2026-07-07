import java.util.*;
public class BFS{
    public static void main(String[] args){
        Map<Character,List<Character>> graph = new HashMap<>();
        graph.put('a',Arrays.asList('b','c'));
        graph.put('b',Arrays.asList('e','c','a','d'));
        graph.put('c',Arrays.asList('a','d','b'));
        graph.put('d',Arrays.asList('b','c','e','f'));
        graph.put('e',Arrays.asList('b','d','f'));
        graph.put('f',Arrays.asList('d','e'));
        System.out.print(graph.get('d'));
    }
}