package com.mytests.spring.springbootconfigpropsnames;

import com.mytests.spring.springbootconfigpropsnames.pojos.ExternalPojoOne;
import com.mytests.spring.springbootconfigpropsnames.pojos.ExternalPojoThree;
import com.mytests.spring.springbootconfigpropsnames.pojos.ExternalPojoTwo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.Map;


@ConfigurationProperties("my.props.nested-named")
public class PropsUsingNestedPojosUsingNameAnno {

    Map<String, ExternalPojoThree> pojoMap;

    @NestedConfigurationProperty
    ExternalPojoOne pojoOne;

  public ExternalPojoOne getPojoOne() {
    return pojoOne;
  }

  public void setPojoOne(ExternalPojoOne pojoOne) {
    this.pojoOne = pojoOne;
  }

    public Map<String, ExternalPojoThree> getPojoMap() {
        return pojoMap;
    }

    public void setPojoMap(Map<String, ExternalPojoThree> pojoMap) {
        this.pojoMap = pojoMap;
    }
}
