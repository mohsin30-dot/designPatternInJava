package com.company;

class SingletonEagar {
    // when we are defining variable at the same time we are declaring it
    private static SingletonEagar instance = new SingletonEagar();

    private SingletonEagar(){} // constructor should be private

    public static SingletonEagar getInstance() {
        return instance;
        // getInstance is method,its returning the Singleton type of class
    }
}

class Singleton {
    // lazy initialization, whenever need then create object
    // Whenever call of method,instance is null, create instance & new object of singleton class
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){}
    // rather than synchronized whole method, we can synchronize only a block

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if(instance == null) {
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if(instance == null) {
            synchronized (SingletonSynchronized.class) {
                if(instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}
class SingletonExample {

    public static void main(String[] args) {
        SingletonSynchronized instance = SingletonSynchronized.getInstance();

        System.out.println(instance);

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

        System.out.println(instance1);
    }
}

/* note-
# single pattern define a class that has only one instance and provides a global point of access
# a class must ensure that only single instance should be created and single object can be used by all other classes
    private static Singleton firstInstance = null;
 */

