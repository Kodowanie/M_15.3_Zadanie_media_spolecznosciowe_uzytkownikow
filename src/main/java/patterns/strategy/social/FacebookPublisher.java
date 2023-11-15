package patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher{
    @Override
    public String publisher() {
        return "Facebook";
    }
}
