package Graph;

public class AdjacencyMatrixGraph {
	protected String[] vertex;//��ȡ�ڽӾ��󴴽�ͼ
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
	public void DFS(String ver) {//������ȱ���
		
		if(locationOfVer( ver)!=-1){
			System.out.println(ver);
			visited[locationOfVer(ver)]=true;
		}
		else {
			System.out.println("������Ϣ����");
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
	
	public void miniSpanTree_Prim(String ver){//prim�㷨����С������
		int star=locationOfVer(ver);
		if(locationOfVer(ver)==-1){
			System.out.println("������Ϣ����");
			System.exit(3);
		}
		
	}
//	public  int[] Dijsktra(Graph graph,int start){  
//	     //����һ������ͼ��Ȩ�ؾ��󣬺�һ�������start����0��ţ�������������У�  
//	        //����һ��int[] ���飬��ʾ��start���������·������  
//	        int n = graph.thevexs.length;        //�������  
//	        int[] shortPath = new int[n];    //��Ŵ�start��������������·��  
//	        String[] path=new String[n]; //��Ŵ�start��������������·�����ַ�����ʾ  
//	         for(int i=0;i<n;i++)  
//	             path[i]=new String(start+"-->"+i);  
//	        int[] visited = new int[n];   //��ǵ�ǰ�ö�������·���Ƿ��Ѿ����,1��ʾ�����  
//	          
//	        //��ʼ������һ���������  
//	        shortPath[start] = 0;  
//	        visited[start] = 1;  
//	  
//	        for(int count = 1;count <= n - 1;count++)  //Ҫ����n-1������  
//	        {  
//	   
//	            int k = -1;    //ѡ��һ�������ʼ����start�����δ��Ƕ���  
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
//	            //����ѡ���Ķ�����Ϊ��������·�����ҵ�start�����·������dmin  
//	            shortPath[k] = dmin;  
//	  
//	            visited[k] = 1;  
//	    
//	            //��kΪ�м�㣬������start��δ���ʸ���ľ���  
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
//	           System.out.println("��"+start+"������"+i+"�����·��Ϊ��"+path[i]);    
//	         System.out.println("=====================================");  
//	        
//	        return shortPath;  
//
//	 	}
// }

}
	
