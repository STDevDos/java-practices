package com.froyo.junit5;

import com.froyo.Fruit;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProbandoCollectionSetUpdate {

    @Test
    public void test(){

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(1L, "Apple", "India"));
        fruits.add(new Fruit(2L, "Pineapple", "India"));
        fruits.add(new Fruit(3L, "Kiwi", "New Zealand"));

        fruits.forEach(f -> f.setName(f.getName() + "s-FROYO"));

        System.out.println(fruits);

//        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal = new BigDecimal("25.2535");
//      System.out.println(StringUtils.defaultIfBlank(bigDecimal,StringUtils.SPACE));
      System.out.println("Hay un"+Objects.toString(bigDecimal,StringUtils.SPACE)+"espacio.");

    }

}
