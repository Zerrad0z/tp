package com.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
class PersonTest {
    // ...
    @Test
    void testGetAge() {
        Person person = new Person("Joey","Doe", LocalDate.parse("2013-01-12"));
        long age = person.getAge();
        assertEquals(11, age);
    }
}