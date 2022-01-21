package spring.framwork.beanfactory;

import spring.framwork.BeanDefinition;
import spring.framwork.BeanPostProcessor;
import spring.framwork.BeansException;

/**
 * Configuration interface to be implemented by most listable bean factories. In addition to {@link
 * ConfigurableBeanFactory}, it provides facilities to analyze and modify bean definitions, and to pre-instantiate
 * singletons.
 *
 * @author yhe
 * @date 2022/1/7
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory,
        ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
