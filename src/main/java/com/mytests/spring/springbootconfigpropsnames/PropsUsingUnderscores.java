package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;


@ConfigurationProperties(prefix = "my.props.underscores")
class PropsUsingUnderscores {

    String prop_with_underscores_1;
    String prop_with_underscores_two;
    List<String> list_prop_with_underscores_three;

    public String getProp_with_underscores_1() {
        return prop_with_underscores_1;
    }

    public void setProp_with_underscores_1(String prop_with_underscores_1) {
        this.prop_with_underscores_1 = prop_with_underscores_1;
    }

    public String getProp_with_underscores_two() {
        return prop_with_underscores_two;
    }

    public void setProp_with_underscores_two(String prop_with_underscores_two) {
        this.prop_with_underscores_two = prop_with_underscores_two;
    }

    public List<String> getList_prop_with_underscores_three() {
        return list_prop_with_underscores_three;
    }

    public void setList_prop_with_underscores_three(List<String> list_prop_with_underscores_three) {
        this.list_prop_with_underscores_three = list_prop_with_underscores_three;
    }
}
