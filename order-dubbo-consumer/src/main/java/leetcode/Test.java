package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 控制台输入
 *
 * @author zy
 */

public class Test {


    public static void main(String[] args) {
        scannerTest();
    }

    public static void scannerTest() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter some things");
        List list = new ArrayList();
//while (input.hasNext()){
////    System.out.println(input.next());
//    list.add(input.next());
//}x`

        System.out.println("dd");
//        for (Object i:list) {
//            System.out.println(i);
//        }
//        System.out.println(input.next());


    }

    public void MapTest() {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getValue());
        }

        for (Integer i : map.keySet()){
            System.out.println(i);
            System.out.println(map.get(i));
        }

        System.out.println(map.values());
        System.out.println(map.entrySet().stream().filter(e -> e.getValue() > 20).collect(Collectors.toSet()));
    }


    /**
     * 整形数组
     * @param
     */
    public static void integerArrays() {
        Integer[] nums = {1,2,3,4,5,6,7,8,9};

        Optional<Integer> a =  Arrays.stream(nums).filter(i ->i>5 ).findFirst();

       List<Integer> list =
               Arrays.stream(nums).filter(i -> i>5).collect(Collectors.toList());

        System.out.println("");
    }
}
