package spring.io;

/**
 * @author yhe
 * @date 2022/1/6
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
