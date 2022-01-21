package spring.framwork.beanfactory;

import spring.framwork.BeanPostProcessor;
import spring.framwork.SingletonBeanRegistry;

/**
 * Configuration interface to be implemented by most bean factories. Provides facilities to configure a bean factory, in
 * addition to the bean factory client methods in the {@link BeanFactory} interface.
 *
 * @author yhe
 * @date 2022/1/10
 */
public interface ConfigurableBeanFactory extends SingletonBeanRegistry, HierarchicalBeanFactory {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();
}
