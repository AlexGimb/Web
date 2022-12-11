package alexgimb.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {
    @GetMapping
    public String goApp() {
        return "Приложение запущено!";
    }
    @GetMapping("/info")
    public String info() {
        return "Гимберг Александр " +
                "WebApp" +
                LocalDate.now()+
                "Приложение рецептов";
    }

}
