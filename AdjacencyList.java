
import java.util.ArrayList;




public class AdjacencyList{
    private ArrayList<ArrayList<Edge>> AdjList=new ArrayList<>();

    private class Edge{
    int weight;
    int edge;

    public Edge(int weight,int edge){
        this.weight=weight;
        this.edge=edge;
    }
}

    //constructor for Adjacency list

    public AdjacencyList(int size){
        for(int i=0;i<size;++i)
        AdjList.add(new ArrayList<Edge>());
    }

    public void insert_into_AdjacencyList(int index,int weight,int edge){
        AdjList.get(index).add(new Edge(weight,edge));
    }


    public void print(){
    for(int i=0;i<AdjList.size();++i){
    System.out.printf("node: %d",i);
    for(Edge adj:AdjList.get(i)){
    System.out.printf("  ->[to:%d,weight:%d]",adj.edge,adj.weight);
    }
    System.out.println("\n");
}
}

public static void main(String[] args){
    AdjacencyList obj=new AdjacencyList(4);
    obj.insert_into_AdjacencyList(0, 1, 2);
    obj.insert_into_AdjacencyList(0, 5, 1);
    obj.insert_into_AdjacencyList(2,1 ,0 );
    obj.insert_into_AdjacencyList(2,3 , 3);
    obj.insert_into_AdjacencyList(3, 3, 2);
    obj.insert_into_AdjacencyList(1, 5, 0);
    obj.print();


}
}


