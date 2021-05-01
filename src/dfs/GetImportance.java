package dfs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marshal
 * @date 2021/5/1
 */
public class GetImportance {
    private Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    private int dfs(Integer id) {
        Employee employee = map.get(id);
        int score = employee.importance;
        for (Integer subId : employee.subordinates) {
            score += dfs(subId);
        }
        return score;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
