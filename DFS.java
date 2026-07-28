import java.util.*;
public class DFS{

    static void dfs(HashMap<Character,List<Character>> graph,HashSet<Character> set,char current){
            for(char neighbour:graph.get(current)){
                if(!set.contains(neighbour)){
                    set.add(neighbour);
                    dfs(graph,set,neighbour);
                }
            }
            System.out.print(current);
    
    }

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        HashMap<Character,List<Character>> graph=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        graph.put('a',Arrays.asList('b','d'));
        graph.put('b',Arrays.asList('a','d','c'));
        graph.put('c',Arrays.asList('b','e'));
        graph.put('d',Arrays.asList('a','b'));
        graph.put('e',Arrays.asList('c'));
        System.out.print("enter the element to start dfs from:");
        char start=scan.nextLine().charAt(0);
        set.add(start);
        dfs(graph,set,start);


    }
}