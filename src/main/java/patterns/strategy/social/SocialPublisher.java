package patterns.strategy.social;

public sealed interface SocialPublisher
permits FacebookPublisher, TwitterPublisher, SnapchatPublisher{
        String publisher();
}
