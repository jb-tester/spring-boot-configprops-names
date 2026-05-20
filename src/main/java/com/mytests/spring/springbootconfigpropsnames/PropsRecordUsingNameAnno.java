package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Name;

@ConfigurationProperties("my.props.record-named")
public record PropsRecordUsingNameAnno(
        @Name("boo") String prop1,
        @Name("booo")  String prop2) {

}
