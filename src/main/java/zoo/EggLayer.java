package zoo;

public interface EggLayer extends AnAnimal {
    default String identifyMyself() {
        return "I am able to lay eggs.";
    }
}