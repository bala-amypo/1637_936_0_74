pacakage com.example.demo.exception;
public class ValidationException extends RuntimeException{


    public ValidationException(String message){
        super(message);
        
    }
    public ValidExcepton getData(int id ){
        return student.findById(id).orElse(null);
}