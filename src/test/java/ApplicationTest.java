import com.besttone.entity.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)

@DataJpaTest
//@AutoConfigureTestDatabase*/
public class ApplicationTest {
    //@Autowired
    //private UserRepository userRepository;
    @Test
    public void testExample() throws Exception {
        System.out.println("");
        Customer user = new Customer();
        Assert.assertNotNull(user);
    }
}
