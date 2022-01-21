package spring.framwork.applicationcontext;

import spring.framwork.DefaultListableBeanFactory;
import spring.framwork.reader.XmlBeanDefinitionReader;

/**
 * @author yhe
 * @date 2022/1/10
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            reader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
