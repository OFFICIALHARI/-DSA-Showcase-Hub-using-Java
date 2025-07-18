import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord;
}

public class TrieAutocomplete {
    private final TrieNode root;

    public TrieAutocomplete() {
        root = new TrieNode();
    }

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node = node.children.computeIfAbsent(ch, c -> new TrieNode());
        }
        node.isEndOfWord = true;
    }

    // Return words with the given prefix
    public List<String> getWordsWithPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        TrieNode node = root;

        // Traverse to the end of the prefix
        for (char ch : prefix.toCharArray()) {
            if (!node.children.containsKey(ch)) return result;
            node = node.children.get(ch);
        }

        // DFS from the prefix node
        dfs(node, new StringBuilder(prefix), result);
        return result;
    }

    private void dfs(TrieNode node, StringBuilder prefix, List<String> result) {
        if (node.isEndOfWord) result.add(prefix.toString());

        for (char ch : node.children.keySet()) {
            prefix.append(ch);
            dfs(node.children.get(ch), prefix, result);
            prefix.deleteCharAt(prefix.length() - 1); // backtrack
        }
    }

    // Driver code
    public static void main(String[] args) {
        TrieAutocomplete trie = new TrieAutocomplete();
        String[] dictionary = {"cat", "car", "cart", "dog", "dove", "deal"};

        for (String word : dictionary) {
            trie.insert(word);
        }

        String prefix = "ca";
        List<String> suggestions = trie.getWordsWithPrefix(prefix);
        System.out.println("Autocomplete suggestions for \"" + prefix + "\": " + suggestions);
    }
}
