package patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher{
    @Override
    public String publisher() {
        return "Snapchat";
    }
}
