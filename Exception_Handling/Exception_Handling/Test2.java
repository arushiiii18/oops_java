class Test{
    public static void main(String args[]){
        doStuff();
    }
    public static void doStuff(){
        System.out.println("Hello");
        doMoreStuff();
    }
    public static void doMoreStuff(){
        System.out.println(10/0);
    }
}