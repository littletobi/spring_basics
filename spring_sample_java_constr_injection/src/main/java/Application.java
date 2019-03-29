import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.java_fundamentals.service.CustomerService;
import com.java_fundamentals.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = appContext.getBean("customerServiceBean", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());
	}
}
