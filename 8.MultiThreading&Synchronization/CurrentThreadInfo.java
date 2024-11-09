public class CurrentThreadInfo {
    public static void main(String[] args) {
        //It retunrs the curren thread
        Thread th=Thread.currentThread();
        //It returns the current thread name
        System.out.println(th.getName());
        //It returns the  priority of the thread
        System.out.println(th.getPriority());

        //It sets the name for the current thread
        th.setName("Dinesh");
        //It sets the priority for the current thread
        th.setPriority(Thread.MAX_PRIORITY);
        //It returns the current thread name
        System.out.println(th.getName());
        //It returns the  priority of the thread
        System.out.println(th.getPriority());

    }
}