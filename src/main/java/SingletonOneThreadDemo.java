public class SingletonOneThreadDemo {
    public static void main(String[] args) {
// создаем однопоточный синглтон
        SingletonOneThread singletonOT = SingletonOneThread.getInstance("GoGo");
        System.out.println(singletonOT.getValues());
        System.out.println(singletonOT.getClass());

        SingletonOneThread singletonOT2 = SingletonOneThread.getInstance("Back");
        System.out.println(singletonOT2.getValues());

        System.out.println();
    }
}
