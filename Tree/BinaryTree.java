package Tree;

import java.util.Scanner;

public class BinaryTree {
	private static int m=0;
	private static int n=0;
	public static Scanner read=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("������������ķ�ʽ����һ���������ȣ�");
		Node root=new Node();
		preOrderCreateBinaryTree(root);
		System.out.println("����������������");
		preOrderReserch(root);
		Node copiedNode=new Node();
		System.out.println();
		copiedNode=copyBinaryTree(root, copiedNode);
		System.out.println("������������ƵĶ�������");
		preOrderReserch(copiedNode);
		System.out.println("�����������ǣ�");
		System.out.println(depth(root));
	}
	public static void preOrderCreateBinaryTree(Node node){//���򴴽�һ��������
		System.out.print("����һ�����ݣ�");
		int content=read.nextInt();
		if (content==0) {
			node=null;
		}
		else {
			node.left=new Node();
			node.right=new Node();
			node.content=content;
			preOrderCreateBinaryTree(node.left);
			preOrderCreateBinaryTree(node.right);
		}
	}
	public static void preOrderReserch(Node node){//�������������
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
	public static Node copyBinaryTree(Node node,Node copiedNode){//���ƶ�����
		copiedNode.content=node.content;
		if (node.left!=null) {
			copiedNode.left=new Node();
			copyBinaryTree(node.left,copiedNode.left);
		}
		if(node.right!=null){
			copiedNode.right=new Node();
			copyBinaryTree(node.right,copiedNode.right);
		}
		return copiedNode;
	}
	public static int depth(Node root){//���������
		if(root==null){
			return 0;
		}
		else {
			m=depth(root.left);
			n=depth(root.right);
			if(m>n) return m+1;
			else {
				return n+1;
			}
		}
	}
}
