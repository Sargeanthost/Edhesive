// Unit 5: Lesson 5 - Coding Activity 1

public class Post {

  String user;
  String contents;
  int favorites;

  public Post(String user, String contents, int favorites) {
    this.user = user;
    this.contents = contents;
    this.favorites = favorites;
  }

  public String toString() {

    return user + "\n" + contents + "\n\tFavorited by " + favorites + " users";
  }
}
