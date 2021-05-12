package gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.controller;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.dto.HojaTrabajo3Dto;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.ht3.HojaTrabajo3.service.HojaTrabajo3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author gustavo
 */
@RestController

public class HojaTrabajo3Controller {
    @Autowired
    private HojaTrabajo3Service service;

    @RequestMapping( value = "/auth", method = RequestMethod.POST)
    public ResponseEntity<HojaTrabajo3Dto> auth(HttpServletRequest request)  {
        return this.service.signIn(request);
    }
}
