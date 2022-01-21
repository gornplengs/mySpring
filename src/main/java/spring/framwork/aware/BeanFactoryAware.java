package spring.framwork.aware;

import cn.hutool.core.bean.BeanException;
import spring.framwork.beanfactory.BeanFactory;

/**
 * Interface to be implemented by beans that wish to be aware of their owning {@link BeanFactory}.
 *
 * @author yhe
 * @date 2022/1/17
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeanException;
}
