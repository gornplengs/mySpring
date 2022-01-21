package spring.framwork.applicationcontext;

import spring.framwork.BeansException;
import spring.framwork.DefaultListableBeanFactory;
import spring.framwork.beanfactory.ConfigurableListableBeanFactory;

/**
 * Base class for {@link ApplicationContext} implementations which are supposed to support multiple calls to {@link
 * #refresh()}, creating a new internal bean factory instance every time. Typically, (but not necessarily), such a
 * context will be driven by a set of config locations to load bean definitions from.
 *
 * @author yhe
 * @date 2022/1/10
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        // register all beanDefinitions
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);
}
