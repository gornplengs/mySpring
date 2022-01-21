package spring.framwork.awareprocessor;

import spring.framwork.BeanPostProcessor;
import spring.framwork.BeansException;
import spring.framwork.applicationcontext.ApplicationContext;
import spring.framwork.aware.ApplicationContextAware;

/**
 * @author yhe
 * @date 2022/1/17
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
