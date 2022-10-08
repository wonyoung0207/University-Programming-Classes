import java.util.*;
 
class GFG{
 
// An AVL tree node
static class node
{
 
    int key;
    node left, right;
};
 
/* Helper function that allocates
a new node with the given key and
    null left and right pointers. */
static node newNode(int key)
{
    node Node = new node();
    Node.key = key;
    Node.left = Node.right = null;
    return (Node);
}
 
// A utility function to right
// rotate subtree rooted with y
// See the diagram given above.
static node rightRotate(node x)
{
    node y = x.left;
    x.left = y.right;
    y.right = x;
    return y;
}
 
// A utility function to left
// rotate subtree rooted with x
// See the diagram given above.
static node leftRotate(node x)
{
    node y = x.right;
    x.right = y.left;
    y.left = x;
    return y;
}
 
// This function brings the key at
// root if key is present in tree.
// If key is not present, then it
// brings the last accessed item at
// root. This function modifies the
// tree and returns the new root
static node splay(node root, int key)
{
    // Base cases: root is null or
    // key is present at root
    if (root == null || root.key == key)
        return root;
 
    // Key lies in left subtree
    if (root.key > key)
    {
        // Key is not in tree, we are done
        if (root.left == null) return root;
 
        // Zig-Zig (Left Left)
        if (root.left.key > key)
        {
            // First recursively bring the
            // key as root of left-left
            root.left.left = splay(root.left.left, key);
 
            // Do first rotation for root,
            // second rotation is done after else
            root = rightRotate(root);
        }
        else if (root.left.key < key) // Zig-Zag (Left Right)
        {
            // First recursively bring
            // the key as root of left-right
            root.left.right = splay(root.left.right, key);
 
            // Do first rotation for root.left
            if (root.left.right != null)
                root.left = leftRotate(root.left);
        }
 
        // Do second rotation for root
        return (root.left == null)? root: rightRotate(root);
    }
    else // Key lies in right subtree
    {
        // Key is not in tree, we are done
        if (root.right == null) return root;
 
        // Zig-Zag (Right Left)
        if (root.right.key > key)
        {
            // Bring the key as root of right-left
            root.right.left = splay(root.right.left, key);
 
            // Do first rotation for root.right
            if (root.right.left != null)
                root.right = rightRotate(root.right);
        }
        else if (root.right.key < key)// Zag-Zag (Right Right)
        {
            // Bring the key as root of
            // right-right and do first rotation
            root.right.right = splay(root.right.right, key);
            root = leftRotate(root);
        }
 
        // Do second rotation for root
        return (root.right == null)? root: leftRotate(root);
    }
}
 
// Function to insert a new key k
// in splay tree with given root
static node insert(node root, int k)
{
    // Simple Case: If tree is empty
    if (root == null) return newNode(k);
 
    // Bring the closest leaf node to root
    root = splay(root, k);
 
    // If key is already present, then return
    if (root.key == k) return root;
 
    // Otherwise allocate memory for new node
    node newnode = newNode(k);
 
    // If root's key is greater, make
    // root as right child of newnode
    // and copy the left child of root to newnode
    if (root.key > k)
    {
        newnode.right = root;
        newnode.left = root.left;
        root.left = null;
    }
 
    // If root's key is smaller, make
    // root as left child of newnode
    // and copy the right child of root to newnode
    else
    {
        newnode.left = root;
        newnode.right = root.right;
        root.right = null;
    }
 
    return newnode; // newnode becomes new root
}
 
// A utility function to print
// preorder traversal of the tree.
// The function also prints height of every node
static void preOrder(node root)
{
    if (root != null)
    {
        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
 
/* Driver code*/
public static void main(String[] args)
{
    node root = newNode(100);
    root.left = newNode(50);
    root.right =  newNode(200);
    root.left.left =  newNode(40);
    root.left.left.left =  newNode(30);
    root.left.left.left.left =  newNode(20);
    root = insert(root, 25);
    System.out.print("Preorder traversal of the modified Splay tree is \n");
    preOrder(root);
}
}