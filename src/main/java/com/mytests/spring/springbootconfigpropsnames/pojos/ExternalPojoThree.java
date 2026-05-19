package com.mytests.spring.springbootconfigpropsnames.pojos;

import org.springframework.boot.context.properties.ConfigurationPropertiesSource;
import org.springframework.boot.context.properties.bind.Name;


@ConfigurationPropertiesSource
public class ExternalPojoThree {

    @Name("string")
    private String prop;
    @Name("boolean")
    private boolean bool;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }
}
