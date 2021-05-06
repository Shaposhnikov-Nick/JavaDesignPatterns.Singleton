public class SingletonMultiThread {
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    public static volatile SingletonMultiThread instance;
    private String values;

    private SingletonMultiThread(String values){
        this.values = values;
        System.out.println("Singleton MultiThreads was created");
    }

    public static SingletonMultiThread getInstance(String values) {
        if (instance == null) {
            synchronized (SingletonMultiThread.class) {
                if (instance == null) {
                    instance = new SingletonMultiThread(values);
                }
            }
        }
        return instance;
    }

    public String getValues() {
        return values;
    }
}
