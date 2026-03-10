package creational.singleton.a4_vote;

public class MainVote {
    public static void main(String[] args) {
        User u1 = new User("Khanh");
        User u2 = new User("Anh");
        User u3 = new User("Khanh1");

        u1.Vote(Candidate.DONAL_TRUMP);
        u2.Vote(Candidate.DONAL_TRUMP);
        u3.Vote(Candidate.JOE_BIDEN);

        Election.getInstance().printResult();

        u1.Vote(Candidate.DONAL_TRUMP);

        Election.getInstance().printResult();


    }
}
