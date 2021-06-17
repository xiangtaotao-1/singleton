package cn.qt.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化。
 * 最完美的单例方式（我暂时所知）
 */
public enum Mgr08 {

    INSTANCE;

    public void m() {}

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}
