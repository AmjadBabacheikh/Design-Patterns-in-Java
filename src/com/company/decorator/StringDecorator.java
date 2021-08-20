package com.company.decorator;

public class StringDecorator {

    private String string;

    public StringDecorator(String string) {
        this.string = string;
    }

    public long getNumberOfVowels(){
        return string.chars()
                .mapToObj(c->(char)c)
                .filter(c-> "aieou".contains(c.toString()))
                .count();
    }

}
class Demo{
    public static void main(String[] args) {
        StringDecorator s = new StringDecorator("Amjad");
        System.out.println("number of vowels in s is :"+s.getNumberOfVowels());
    }
}
