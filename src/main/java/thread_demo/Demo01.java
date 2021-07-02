package thread_demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo01 {
    public static void main(String[] args) {

    }
}
class Resource{
    private int flag = 0;
    private int num = 4;
    private String[] strings = {"a","b","c","d"};
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void numPrint() {
        try {
            lock.lock();
            int i = 0;
            for (; i < num; i++) {
                System.out.print(i+1);
                if (i == num - 1) {
                    i = 0;
                }
                condition.await();
                condition.signalAll();
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void stringsPrint() {
        try {
            lock.lock();
            int i = 0;
            for (; i < strings.length; i++) {
                System.out.print(strings[i]);
                if (i == num - 1) {
                    i = 0;
                    flag++;
                }
                if (flag == 4) {
                    System.out.println();
                    break;
                }
                condition.await();
                condition.signalAll();
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}