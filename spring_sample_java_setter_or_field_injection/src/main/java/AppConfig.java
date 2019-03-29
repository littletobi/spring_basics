import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.java_fundamentals.repository.CustomerRepository;
import com.java_fundamentals.repository.HibernateCustomerRepositoryImpl;
import com.java_fundamentals.service.CustomerService;
import com.java_fundamentals.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "com.java_fundamentals" }) // potrzebne do @Autowired
public class AppConfig {

	@Bean(name = "customerServiceBean")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		customerService.setCustomerRepository(getCustomerRepository()); //jak uzywamy Autowired (na polu albo setterze) to mozna to zakomentowac inaczej bedzie sie dwa razy wykonywac
		return customerService;
	}

	@Bean(name = "customerRepositoryBean")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
//A teraz uwaga :)
//Mozna zakomentowac wszystko w tej klasie i dodac adnotacje @Service("customerServiceBean") i @Repository("customerRepositoryBean") 
//do klas *Impl i tez bedzie dzialalo
