import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static Long id = 0l;
    private static ReentrantLock lock = new ReentrantLock();

    public static long getNewID() {
        long result;
        lock.lock();
        //
        try{
            result=++id;
        } finally {
            lock.unlock();
            //
        }
        return result;
    }
    private IdGenerate(){

    }
}
