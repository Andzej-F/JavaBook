package Chapter_6;

public class ErrorMsg {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };

    // Return the error message.
    public String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        }

        // returns Strign object
        return "Invalid Error Code";
    }
}
