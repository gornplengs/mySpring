package spring.framwork.aware;

/**
 * Interface to be implemented by beans that want to be aware of their bean name in a bean factory.
 *
 * @author yhe
 * @date 2022/1/17
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);
}
