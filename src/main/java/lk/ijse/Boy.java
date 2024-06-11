package lk.ijse;

public class Boy {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
    }
    public void chatWithGirl(){
        Agreement agreement = new Girl();
        agreement.chatWithMe();//Now we can access the method
    }
}
