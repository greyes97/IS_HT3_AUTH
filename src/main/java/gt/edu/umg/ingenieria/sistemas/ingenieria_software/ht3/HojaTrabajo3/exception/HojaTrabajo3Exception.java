package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.exception;

import org.springframework.http.HttpStatus;
/**
 *
 * @author gustavo
 */
public class HojaTrabajo3Exception extends RuntimeException{
    private String message;
    private HttpStatus status;

    public HojaTrabajo3Exception(String message, HttpStatus status){
        this.message = message;
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
