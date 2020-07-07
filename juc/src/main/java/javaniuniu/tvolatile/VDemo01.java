package javaniuniu.tvolatile;

/**
 *
 */

// volatile 不保证原子性
public class VDemo01 {

    // volatile 不保证原子性
    private static  int num = 0;

    public static void add() {
        num ++ ; // 不是原子性操作
    }

    public static void main(String[] args) {

        // 理论上 num 结果应该为 2 万
        for (int i = 1; i <=20 ; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    System.out.println(Thread.currentThread().getName()+"==> "+num);
                    add();
                }
            }).start();
        }

        while (Thread.activeCount() >2) { // man gc
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() +"  " + num);
    }
}