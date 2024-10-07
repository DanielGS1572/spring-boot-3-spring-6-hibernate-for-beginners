package com.codigomorsa.tutorial.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class UserData {
    public String name;
    @JsonIgnore
    public int age;     //al serealizar ya no muestra el campo
    @JsonProperty("real_addres")        //para cambiar el nombre del property
    public String address;

    //@JsonValue      //cuando vayas a serializar no quiero un json si no quiero un string
    @JsonGetter("information")      //en lugar de tener una propiedad en la clase, simplemente lo construirá en el json
    public String info(){
        return "Username is: " + name + " and age is " + age + " addres: " + address;
    }

    public UserData(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
