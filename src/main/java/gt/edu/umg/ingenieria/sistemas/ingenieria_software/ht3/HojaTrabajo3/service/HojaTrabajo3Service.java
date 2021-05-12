package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.service;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.dto.HojaTrabajo3Dto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.exception.HojaTrabajo3Exception;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.security.HojaTrabajo3Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author gustavo
 */
@Service
public class HojaTrabajo3Service {

     @Autowired
    private HojaTrabajo3Security security;

    public ResponseEntity<HojaTrabajo3Dto> signIn(HttpServletRequest request) throws HojaTrabajo3Exception {

        try {
            String user = request.getParameter("name");
            String saludo = String.format("Bienvenido %s!!", user);
            String key = this.security.createJWT(user, request.getParameter("pass"));
            System.out.println(saludo);

            return new ResponseEntity<>(new HojaTrabajo3Dto(200,"success",key), HttpStatus.OK);
        }catch (HojaTrabajo3Exception ex){
            return new ResponseEntity<>(new HojaTrabajo3Dto(400,"secret-key, no cumple con los requisitos mínimos de seguridad"), HttpStatus.BAD_REQUEST);
        }
    }
}
