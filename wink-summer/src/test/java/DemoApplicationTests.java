import com.ying.summer.StartupApplication;
import com.ying.summer.entity.WinkUser;
import com.ying.summer.mapper.WinkUserMapper;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartupApplication.class)
public class DemoApplicationTests {



    @Autowired
    private WinkUserMapper winkUserMapper;
    @Test
    public void test() {
        System.out.println(winkUserMapper.selectById("1"));
    }

    public void getBookById()
        {
            System.out.println(winkUserMapper.selectById("1"));
        }
}
