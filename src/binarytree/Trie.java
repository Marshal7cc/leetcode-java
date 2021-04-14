package binarytree;

/**
 * @author Marshal
 * @date 2021/4/14
 */
public class Trie {
    private Trie[] children;
    private boolean isEnd;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        this.children = new Trie[26];
        isEnd = false;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        int n = word.length();
        Trie current = this;
        for (int i = 0; i < n; i++) {
            int idx = word.charAt(i) - 'a';
            if (current.children[idx] == null) {
                current.children[idx] = new Trie();
            }
            current = current.children[idx];
        }
        current.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie searchPrefix(String word) {
        Trie current = this;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            current = current.children[idx];
            if (current == null) {
                return null;
            }
        }
        return current;
    }
}
