package zoo;

public interface Flyer {
    default String identifyMyself() {
        return "I am able to fly.";
    }
}