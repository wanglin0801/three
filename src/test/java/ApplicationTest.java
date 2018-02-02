import com.besttone.entity.User;
import com.besttone.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)

@DataJpaTest
//@AutoConfigureTestDatabase*/
public class ApplicationTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void testExample() throws Exception {
        System.out.println("");
        User user = new User();
        Assert.assertNotNull(user);
    }
}
