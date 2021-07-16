package com.rolando.training.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplementTwo implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo desde la implementación del componente 2");
    }
}
