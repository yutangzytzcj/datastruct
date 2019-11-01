import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDemo {
    public  static void main(String[] args){
        System.out.println("hello world2");
        List<String> list=new ArrayList<String>();
        list.add("八戒");
        list.add("张飞");
        list.add("李逵");
        list.add("刘姥姥");
        System.out.println(list);
        for (String s:list
             ) {
            System.out.println(s);
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        System.out.println(map);
    }
}
