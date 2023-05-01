package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap modelMap, HttpServletRequest request) {
        if (request.getParameter("count") != null) {
            int count = Integer.parseInt(request.getParameter("count"));
            modelMap.addAttribute("cars", carService.listCar(count));
        } else {
            modelMap.addAttribute("cars", carService.listCar());
        }
        return "cars";
    }



}
