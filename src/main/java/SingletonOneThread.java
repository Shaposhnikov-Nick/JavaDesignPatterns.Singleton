public class SingletonOneThread {
    static SingletonOneThread instance;
    private String values;

    private SingletonOneThread(String values){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.values = values;
        System.out.println("Singleton OneThread was created");
    }

    public static SingletonOneThread getInstance(String values){
        if (instance == null){
            instance = new SingletonOneThread(values);
        }
        return instance;
    }

    public String getValues() {
        return values;
    }
}
