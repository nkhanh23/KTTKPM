package creational.singleton.a4_vote;

public class User {
    private String id;

    public User(String id) {
        this.id = id;
    }

    public void Vote(Candidate c){
        Election.getInstance().vote(c, this.id);
    }
}
