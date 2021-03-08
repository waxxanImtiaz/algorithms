package interfaces;

@FunctionalInterface
interface Doable extends Engine{
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  