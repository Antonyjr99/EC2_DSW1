package com.example.demo.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ConversionResult;


@SpringBootApplication
@RestController
public class CurrencyConverterController {

    // Definir el valor del euro directamente en el código
    private static final double EUR_VALUE = 4.11;

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConverterController.class, args);
    }

    @GetMapping("/convert")
    public ConversionResult convertCurrency(@RequestParam double amountInPEN) {
        double result = amountInPEN / EUR_VALUE;
        // Redondear el resultado a dos decimales
        result = Math.round(result * 100.0) / 100.0;
        String euros = "El monto convertido es: " + result;
        return new ConversionResult(EUR_VALUE, euros);
    }
}



