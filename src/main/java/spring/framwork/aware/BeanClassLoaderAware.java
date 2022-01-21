package spring.framwork.aware;

/**
 * Callback that allows a bean to be aware of the bean{@link ClassLoader class loader}; that is, the class loader used
 * by the present bean factory to load bean classes.
 *
 * @author yhe
 * @date 2022/1/17
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}
