import cn.hutool.core.io.IoUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.framwork.*;
import spring.framwork.applicationcontext.ClassPathXmlApplicationContext;
import spring.framwork.reader.XmlBeanDefinitionReader;
import spring.io.DefaultResourceLoader;
import spring.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yhe
 * @date 2022/1/5
 */
class BeanFactoryTest {

    private DefaultResourceLoader resourceLoader;

    @BeforeEach
    void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        reader.loadBeanDefinitions("classpath:spring.xml");

        MyBeanFactoryProcessor beanFactoryProcessor = new MyBeanFactoryProcessor();
        beanFactoryProcessor.postProcessBeanFactory(beanFactory);

        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);


        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        System.out.println(userService);;
    }

    @Test
    void testXml() {
        // use context application
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.toString());
    }

    @Test
    void testClassPath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    void testFile() throws IOException {
        Resource resource = resourceLoader.getResource("src/main/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testUrl() throws IOException {
        Resource resource = resourceLoader.getResource("https://mp.weixin.qq.com/s/GMcHUL7-oB7T0GWKjNC5Ng");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}