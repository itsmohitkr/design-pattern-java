package online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.AtmState;

import online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.ATM;
import online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.Card;
import online.devplanet.Basics.InterviewQuestion.LLDAtmMachine.TransactionType;

// Abstract Class: This class is abstract, meaning it cannot be instantiated directly. It serves as a base class for other state-specific classes.
public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmount){
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something went wrong");
    }


}
