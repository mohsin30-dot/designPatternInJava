







/* Scrabble game project>>> Need more work to done
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
    // single pattern define a class that has only one instance and provides a global point of access
    // a class must ensure that only single instance should be created and single object can be used by all other classes
    private static Singleton firstInstance = null;

    // hold all my scrabble letters in array
    String scrabbleLetters = {

    }
    private Singleton(){}
    public static Singleton getInstance(){
        //getInstance globally used Singleton pattern
        if(firstInstance == null){
            firstInstance = new Singleton();// lazy instantiation
        }
        return firstInstance;

    }
}
*/