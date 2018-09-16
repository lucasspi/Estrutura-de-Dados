package sw_projetofinaldijkstra;

/**
 *
 * @author lucasspirandeli
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Graph {
	
	private final Map<String, List<Vertex>> vertices;
	
	public Graph() {
		this.vertices = new HashMap<String, List<Vertex>>();
	}
	
	public void adicionaVertice(String str, List<Vertex> vertex) { //onde ele adiciona o vertice
		this.vertices.put(str, vertex);
	}
	
	public List<String> menorCaminho(String start, String finish) {
		final Map<String, Integer> distances = new HashMap<String, Integer>();
		final Map<String, Vertex> previous = new HashMap<String, Vertex>();
		PriorityQueue<Vertex> nodes = new PriorityQueue<Vertex>();
		
		for(String vertex : vertices.keySet()) {
			if (vertex == start) {
				distances.put(vertex, 0);
				nodes.add(new Vertex(vertex, 0));
			} else {
				distances.put(vertex, Integer.MAX_VALUE);
				nodes.add(new Vertex(vertex, Integer.MAX_VALUE));
			}
			previous.put(vertex, null);
		}
		
		while (!nodes.isEmpty()) {
			Vertex menor = nodes.poll();
			if (menor.getId() == finish) {
				final List<String> caminho = new ArrayList<String>();
				while (previous.get(menor.getId()) != null) {
					caminho.add(menor.getId());
					menor = previous.get(menor.getId());
				}
				return caminho;
			}

			if (distances.get(menor.getId()) == Integer.MAX_VALUE) {// compara todos os caminhos
				break;
			}
						
			for (Vertex vizinho : vertices.get(menor.getId())) {
				Integer alt = distances.get(menor.getId()) + vizinho.getDistance();
				if (alt < distances.get(vizinho.getId())) {
					distances.put(vizinho.getId(), alt);
					previous.put(vizinho.getId(), menor);
					
					forloop:
					for(Vertex n : nodes) {
						if (n.getId() == vizinho.getId()) {
							nodes.remove(n);
							n.setDistance(alt);
							nodes.add(n);
							break forloop;
						}
					}
				}
			}
		}
		
		return new ArrayList<String>(distances.keySet());
	}
	
}