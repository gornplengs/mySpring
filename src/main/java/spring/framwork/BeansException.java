package spring.framwork;

/**
 * @author yhe
 * @date 2022/1/5
 */
public class BeansException extends RuntimeException {

    public BeansException(String message, Throwable e) {super(message, e);}

    public BeansException(String message) {
        super(message);
    }
}
