package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {       // 디폴트 컴포넌트의 name : 클래스명의 camelCase - parrot
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
