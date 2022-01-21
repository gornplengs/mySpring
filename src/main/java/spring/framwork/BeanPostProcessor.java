package spring.framwork;

/**
 * Factory hook that allows for custom modification of new bean instances,e.g. checking for marker interfaces or
 * wrapping them with proxies.
 *
 * @author yhe
 * @date 2022/1/7
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
