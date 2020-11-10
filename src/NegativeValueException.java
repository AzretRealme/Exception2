public class NegativeValueException extends Exception{
    public NegativeValueException(){}
    public NegativeValueException(String message){
        super(message);
    }
    void printMessage(){
        System.out.println("MyException has benn thrown!");
    }
}
