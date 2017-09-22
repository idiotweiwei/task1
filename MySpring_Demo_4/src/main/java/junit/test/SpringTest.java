package junit.test;



import com.bird.service.PersonServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class SpringTest{
    @Test
    public void test(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        PersonServer s = (PersonServer)ctx.getBean("personService");
        s.save();
    }

}
