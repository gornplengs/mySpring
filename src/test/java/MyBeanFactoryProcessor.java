import spring.framwork.*;
import spring.framwork.beanfactory.ConfigurableListableBeanFactory;

/**
 * @author yhe
 * @date 2022/1/14
 */
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");

        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "111"));
    }
}
