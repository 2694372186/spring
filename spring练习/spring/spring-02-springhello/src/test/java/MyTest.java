import com.spring.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象已经在spring中，使用那个直接取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
