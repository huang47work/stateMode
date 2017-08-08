package state_demo.client;

import state_demo.enviroment.VoteManager;

/**
 * Created by huang_sq on 2017/8/8.
 * 客户端
 */
public class TestClient {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
