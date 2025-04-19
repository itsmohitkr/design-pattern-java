package online.devplanet.Basics.InterviewQuestion.LLDvendingMachine.State;

import online.devplanet.Basics.InterviewQuestion.LLDvendingMachine.Coin;
import online.devplanet.Basics.InterviewQuestion.LLDvendingMachine.Item;
import online.devplanet.Basics.InterviewQuestion.LLDvendingMachine.VendingMachine;

import java.util.List;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception;

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;

}
