package state_demo.concret_state;

import state_demo.enviroment.VoteManager;

/**
 * Created by huang_sq on 2017/8/8.
 * 投票的状态
 */
public interface VoteState {

    /**
     * 处理状态对应的行为
     *
     * @param user        投票人
     * @param voteItem    投票项
     * @param voteManager 投票上下文，用来在实现状态对应的功能处理的时候，
     *                    可以回调上下文的数据
     */
    public void vote(String user, String voteItem, VoteManager voteManager);


}
