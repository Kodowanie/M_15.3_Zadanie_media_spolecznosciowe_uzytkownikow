package patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher{
    @Override
    public String publisher() {
        return "Twitter";
    }
}
