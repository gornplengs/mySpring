package spring.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yhe
 * @date 2022/1/6
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
