package spring.framwork;

/**
 * @author yhe
 * @date 2022/1/18
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
