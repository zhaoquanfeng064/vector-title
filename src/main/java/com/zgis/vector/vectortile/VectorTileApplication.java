package com.zgis.vector.vectortile;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zgis.vector.vectortile.dao")
@ComponentScan(basePackages = {"com.zgis.vector.vectortile"})
public class VectorTileApplication {

    public static void main(String[] args) {
        SpringApplication.run(VectorTileApplication.class, args);
    }
}
