package online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.AtmState;

import online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.ATM;
import online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
