package graph;

/**
 * @author Marshal
 * @since 2022/2/18
 */
public class FindCenter {
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
