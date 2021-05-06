public class SingletonMultiThreadDemo {
    public static void main(String[] args) {
        // создаем синглтон для многопоточности
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonMultiThread mySingletonMT = SingletonMultiThread.getInstance("KoKo");
                System.out.println(mySingletonMT.getValues());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonMultiThread mySingletonMT = SingletonMultiThread.getInstance("oKoK");
                System.out.println(mySingletonMT.getValues());
            }
        });

        thread1.start();
        thread2.start();
    }
}
