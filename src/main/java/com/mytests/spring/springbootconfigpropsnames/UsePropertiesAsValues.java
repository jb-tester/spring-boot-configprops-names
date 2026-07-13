package com.mytests.spring.springbootconfigpropsnames;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UsePropertiesAsValues {

    @Value("${my.props.named.bar}")
    String bar;
    @Value("${my.props.named.foo}")
    String foo;
    @Value("${my.props.named.pojo.buzz}")
    String buzz1;
    @Value("${my.props.ctor-named.pojo.buzz}")
    String buzz2;
    @Value("${my.props.ctor-named.dummy}")
    String dummy;
}
