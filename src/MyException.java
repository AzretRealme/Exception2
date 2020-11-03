public class MyException extends Exception{

    public MyException(){}
    public MyException(String message){
        super(message);
    }
    void printMessage(){
        System.out.println("MyException has benn thrown!");
    }
}
