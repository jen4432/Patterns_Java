package Singleton;

public class Singleton {
    private static Singleton information;

    private Singleton(){

    }

    public Singleton getSingleton(){
        if(information == null){
            information = new Singleton();
        }

        return information;
    }
}
