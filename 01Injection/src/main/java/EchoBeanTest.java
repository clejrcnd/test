
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;


public class EchoBeanTest {
	public static void main(String[] args) {
		
		
		ApplicationContext ctx =
		new GenericXmlApplicationContext("echo.xml");
		
		//빈 접근
		
		//EchoBean echo = new EchoBean(10);
		
		EchoBean bean3 = 
				ctx.getBean("echo",EchoBean.class);
		System.out.println(bean3.sayEcho("강감찬"));
		
		
	}//end main
	
}//end class
