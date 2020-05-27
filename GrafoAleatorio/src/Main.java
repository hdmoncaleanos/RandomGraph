import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.RandomGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class Main {
	
	public static void main(String[] args) {
		Graph graph = new SingleGraph("Random");
	    Generator gen = new RandomGenerator(1.1);
	    gen.addSink(graph);
	    gen.begin();
	    for(int i=0; i<1300; i++)
	        gen.nextEvents();
	    gen.end();
		int nodes = graph.getNodeCount();
		int edgesn = graph.getEdgeCount();
		System.out.println("n: " + nodes + ", M: " + edgesn + " n/M: " + (float) edgesn / (float) nodes );
		graph.display();
	}
	
}
