package spring.framwork.applicationcontext;

import spring.framwork.BeansException;

/**
 * @author yhe
 * @date 2022/1/7
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
