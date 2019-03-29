import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java_fundamentals.service.CustomerService;
import com.java_fundamentals.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		CustomerService customerService = appContext.getBean("customerServiceBean", CustomerService.class);
		CustomerService customerService = appContext.getBean("otherCustomerServiceBean", CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstName());
	}

}
