package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import java.util.List;

public abstract class Employee {

    private String name;

    protected Employee(String name) {
        this.name = name;
    }

    protected abstract String getType();

    public static Employee createEmployee(String name, String type){
        //switch expression
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
