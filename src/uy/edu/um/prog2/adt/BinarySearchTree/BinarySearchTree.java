package uy.edu.um.prog2.adt.BinarySearchTree;


class BinarySearchTree implements SearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else if (value > root.value) {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(TreeNode root, int value) {
        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        } else if (value < root.value) {
            return searchNode(root.left, value);
        } else {
            return searchNode(root.right, value);
        }
    }

    public boolean delete(int value) {
        TreeNode parentNode = null;
        TreeNode currentNode = root;

        while (currentNode != null && currentNode.value != value) {
            parentNode = currentNode;
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        if (currentNode == null) {
            return false; // Node to delete not found
        }

        // Case 1: No child or one child
        if (currentNode.left == null) {
            if (parentNode == null) {
                root = currentNode.right;
            } else if (currentNode == parentNode.left) {
                parentNode.left = currentNode.right;
            } else {
                parentNode.right = currentNode.right;
            }
        } else if (currentNode.right == null) {
            if (parentNode == null) {
                root = currentNode.left;
            } else if (currentNode == parentNode.left) {
                parentNode.left = currentNode.left;
            } else {
                parentNode.right = currentNode.left;
            }
        } else {
            // Case 2: Two children
            TreeNode successorParent = currentNode;
            TreeNode successor = currentNode.right;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            if (successorParent != currentNode) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }

            currentNode.value = successor.value;
        }

        return true;
    }
}

