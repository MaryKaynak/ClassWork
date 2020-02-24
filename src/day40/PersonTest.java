package day40;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person();
        p.setName("Techno");
        String actual = p.getName();
        String excepted = "Techno";
        Assert.assertEquals(actual,excepted);
    }

    @Test
    void setName() {
        Person p = new Person();
        p.getName();
        String actual = p.getName();
        String execepted = null;
        Assert.assertEquals(actual,execepted);
        
    }
    @Test
    void MethodTest(){

        Person p = new Person();
        p.setName("Study");
        String actual = p.getName();
        String excepted = "Study";
        Assert.assertEquals(actual,excepted);


    }
}