package spring.framwork.aware;

/**
 * Marker superinterface indicating that a bean is eligible to be notified by the Spring container of a particular
 * framework object through a callback-style method.  Actual method signature is determined by individual sub-interfaces,
 * but should typically consist of just one void-returning method that accepts a single argument.
 * <p>
 * 标记类接口，实现该接口可以被Spring容器感知
 *
 * @author yhe
 * @date 2022/1/17
 */
public interface Aware {
}
