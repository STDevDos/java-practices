package com.froyo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Fruit {

    long id;
    String name;
    String country;

}
