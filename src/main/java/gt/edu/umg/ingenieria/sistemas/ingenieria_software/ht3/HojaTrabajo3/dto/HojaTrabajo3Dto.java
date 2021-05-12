package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.dto;


/**
 *
 * @author gustavo
 */
public class HojaTrabajo3Dto {
    private int status;
    private String message;
    private Object key = null;

    public HojaTrabajo3Dto(int status, String message) {
        this.status = status;
        this.message = message;
    }
    public HojaTrabajo3Dto(int status, String message, Object key) {
        this.status = status;
        this.message = message;
        this.key = key;
    }

    public Object getKey() {
        return key;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
