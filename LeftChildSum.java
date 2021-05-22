import java.io.*;
import java.util.*;



class LeftChildSum{
public static void main(String args[])  
    { 
        Node root;
        root = new Node(10); 
        root.left = new Node(20); 
        root.right = new Node(30); 
        root.left.right = new Node(40); 
        root.left.left = new Node(50); 
        root.right.left = new Node(60); 
        root.left.left.left = new Node(80); 
        root.right.right = new Node(70); 
        root.left.left.right = new Node(90); 
        root.left.right.left = new Node(80); 
        root.left.right.right = new Node(90); 
           
        int k=countnodes(100,root);
        System.out.println(k);
        
    }
    
    static int countnodes(int k, Node root)
    {
        if(root==null)
        return 0;
        //System.out.print("||  "+root.data+"   ||");
        if(leftsum(root)>=k)
        return 1+countnodes(k,root.left)+countnodes(k,root.right);
        
        return countnodes(k,root.left)+countnodes(k,root.right);
    }
    
    static int leftsum(Node root)
    {
        if(root==null)
        return 0;
        
        if(root.left==null)
        return 0;
        
        return root.left.data+leftsum(root.left);
    }
    
}

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 