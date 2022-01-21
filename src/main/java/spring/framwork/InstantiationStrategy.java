package spring.framwork;

import java.lang.reflect.Constructor;

/**
 * @author yhe
 * @date 2022/1/5
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
