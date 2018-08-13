package Graph;

public class TestAdjacencyMatrixGraph {
	public static void main(String[] args) {
		String[] vertex={"China","Japan","America","French","German"};
		int[][] edge={
				{0,1,1,0,0},
				{1,0,1,0,0},
				{1,1,0,1,0},
				{0,0,1,0,1},
				{0,0,0,1,0}
		};
		AdjacencyMatrixGraph graph=new AdjacencyMatrixGraph(vertex, edge);
		graph.DFS("China");
		int index=0;
		int[] array=new int[10];
		array[index++]=2;
		System.out.println(array[0]);
		System.out.println(array[1]);
	}
}
