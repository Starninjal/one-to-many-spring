package com.example.onetomanyspring.domain.employee;

public enum EmployeeType {

    DESENVOLVEDOR("Desenvolvedor"),

    ANALISTA("Analista");

    private String type;

    EmployeeType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
