package Tree;

import java.util.ArrayList;
import java.util.Scanner;


public class HuffmanTree {//对给定的结点进行创建哈夫曼树
	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		Node[] list=new Node[4];
		for (int i = 0; i < list.length; i++) {
			list[i]=new Node();
			System.out.println("输入一个数据：");
			list[i].content=input.nextInt();
		}
		Node huffmanTreeRoot=getHuffmanTree(list);
		preOrderReserch(huffmanTreeRoot);
		
	}
	public static void preOrderReserch(Node node){
		if (node!=null) {
			System.out.print(node.content+" ");
		}
		if (node.left!=null) {
			preOrderReserch(node.left);
		}
		if(node.right!=null){
			preOrderReserch(node.right);
		}
	}
	public static Node getHuffmanTree(Node[] list){
		Node[] sortedNodes=list;
		for (int i = sortedNodes.length-1; i!=0; i--) {
			int max=sortedNodes[i].content;
			for (int j = i-1; j!=-1; j--) {
				if(max > sortedNodes[j].content){
					sortedNodes[j+1].content=sortedNodes[j].content;
					sortedNodes[j].content=max;
				}
			}
		}
		while(sortedNodes.length!=1){
			Node node=new Node();
			node.content=sortedNodes[sortedNodes.length-1].content+sortedNodes[sortedNodes.length-2].content;
			node.left=sortedNodes[sortedNodes.length-1];
			node.right=sortedNodes[sortedNodes.length-2];
			Node[] newSortedNodes=new Node[sortedNodes.length-1];
			int j;
			for (j = 0; j < newSortedNodes.length-1; j++) {
				newSortedNodes[j]=new Node();
				newSortedNodes[j]=sortedNodes[j];
			}
			newSortedNodes[j]=new Node();
			int i;
			for (i = newSortedNodes.length-2; i!=-1&&sortedNodes[i].content<node.content; i--) {
				newSortedNodes[i+1]=newSortedNodes[i];
			}
			newSortedNodes[i+1]=node;
			sortedNodes=newSortedNodes;
		}
		return sortedNodes[0];
	}
}
