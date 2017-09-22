package ioc.iocsample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args){
        BeanFactory factory = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student)factory.getBean("student");
        student.getSchool().printInfo();
    }

}