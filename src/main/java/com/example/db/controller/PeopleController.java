package com.example.db.controller;

import com.example.db.entity.PeopleEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class PeopleController {


    @GetMapping("/v1/getPeople")
    public PeopleEntity getPeople() {
        PeopleEntity people = new PeopleEntity();
        people.setName("Витя");
        people.setId(25);
        people.setAge(35);
        people.setGender("male");
        people.setPhone("25355-35-65");
        return people;
    }

    @PostMapping("/v1/newPeople")
    public String newPeople(@RequestBody PeopleEntity people) {
        System.out.println(people.getName());
        System.out.println(people.getId());
        System.out.println(people.getAge());
        System.out.println(people.getGender());
        System.out.println(people.getPhone());
        return "Успешно добавлен!";
    }

}

