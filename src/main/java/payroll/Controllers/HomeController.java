package payroll.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

        @GetMapping("/")
        public String index() {
            return "index";
        }

}
