package com.mytests.spring.springbootconfigpropsnames.pojos;

import org.springframework.boot.context.properties.ConfigurationPropertiesSource;
import org.springframework.boot.context.properties.NestedConfigurationProperty;


@ConfigurationPropertiesSource
public class ExternalPojoOne {

    @NestedConfigurationProperty
    ExternalPojoTwo pojoTwo;

    public ExternalPojoTwo getPojoTwo() {
        return pojoTwo;
    }

    public void setPojoTwo(ExternalPojoTwo pojoTwo) {
        this.pojoTwo = pojoTwo;
    }
}
