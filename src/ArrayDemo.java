import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        Integer[] a=new Integer[10];
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            a[i]=random.nextInt(100);
        }
        for (Integer integer:a
             ) {
            System.out.println(integer);
        }
    }
}
