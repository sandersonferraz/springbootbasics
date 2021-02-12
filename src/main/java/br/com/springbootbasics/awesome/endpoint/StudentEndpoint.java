package br.com.springbootbasics.awesome.endpoint;

import br.com.springbootbasics.awesome.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.ArrayList.asList;



/**
 * create by Sanderson for Spring Boot Basics
 * The access point for Student API.
 */
@RestController
@RequestMapping("Student")
public class StudentEndpoint {

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Sudent> listAll(){
        return asList(new Student("Jhon"), new Student("Rick"));
    }
}
