class ContactNode {
    String name;
    ContactNode left, right;

    public ContactNode(String name) {
        this.name = name;
        left = right = null;
    }
}

class ContactBST {
    ContactNode root;

    // Insert a contact
    void insert(String name) {
        root = insertRec(root, name);
    }

    ContactNode insertRec(ContactNode root, String name) {
        if (root == null) return new ContactNode(name);

        if (name.compareTo(root.name) < 0)
            root.left = insertRec(root.left, name);
        else if (name.compareTo(root.name) > 0)
            root.right = insertRec(root.right, name);

        return root;
    }

    // Search for a contact
    boolean search(String name) {
        return searchRec(root, name);
    }

    boolean searchRec(ContactNode root, String name) {
        if (root == null) return false;
        if (root.name.equals(name)) return true;

        if (name.compareTo(root.name) < 0)
            return searchRec(root.left, name);
        else
            return searchRec(root.right, name);
    }

    // Display contacts alphabetically
    void inorder() {
        System.out.println("📇 Contacts (A-Z):");
        inorderRec(root);
    }

    void inorderRec(ContactNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.name);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        ContactBST tree = new ContactBST();

        // Insert contacts
        tree.insert("Ravi");
        tree.insert("Anita");
        tree.insert("Vikram");
        tree.insert("Kiran");
        tree.insert("Divya");

        tree.inorder();

        // Search test
        String searchName = "Kiran";
        if (tree.search(searchName))
            System.out.println("\n✅ Contact found: " + searchName);
        else
            System.out.println("\n❌ Contact not found: " + searchName);
    }
}
