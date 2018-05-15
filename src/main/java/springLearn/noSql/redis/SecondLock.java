package main.java.springLearn.noSql.redis;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class SecondLock implements Lock {
    private final Sync sync=new Sync(2);

    private static final class Sync extends AbstractQueuedSynchronizer{
        Sync(int count){
            if(count<=0){
                throw new IllegalArgumentException("count must large zero");
            }
            setState(count);
        }
        public int tryAcquireShared(int reduceCount){
            for(;;){
                int current=getState();
                int newCount=current-reduceCount;
                if(newCount<0||compareAndSetState(current,reduceCount)){
                    return newCount;
                }
            }
        }

        public boolean tryRelaseShared(int returnCount){
            for(;;){
                int current=getState();
                int newCount=current+returnCount;
                if(compareAndSetState(current,newCount)){
                    return true;
                }
            }
        }

    }

    @Override
    public void lock() {
        sync.tryAcquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.tryRelaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}