package zoo;

public interface AnAnimal {

    default String identifyMyself() {
        return "I am an animal.";
    }
}
