import cn.hutool.core.bean.BeanException;
import spring.framwork.applicationcontext.ApplicationContext;
import spring.framwork.aware.ApplicationContextAware;
import spring.framwork.aware.BeanClassLoaderAware;
import spring.framwork.aware.BeanFactoryAware;
import spring.framwork.aware.BeanNameAware;
import spring.framwork.beanfactory.BeanFactory;

/**
 * @author yhe
 * @date 2022/1/5
 */
public class UserService implements BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    private String id;
    private String company;
    private String location;
    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("user info: " + userDao.queryUserName(id));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "applicationContext=" + applicationContext +
                ", beanFactory=" + beanFactory +
                ", id='" + id + '\'' +
                ", company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", userDao=" + userDao +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeanException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeanException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is：" + name);
    }
}
