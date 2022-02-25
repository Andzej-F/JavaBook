package Chapter_6;

public class ErrorInfo {
    public String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    public int howbad[] = {3, 3, 2, 4};

    //    public Err getErrorInfo(2) {
    public Err getErrorInfo(int i) {

//        if (2 >= 0 & 2 < 4) {
        if (i >= 0 & i < msgs.length) {
//            return new Err(msgs[2], howbad[2]);
//            return new Err("Disk Full", 2);//
            return new Err(msgs[i], howbad[i]);
        }

        return new Err("Invalid Error Code", 0);
    }
}
