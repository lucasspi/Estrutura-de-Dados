
package sw_dijkstra;

import java.util.Arrays;

public class sw_dijkstra {

    public static void main(String[] args) {
        Graph g = new Graph();
               
                
                
        g.addVertex("1E", Arrays.asList(new Vertex("1N", 50), new Vertex("3M", 25),new Vertex("3Q", 98)));
        g.addVertex("1N", Arrays.asList(new Vertex("1E", 50), new Vertex("1U", 35),new Vertex("3M", 35),new Vertex("5R", 15)));
        g.addVertex("1U", Arrays.asList(new Vertex("5R", 15), new Vertex("1N", 35)));
        g.addVertex("3M", Arrays.asList(new Vertex("1E", 25), new Vertex("1N", 35),new Vertex("1C", 15), new Vertex("3Q", 20)));
        g.addVertex("5R", Arrays.asList(new Vertex("1U", 15), new Vertex("1C", 15),new Vertex("1N", 15),new Vertex("1G", 80)));
        g.addVertex("1C", Arrays.asList(new Vertex("5R", 15), new Vertex("3M", 15)));
        g.addVertex("3Q", Arrays.asList(new Vertex("3M", 20), new Vertex("1E", 98),new Vertex("1G", 39)));
        g.addVertex("1G", Arrays.asList(new Vertex("3Q",39), new Vertex("5R", 80)));
        
        String start = "3Q";
        String end = "1U";
        System.out.println(g.getShortestPath(end, start)+" chegando no destino de: "+end);
    }
}
