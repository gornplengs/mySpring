import java.util.HashMap;
import java.util.Map;

/**
 * @author yhe
 * @date 2022/1/6
 */
public class UserDao {

    private static Map<String, String> map = new HashMap<>();

    /*static {
        map.put("1", "name1");
        map.put("2", "name2");
    }*/

    public void initDataMethod() {
        System.out.println("---------------- run init method ----------------");
        map.put("1", "name1");
        map.put("2", "name2");
    }

    public void destroyDataMethod() {
        System.out.println("---------------- run destroy method ----------------");
        map.clear();
    }

    public String queryUserName(String id) {
        return map.get(id);
    }
}
