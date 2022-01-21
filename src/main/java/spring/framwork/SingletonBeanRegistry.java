package spring.framwork;

/**
 * @author yhe
 * @date 2022/1/5
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
