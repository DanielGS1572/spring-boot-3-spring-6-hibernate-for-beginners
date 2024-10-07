package com.codigomorsa.tutorial;

import com.codigomorsa.tutorial.models.Libro;
import com.codigomorsa.tutorial.models.UserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/saludar")
    @ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY, reason= "fue movido")       //los estatus 3xx es moved        ... hay que configurar application.yml con server.error.include-message: always
    String miRutaConStatus(){
        return "Respuesta";
    }

    //El ResponseEntity permite setear el body y el estatus en un mismo objeto
    //ver como se esta controlando el estatus y su respuesta
    @GetMapping("/animales/{lugar}")
    public ResponseEntity<String> getAnimales(@PathVariable String lugar){ //recordar que la variable se tiene que llamar igual como en el path
        if(lugar.equals("granja")){
            return ResponseEntity.status(HttpStatus.OK).body("Caballo, vaca oveja, gallina");
        }else if(lugar.equals("selva")){
            return ResponseEntity.status(HttpStatus.OK).body("Mono, gorila, etc");
        }else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("lugar no valido");
        }
    }

    //filtrado de excepciones
    @GetMapping("/calcular/{numero}")
    public int getCalulo(@PathVariable int numero){
        throw new NullPointerException("descripción interna que solo los developers deben de ver y no el cliente");     //para que esto no lo vea el usuario se crea RutasHandler
    }

    //JSON response no como /animales/{lugar} que regresa simplemente texto
    @GetMapping("/userData")
    public ResponseEntity<String> getUserData(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"name\":\"mary\"\n" +
                        "}");
    }

    @GetMapping("/userData/v2")
    public Map<String,Map<String,String>> getUserDataV2(){
        return Map.of("user",Map.of("name","Mary","age","25"));     //Detecta y spring boot se setea por default application/json
    }

    @GetMapping("/userData/v3")
    public UserData getUserDataV3(){
        return new UserData("Mary",30,"Alameda 38");
    }
}
