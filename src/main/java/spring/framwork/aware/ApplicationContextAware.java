package spring.framwork.aware;

import cn.hutool.core.bean.BeanException;
import spring.framwork.applicationcontext.ApplicationContext;

/**
 * Interface to be implemented by any object that wishes to be notified of the {@link ApplicationContext} that it runs
 * in.
 *
 * @author yhe
 * @date 2022/1/17
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeanException;
}
