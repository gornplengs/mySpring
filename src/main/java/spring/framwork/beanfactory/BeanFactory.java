package spring.framwork.beanfactory;

import spring.framwork.BeansException;

/**
 * @author yhe
 * @date 2022/1/5
 */
public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

    Object getBean(String beanName, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
