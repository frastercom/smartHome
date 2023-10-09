package com.example.smarthome.controllers.arduino;

import com.example.smarthome.json.arduino.Status;
import org.springframework.web.bind.annotation.*;

/**
 * Ввиду особеностей конструкции Ардуино, создан данный класс для проверки состояний
 */
@RestController
@RequestMapping("/arduino")
public class ArduinoController {

    @GetMapping("/door")
    public Status checkOpenDoor() {
        return new Status("OPEN");
    }

    @PostMapping("/door")
    public Status setStatusDoor(@RequestBody Status status) {
        return new Status(status.getStatus());
    }

    @PostMapping("/light")
    public Status setLight(@RequestBody Status status) {
        return new Status(status.getStatus());
    }

    @GetMapping
    public Status checkLight() {
        return new Status("ON");
    }

}
