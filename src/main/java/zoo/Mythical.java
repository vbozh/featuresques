package zoo;

public interface Mythical {
    default String identifyMyself() {
        return "I am a mythical creature.";
    }
}