import java.util.*;
import java.util.Scanner;

class ex {

    static void bfs(HashMap<Character,List<Character>> map,char start){
	Queue<Character> queue= new ArrayDeque<>();
        HashSet<Character> check= new HashSet<>();
        queue.offer(start);
        check.add(start);
        while(!queue.isEmpty()){
            char current= queue.poll();
            System.out.println(current);
            for(char b:map.get(current)){
                if(!check.contains(b)){
                    check.add(b);
                    queue.offer(b);
                }
               
            }
        }
    }

   
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        HashMap<Character,List<Character>> map = new HashMap<>();
        map.put('a',Arrays.asList('b','c'));
           map.put('b',Arrays.asList('a','c','d','e'));
              map.put('c',Arrays.asList('b','a','d'));
                 map.put('d',Arrays.asList('b','c','e'));
                    map.put('e',Arrays.asList('b','d'));
                    System.out.print("enter the element to start the bfs from:");
                    char start=scan.next().charAt(0);
                    bfs(map,start);                    
    }
}
