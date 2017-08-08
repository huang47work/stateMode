package state_demo.concret_state;


import state_demo.enviroment.VoteManager;

/**
 * Created by huang_sq on 2017/8/8.
 * 重复投票
 */
public class RepeatVoteState implements VoteState{

    /**
     * 处理状态对应的行为
     *
     * @param user        投票人
     * @param voteItem    投票项
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，
     */
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }
}
