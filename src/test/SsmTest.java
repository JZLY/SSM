import com.qs.service.IAccountService;
import com.qs.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SsmTest {

    @Test
    public void serviceTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.queryAccountList();
    }
}
