package helo.typeconverter;

import helo.typeconverter.converter.IntegerToStringConverter;
import helo.typeconverter.converter.IpPortToStringConverter;
import helo.typeconverter.converter.StringToIntegerConverter;
import helo.typeconverter.converter.StringToIpPortConverter;
import helo.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        // converter와 아래 formatter는 타입변환이 같은데 converter 우선으로 적용되서 주석처리
//        registry.addConverter(new StringToIpPortConverter());
//        registry.addConverter(new IpPortToStringConverter());

        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IntegerToStringConverter());

        registry.addFormatter(new MyNumberFormatter());
    }
}
