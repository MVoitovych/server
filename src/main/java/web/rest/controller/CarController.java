package web.rest.controller;

import org.springframework.web.bind.annotation.*;
import web.rest.models.Car;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("main/car")
public class CarController {

    public final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("list")
    public List<Car> list() {
        return carService.list();
    }

    @PostMapping("item")
    public void add(@RequestBody Car car) {
        carService.add(car);
    }

    @DeleteMapping("item/{carId}")
    public void delete(@PathVariable("carId") Long carId) {
        carService.delete(carId);
    }

    @PutMapping("item")
    public void update(@RequestBody Car car) {
        carService.update(car);
    }

}
