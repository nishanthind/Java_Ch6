/* Program in Java to implement Post and content managment through various String methods 
in a social media platform application. */

//----------------------CB-1--------------------
// Implement social media post class
//----------------------------------------------
class Post {
    private String username;
    private String content;

    public Post(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }
}

// ----------------------------------CB-2-----------------------
// Implement social media platform
// -------------------------------------------------------------
class SocialMediaPlatform {
    private Post[] posts;
    int postNo;

    public SocialMediaPlatform() {
        posts = new Post[10];
        postNo = 0;
    }

    // Create a new post
    public void createPost(String username, String content) {
        Post post = new Post(username, content);
        posts[postNo++] = post;
        System.out.println("Post created by @" + username + ": " + content);
    }

    // Search for posts containing a keyword
    public void searchPosts(String keyword) {
        System.out.println("Search results for keyword: " + keyword);
        for (int i = 0; i < postNo; i++) {
            if (posts[i].getContent().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("@" + posts[i].getUsername() + ": " + posts[i].getContent());
            }
        }
    }

    // Extract a preview of a post
    public String extractPreview(String content, int maxLength) {
        if (content.length() <= maxLength) {
            return content;
        } else {
            return content.substring(0, maxLength) + "...";
        }
    }
}

// ------------------------------------------CB-3--------------------------
// Implementing main method
// ------------------------------------------------------------------------
public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMediaPlatform platform = new SocialMediaPlatform();

        // Create some posts
        platform.createPost("user1", "This is my first post. #java #socialmedia");
        platform.createPost("user2", "Hello, world! #programming");
        platform.createPost("user1", "Java is fun!");

        // Search for posts
        platform.searchPosts("java");

        // Extract and display a post preview
        String postContent = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        String preview = platform.extractPreview(postContent, 20);
        System.out.println("Post Preview: " + preview);
    }
}
// --------------------------------------------------------------------------
