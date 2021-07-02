package procon;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者消费者
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Resources resources = new Resources();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resources.increment();
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resources.decrement();
            }
        },"B").start();
    }
}

/**
 * 线程操作资源类
 */
class Resources{

    private int num = 1;
    boolean flag = true;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() {
        lock.lock();
        try {
            while (flag) {
                condition.await();
            }
            num = num+1;
            System.out.print(Thread.currentThread().getName()+num+" ");
            flag = true;
            condition.signalAll();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() {
        lock.lock();
        try {
            while (!flag) {
                condition.await();
            }
            num = num-1;
            System.out.print(Thread.currentThread().getName()+num+" ");
            flag = false;
            condition.signalAll();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
