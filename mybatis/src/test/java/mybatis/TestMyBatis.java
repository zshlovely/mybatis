package mybatis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shaohua.pojo.User;
import com.shaohua.service.UserService;

public class TestMyBatis {
    @Test
	public void test1(){
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[] {"spring.xml","spring-mybatis.xml"});
		UserService userService=(UserService)ac.getBean("userService");
		User u=userService.getUserById("0");
		System.out.println(u.getName());
	}
}
