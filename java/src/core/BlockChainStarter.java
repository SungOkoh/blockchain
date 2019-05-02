package core;

import util.Util;

import java.util.ArrayList;
import java.util.HashMap;

public class BlockChainStarter {

    public static void main(String[] args) {
        //blockID값(previousblockhash값 구하는데 사용될듯?)
        int index = 3;

        //전력 데이터 값 받기
        String data = "";

        ArrayList<Block> arr = new ArrayList<>();


        Block block1 = new Block(1, "data", null);
        block1.getInformation();

        Block block2 = new Block(2, data, block1.getBlockHash());
        block2.getInformation();

        if(!data.equals("")) {
            Block block3 = new Block(index, data, block2.getBlockHash());   //bgetblockhash랑 block3의 변수를 1씩 증가시키는 방법? 그런거없음
            block3.getInformation();
            data="";
            index++;
        }

    }
}