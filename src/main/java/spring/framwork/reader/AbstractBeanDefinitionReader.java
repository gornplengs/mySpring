package spring.framwork.reader;

import spring.framwork.BeanDefinitionRegistry;
import spring.io.DefaultResourceLoader;
import spring.io.ResourceLoader;

/**
 * Abstract base class for bean definition readers which implement the {@link BeanDefinitionReader} interface.
 *
 * @author yhe
 * @date 2022/1/6
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;
    private final ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
