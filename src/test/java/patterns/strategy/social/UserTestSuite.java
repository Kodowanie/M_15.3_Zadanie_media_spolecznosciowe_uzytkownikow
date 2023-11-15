package patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //given
        User john = new Millenials("John", new SnapchatPublisher());
        User steve = new YGeneration("Steve", new FacebookPublisher());
        User paul = new ZGeneration("Paul", new TwitterPublisher());
        //when
        String johnSharePost = john.sharePost();
        System.out.println(john.getUserName() + " shared a post on " + johnSharePost);
        String steveSharePost = steve.sharePost();
        System.out.println(steve.getUserName() + " shared a post on " + steveSharePost);
        String paulSharePost = paul.sharePost();
        System.out.println(paul.getUserName() + " shared a post on " + paulSharePost);
        //then
        assertEquals("Snapchat", johnSharePost);
        assertEquals("Facebook", steveSharePost);
        assertEquals("Twitter", paulSharePost);
    }

    @Test
    void testIndividualSharingStrategy(){
        //given
        User john = new Millenials("John", new SnapchatPublisher());
        //when
        String johnSharePost = john.sharePost();
        System.out.println(john.getUserName() + " shared a post on " + johnSharePost);
        john.setSocialPublisher(new TwitterPublisher());
        johnSharePost = john.sharePost();
        System.out.println(john.getUserName() + " shared a post on " + johnSharePost);
        //then
        assertEquals("Twitter", johnSharePost);

    }
}
