package  com.shopping.config.properties;

import lombok.Data;

/**
 * The class Async task properties.
 *
 * @author shopping.net @gmail.com
 */
@Data
public class SwaggerProperties {

	private String title;

	private String description;

	private String version = "1.0";

	private String license = "Apache License 2.0";

	private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

	private String contactName = "无痕";

	private String contactUrl = "http://shopping.net";

	private String contactEmail = "shopping.net@gmail.com";
}
