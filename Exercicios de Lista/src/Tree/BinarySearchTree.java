package Tree;


import Lists.No;

public class BinarySearchTree {
    //this is a Searching Binary Tree
    private NoTree root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(int element) {
        if (root == null) {
            root = new NoTree(element);
        } else {
            add(element, root);
        }
    }

    private void add(int element, NoTree root) {
        if (element < root.dado) {
            //insert left subtree
            if (root.left == null) {
                root.left = new NoTree(element);
            } else {
                add(element, root.left);
            }
        } else if (element > root.dado) {
            //insert right subtree
            if (root.right == null) {
                root.right = new NoTree(element);
            } else {
                add(element, root.right);
            }
        }
    }

    public void remove(int element) {
        if (root != null) {
            remove(element, root, null);
        }
    }

    public void remove(int element, NoTree root, NoTree parent) {
        if (element == root.dado) {
            //analyze and remove
            if (root.left == null && root.right == null) { //no children
                if (root == parent.left) {
                    parent.left = null; //removes left child
                } else {
                    parent.right = null; // removes right child
                }
            } else if (root.left != null && root.right == null) { // has one left child
                if (root == parent.left) {
                    parent.left = root.left;
                } else {
                    parent.right = root.left;
                }
            } else if (root.left == null && root.right != null) { // has one right child
                if (root == parent.left) {
                    parent.left = root.right;
                } else {
                    parent.right = root.right;
                }
            } else if (root.left != null && root.right != null) { // has children on both sides
                root.dado = min(root.right);
                remove(root.dado, root.right, root);
            }
        } else if (element < root.dado) {
            //search left subtree
            if (root.left != null) {
                remove(element, root.left, root);
            }
        } else if (element > root.dado) {
            //search right subtree
            if (root.right != null) {
                remove(element, root.right, root);
            }
        }
    }

    public int min(NoTree root){
        if(root.left == null){
            return root.dado;
        }else{
            return min(root.left);
        }
    }

    public int max(NoTree root){
        if(root.right == null){
            return root.dado;
        }else{
            return min(root.right);
        }
    }

    public boolean search(int element) {
        if (root == null) {
            return false;
        } else {
            return search(element, root);
        }
    }

    private boolean search(int element, NoTree root) {
        if (element == root.dado) {
            return true;
        } else if (element < root.dado) {
            //search left subtree
            if (root.left == null) {
                return false;
            } else {
                return search(element, root.left);
            }
        } else if (element > root.dado) {
            //search right subtree
            if (root.right == null) {
                return false;
            } else {
                return search(element, root.right);
            }
        }

        return false;
    }

    public void show() {
        showPreOrder(root);
        System.out.println();
//        showInOrder(root);
//        System.out.println();
//        showPostOrder(root);
    }

    public void showPreOrder(NoTree root) {
        System.out.print(root.dado + " ");
        if (root.left != null) {
            showPreOrder(root.left);
        }
        if (root.right != null) {
            showPreOrder(root.right);
        }

    }

    public void showInOrder(NoTree root) {
        if (root.left != null) {
            showInOrder(root.left);
        }

        System.out.print(root.dado + " ");

        if (root.right != null) {
            showInOrder(root.right);
        }

    }

    public void showPostOrder(NoTree root) {
        if (root.left != null) {
            showPostOrder(root.left);
        }

        if (root.right != null) {
            showPostOrder(root.right);
        }

        System.out.print(root.dado + " ");

    }
}

