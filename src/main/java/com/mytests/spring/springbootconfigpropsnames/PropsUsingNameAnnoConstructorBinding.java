package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Name;


@ConfigurationProperties(prefix = "my.props.ctor-named")
class PropsUsingNameAnnoConstructorBinding {

    String prop1;
    String prop2;
    InnerPojo prop3;

    public PropsUsingNameAnnoConstructorBinding(@Name("dummy") String prop1, String prop2, @Name("pojo") InnerPojo prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }
    static class InnerPojo {

        private String prop4;
        private String prop5;

        public InnerPojo(@Name("buzz") String prop4, String prop5) {
            this.prop4 = prop4;
            this.prop5 = prop5;
        }

        public String getProp5() {
            return prop5;
        }

        public String getProp4() {
            return prop4;
        }

    }
    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public InnerPojo getProp3() {
        return prop3;
    }
}
