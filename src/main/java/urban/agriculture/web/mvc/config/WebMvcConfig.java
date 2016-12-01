package urban.agriculture.web.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	// Static Resource Config
	// equivalents for <mvc:> tags
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("**").addResourceLocations(ConstantsUrban.resourcesRootForWebView);
//		registry.addResourceHandler("/resources/css/**")
//				.addResourceLocations(ConstantsUrban.cssResourcesRootForWebView);
//		registry.addResourceHandler("/resources/fonts/**")
//				.addResourceLocations(ConstantsUrban.fontsResourcesRootForWebView);
//		registry.addResourceHandler("/resources/images/**")
//				.addResourceLocations(ConstantsUrban.imagesResourcesRootForWebView);
//		registry.addResourceHandler("/resources/js/**")
//				.addResourceLocations(ConstantsUrban.javascriptResourcesRootForWebView);
	}

	// equivalent for <mvc:default-servlet-handler/> tag
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
