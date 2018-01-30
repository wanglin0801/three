import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.besttone")
@EnableWebMvc
public class Application {
    @RequestMapping("/")
    public String home (){
        return "hello";
    }
    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }
}
