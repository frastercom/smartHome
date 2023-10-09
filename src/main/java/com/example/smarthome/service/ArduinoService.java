package com.example.smarthome.service;

import com.example.smarthome.json.arduino.Status;

/**
 * Получение/запись данных в БД
 */
public class ArduinoService {

    public void setStatus(Long id, Status status) {

    }

    public Status getStatus(Long id) {
        return new Status();
    }
}
