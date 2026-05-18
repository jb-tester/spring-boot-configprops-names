package com.mytests.spring.springbootconfigpropsnames;

import com.mytests.spring.springbootconfigpropsnames.pojos.ExternalPojoOne;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;


@ConfigurationProperties("my.props.nested-named")
public class PropsUsingNestedPojosUsingNameAnno {

 @NestedConfigurationProperty
  ExternalPojoOne pojoOne;

  public ExternalPojoOne getPojoOne() {
    return pojoOne;
  }

  public void setPojoOne(ExternalPojoOne pojoOne) {
    this.pojoOne = pojoOne;
  }
}
