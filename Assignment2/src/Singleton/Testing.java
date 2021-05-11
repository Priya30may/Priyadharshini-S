package Singleton;

public class Testing extends Singleton {

Testing t1=(Testing) new Singleton();
//Cannot inherit the Singleton class as it is not a default constructor for this class;

}

