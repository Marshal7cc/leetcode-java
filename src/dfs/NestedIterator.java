package dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Marshal
 * @date 2021/3/23
 */
public class NestedIterator implements Iterator<Integer> {
    private List<Integer> data = new LinkedList<>();
    private Iterator<Integer> cur;

    public NestedIterator(List<NestedInteger> nestedList) {
        dfs(nestedList);
        cur = data.iterator();
    }

    @Override
    public Integer next() {
        return cur.next();
    }

    @Override
    public boolean hasNext() {
        return cur.hasNext();
    }

    private void dfs(List<NestedInteger> list) {
        for (NestedInteger item : list) {
            if (item.isInteger()) {
                data.add(item.getInteger());
            } else {
                dfs(item.getList());
            }
        }
    }

    public interface NestedInteger {

        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }
}
