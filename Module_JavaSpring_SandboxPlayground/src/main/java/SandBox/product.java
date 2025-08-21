package SandBox;

class product {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Warranty extends product {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
