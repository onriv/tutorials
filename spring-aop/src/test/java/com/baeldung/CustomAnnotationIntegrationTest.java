package com.baeldung;

import com.baeldung.performancemonitor.Person;
import com.baeldung.performancemonitor.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomAnnotationIntegrationTest {

    @Autowired
    private Service service;

    @Autowired
    private Person person;

    @Autowired
    private PersonService personService;

    @Test
    public void shouldApplyCustomAnnotation() throws InterruptedException {
        service.skipped();
        service.serve();
        personService.getAge(person);
        personService.getFullName(person);
    }

}
