package creational.singleton.a4_vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int trump = 0, biden = 0;
    List<String> votedUsers = new ArrayList<>();

    private Election(){}
    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }

    protected void vote(Candidate c, String userId){
        for(var id: votedUsers)
            if(id.equals(userId))
                return;
        votedUsers.add(userId);
        if(c==Candidate.DONAL_TRUMP){
            trump++;
        }else{
            biden++;
        }
    }

    public void printResult(){
        System.out.println("Donal Trump: " + trump);
        System.out.println("Joe Biden: " + biden);

    }
}
