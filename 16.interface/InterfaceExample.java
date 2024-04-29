class Computer{
    public void code(){

    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code, compile, run: faster");
    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Developer{
            public void appDev(Computer com){
                com.code();
            }
}


public class InterfaceExample {
    public static void main(String[] args) {
        // here, take Computer reference, and create Laptop object, same as Desktop object
        Computer lap = new Laptop();
        Computer com = new Desktop();

        // now call developer with laptop or desktop he can code using both
        Developer dev = new Developer();
        dev.appDev(lap);
        dev.appDev(com);
    }
}
