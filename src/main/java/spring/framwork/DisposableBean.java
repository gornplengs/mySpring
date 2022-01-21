package spring.framwork;

/**
 * @author yhe
 * @date 2022/1/17
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
