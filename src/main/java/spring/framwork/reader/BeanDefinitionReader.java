package spring.framwork.reader;

import spring.framwork.BeanDefinitionRegistry;
import spring.framwork.BeansException;
import spring.io.Resource;
import spring.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 *
 * @author yhe
 * @date 2022/1/6
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
