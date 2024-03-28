package Not_Finished.Telephony;

import java.util.List;
import java.util.regex.Pattern;

public class Smartphone implements Callable,Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        return null;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile("[\\\\d]+");

        //Matcher matcher = pattern.matcher(pattern);


        return null;
    }
}
