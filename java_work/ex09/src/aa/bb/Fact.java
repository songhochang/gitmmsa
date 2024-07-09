package aa.bb;

public class Fact {

    public int aa(int num){
        if(num==0){
            return 0;
        }
        else{
            return num + aa(num -1);
        }
    }
}
