package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Name;


@ConfigurationProperties(prefix = "my.props.named")
class PropsUsingNameAnno {

    @Name("foo")
    String prop1;

    @Name("bar")
    String prop2;

    @Name("pojo")
    InnerPojo prop3;

    public InnerPojo getProp3() {
        return prop3;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public void setProp3(InnerPojo prop3) {
        this.prop3 = prop3;
    }

    public String getProp2() {
        return prop2;
    }

    public String getProp1() {
        return prop1;
    }

    static class InnerPojo {
        @Name("buzz")
        private String prop4;
        private String prop5;

        public void setProp5(String prop5) {
            this.prop5 = prop5;
        }

        public void setProp4(String prop4) {
            this.prop4 = prop4;
        }

        public String getProp5() {
            return prop5;
        }

        public String getProp4() {
            return prop4;
        }
    }
}
