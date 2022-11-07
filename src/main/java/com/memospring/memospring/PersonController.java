package com.memospring.memospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("2Root");
        person.setAge(22);
        person.setAddress("Gyeong-gi");
        person.setJob("College student");
        return person;
    }
}
