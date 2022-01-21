import spring.framwork.BeanPostProcessor;
import spring.framwork.BeansException;

/**
 * @author yhe
 * @date 2022/1/14
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("SHA");
        }
        return bean;
    }
}
