package com.cph.testass1;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\SKOLE\\TEST\\test-ass1\\src\\test\\resources\\features\\romanian.feature")
public class NumericConverter {
    public String convert(Integer r) {
        int base;
        String result = "";
        int t = r - r % 1000;

        for (int i = 0; i < t / 1000; i++) {
            result = result.concat("M");
        }
        base = r - t;
        int h = base - base % 100;

        switch (h) {
            case 900:
                result += "CM";
                break;
            case 800:
                result += "DCCC";
                break;
            case 700:
                result += "DCC";
                break;
            case 600:
                result += "DC";
                break;
            case 500:
                result += "D";
                break;
            case 400:
                result += "CD";
                break;
            case 300:
                result += "DCC";
                break;
            case 200:
                result += "CC";
                break;
            case 100:
                result += "C";
                break;
        }
        base = base - h;

        int d = base - base % 10;


        switch (d) {
            case 90:
                result += "XC";
                break;
            case 80:
                result += "LXXX";
                break;
            case 70:
                result += "LXX";
                break;
            case 60:
                result += "LX";
                break;
            case 50:
                result += "L";
                break;
            case 40:
                result += "XL";
                break;
            case 30:
                result += "XXX";
                break;
            case 20:
                result += "XX";
                break;
            case 10:
                result += "X";
                break;
        }
        base = base - d;
        switch (base) {
            case 9:
                result += "IX";
                break;
            case 8:
                result += "VIII";
                break;
            case 7:
                result += "VII";
                break;
            case 6:
                result += "VI";
                break;
            case 5:
                result += "V";
                break;
            case 4:
                result += "IV";
                break;
            case 3:
                result += "III";
                break;
            case 2:
                result += "II";
                break;
            case 1:
                result += "I";
                break;
        }
        return result;
    }
}
