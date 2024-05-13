package OOP.belajarjava.data;

class SocialMedia {
    String name;
}

final class Facebook extends SocialMedia {

}

//class FakeFacebook extends Facebook { // Error
//}

class Twitter extends SocialMedia {
    final void login(String username, String password) {

    }
}

//class FakeTwitter extends Twitter {
//    void login(String username, String password) { // Error
//    }
//}
