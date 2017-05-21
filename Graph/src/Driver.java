
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph<String> graph = new Graph<String>();
		
		graph.addNode("New York");
		graph.addNode("Boston");
		graph.addNode("Toronto");
		graph.addNode("Rio");
		graph.addNode("London");
		graph.addNode("Antarctica");
		graph.addNode("Nashville");
		
		graph.addDirEdge("London", "Rio");
		graph.addUnEdge("New York","Boston");
		graph.addUnEdge("Boston","Toronto");
		graph.addDirEdge("Rio", "Toronto");
		graph.addUnEdge("New York","Toronto");
		graph.addDirEdge("Rio", "Nashville");
		
		System.out.println(graph.depthFirst("Rio"));
		
		//System.out.println(((graph.nodes).get("Rio")).toString());
	//	System.out.println(((graph.nodes).get("London")).toString());
		//System.out.println(graph.nodeToString("Boston"));
	}

}
