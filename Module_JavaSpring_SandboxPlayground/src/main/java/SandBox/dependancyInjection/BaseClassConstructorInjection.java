package SandBox.dependancyInjection;

public class BaseClassConstructorInjection {
            Dependency1 dependency1reference;
            Dependency2 dependency2reference;

            public BaseClassConstructorInjection(Dependency1 dependency1constructorReference, Dependency2 dependency2constructorReference) {
                System.out.println("BaseClassConstructorInjection Constructor called");
                this.dependency1reference = dependency1constructorReference;
                this.dependency2reference = dependency2constructorReference;
            }
        }
