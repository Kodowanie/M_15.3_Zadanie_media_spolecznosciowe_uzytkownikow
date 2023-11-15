package patterns.strategy.social;

public sealed class User
permits Millenials, YGeneration, ZGeneration{

    private String userName;
    private SocialPublisher socialPublisher;

    public User(String userName, SocialPublisher socialPublisher) {
        this.userName = userName;
        this.socialPublisher = socialPublisher;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return  socialPublisher.publisher();
    }

    @Override
    public String toString() {
        return "User{" + userName + " publish something on "+ socialPublisher.publisher() + "}";
    }
}
