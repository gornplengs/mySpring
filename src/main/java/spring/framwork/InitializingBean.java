package spring.framwork;

/**
 * @author yhe
 * @date 2022/1/17
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
