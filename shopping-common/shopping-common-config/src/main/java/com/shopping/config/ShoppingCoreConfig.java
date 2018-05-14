package  com.shopping.config;


import  com.shopping.config.properties.ShoppingProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The class Aliyun core config.
 *
 * @author shopping.net @gmail.com
 */
@Configuration
@EnableConfigurationProperties(ShoppingProperties.class)
public class ShoppingCoreConfig {
}
