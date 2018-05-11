package com.binggou.engine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 9:26
 */
@SpringBootApplication
@Slf4j
public class CleaningEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleaningEngineApplication.class, args);
        log.info("Application  DataCleaningEngine start-up is success!");
    }

}
