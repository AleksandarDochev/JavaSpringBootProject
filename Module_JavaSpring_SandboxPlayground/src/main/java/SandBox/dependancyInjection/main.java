package SandBox.dependancyInjection;

public class main {
    public static void main(String[] args) {

        BaseClassConstructorInjection baseClass;
        baseClass = new BaseClassConstructorInjection(new Dependency1(), new Dependency2());
    }
}
