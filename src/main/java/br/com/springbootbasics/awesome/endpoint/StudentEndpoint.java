package br.com.springbootbasics.awesome.endpoint;

import br.com.springbootbasics.awesome.model.Student;
import br.com.springbootbasics.awesome.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;


/**
 * create by Sanderson for Spring Boot Basics
 * The access point for Student API.
 */
@RestController
@RequestMapping("student")
public class StudentEndpoint {
    @Autowired
    private DateUtil dateUtil;
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll() {
        System.out.println("-----"+dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Jhon"), new Student("Rick"));
    }
}
