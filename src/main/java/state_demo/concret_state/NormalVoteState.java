package state_demo.concret_state;

import state_demo.enviroment.VoteManager;

/**
 * Created by huang_sq on 2017/8/8.
 */
public class NormalVoteState implements VoteState{
    /**
     * 处理状态对应的行为
     *
     * @param user        投票人
     * @param voteItem    投票项
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，
     */
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");

    }
}
