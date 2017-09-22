package test;

import net.xiaxin.spring.qs.Action;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class SimpleTest {
    @Test
    public void testQuickStart(){

        ApplicationContext ctx = new FileSystemXmlApplicationContext("src\\test\\resources\\bean.xml");
        Action action = (Action) ctx.getBean("TheAction");
        System.out.println(action.excute("Rob Johnson"));
    }
}
