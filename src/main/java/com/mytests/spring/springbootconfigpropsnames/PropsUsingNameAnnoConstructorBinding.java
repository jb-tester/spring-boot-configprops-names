package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Name;


@ConfigurationProperties(prefix = "my.props.ctor-named")
class PropsUsingNameAnnoConstructorBinding {

    String prop1;
    String prop2;

    public PropsUsingNameAnnoConstructorBinding(@Name("dummy") String prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }
}
