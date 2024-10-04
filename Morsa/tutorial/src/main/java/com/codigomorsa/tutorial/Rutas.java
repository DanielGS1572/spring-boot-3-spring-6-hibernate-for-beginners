package com.codigomorsa.tutorial;

import com.codigomorsa.tutorial.models.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController //Restcontroller es una anotación con la que se definen rutas
public class Rutas {
    //Cómo el contexto de los metodos no es estatico, se puede quitar
    private /*static*/ Logger logger = LoggerFactory.getLogger(Rutas.class);


    @GetMapping("/")
    String miPrimeraRuta(){
        return "Hola Mundo";
    }

    @GetMapping("/libro/{id}/editorial/{editorial}")  //  http://localhost:8080/libro/3/editorial/algo
    String leerLibro(@PathVariable int id, @PathVariable String editorial){   //el nombre debe coincidir con el path par.
        return "Leyendo el libro id: " + id + " editorial: " + editorial;
    }

    @GetMapping("/libro2/{id}")
    String leerLibro2(@PathVariable int id, @RequestParam String params){       //queryParams se usa con RequestParam
        return "id " + id + " params: " + params;       //si se recibe más parametros que no hacen match con los nombres definidos (params) lo ignorará, pero sí o sí tiene que recibir "params"
    }

    @PostMapping("/libro")      //para cachar el json se usa como argumento @RequestBody
    String guardaLibro(@RequestBody Map<String,Object> libro){
        //Para mapear un json hay 2 formas
        //de forma genérica Map<String,Object>
        libro.keySet().forEach(llave ->{
            logger.debug("llave {} valor {} ", llave, libro.get(llave)); //el primer parametro los {} es un formatter
        });
        return "libro guardado";
    }

    @PostMapping("/libro2")
    String guardarLibro(@RequestBody Libro libro){
        logger.debug("Nombre {} Editorial",libro.nombre, libro.editorial);
        return "libro guardado";
    }
}
