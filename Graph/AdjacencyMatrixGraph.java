package Graph;

public class AdjacencyMatrixGraph {
	protected String[] vertex;//采取邻接矩阵创建图
	protected int[][] edge;
	boolean[] visited;
	public AdjacencyMatrixGraph(String[] vertexP,int[][] edgeP){
		vertex=vertexP;
		edge=edgeP;	
		visited=new boolean[vertexP.length];
		for(int i=0;i<vertexP.length;i++){
			visited[i]=false;
		}
	}
	public void DFS(String ver) {//深度优先遍历
		
		if(locationOfVer( ver)!=-1){
			System.out.println(ver);
			visited[locationOfVer(ver)]=true;
		}
		else {
			System.out.println("顶点信息有误！");
			System.exit(1);
		}
		for(int i=0;i<vertex.length;i++){
			if(edge[locationOfVer(ver)][i]==1&&!visited[i]){
				DFS(vertex[i]);
			}
		}
	}
	public int locationOfVer(String ver){
		int location=-1;
		for(int i=0;i<vertex.length;i++){
			if(vertex[i]==ver){
				location=i;
			}
		}
		return location;
	}
	
	public void miniSpanTree_Prim(String ver){//prim算法的最小生成树
		int star=locationOfVer(ver);
		if(locationOfVer(ver)==-1){
			System.out.println("顶点信息有误！");
			System.exit(3);
		}
		
	}
//	public  int[] Dijsktra(Graph graph,int start){  
//	     //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）  
//	        //返回一个int[] 数组，表示从start到它的最短路径长度  
//	        int n = graph.thevexs.length;        //顶点个数  
//	        int[] shortPath = new int[n];    //存放从start到其他各点的最短路径  
//	        String[] path=new String[n]; //存放从start到其他各点的最短路径的字符串表示  
//	         for(int i=0;i<n;i++)  
//	             path[i]=new String(start+"-->"+i);  
//	        int[] visited = new int[n];   //标记当前该顶点的最短路径是否已经求出,1表示已求出  
//	          
//	        //初始化，第一个顶点求出  
//	        shortPath[start] = 0;  
//	        visited[start] = 1;  
//	  
//	        for(int count = 1;count <= n - 1;count++)  //要加入n-1个顶点  
//	        {  
//	   
//	            int k = -1;    //选出一个距离初始顶点start最近的未标记顶点  
//	            int dmin = Integer.MAX_VALUE;  
//	            for(int i = 0;i < n;i++)  
//	            {  
//	            	
//	                if(visited[i] == 0 && graph.edges[start][i]<dmin)  
//	                {  
//	                    dmin = graph.edges[start][i];  
//	                  
//	                    k = i;  
//	                }    
//	                      
//	            }  
//	            System.out.println("k="+k);  
//	               
//	            //将新选出的顶点标记为已求出最短路径，且到start的最短路径就是dmin  
//	            shortPath[k] = dmin;  
//	  
//	            visited[k] = 1;  
//	    
//	            //以k为中间点，修正从start到未访问各点的距离  
//	            for(int i = 0;i < n;i++)  
//	            {                 // System.out.println("k="+k);  
//	                if(visited[i] == 0 && graph.edges[start][k] + graph.edges[k][i] < graph.edges[start][i]){  
//	                	graph.edges[start][i] = graph.edges[start][k] + graph.edges[k][i];  
//	                     
//	                     path[i]=path[k]+"-->"+i;  
//	                      
//	                }  
//	                  
//	            }    
//	       
//	        }  
//	         for(int i=0;i<n;i++)  
//	           System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]);    
//	         System.out.println("=====================================");  
//	        
//	        return shortPath;  
//
//	 	}
// }

}
	
