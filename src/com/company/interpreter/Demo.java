package com.company.interpreter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Token {
    public enum TYPES {
        INTEGERS, PLUS, MINS, RPARENT, LPARENT,MULTI;
    }

    public TYPES type;
    public String name;

    public Token(TYPES type, String name) {
        this.type = type;
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}


public class Demo {

    public static List<Token> lex(String word){
        ArrayList<Token> result = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            switch(word.charAt(i)){
                case '(':
                    result.add(new Token(Token.TYPES.LPARENT,"("));
                    break;
                case ')':
                    result.add(new Token(Token.TYPES.RPARENT,")"));
                    break;
                case '+':
                    result.add(new Token(Token.TYPES.PLUS,"+"));
                    break;
                case '*':
                    result.add(new Token(Token.TYPES.MULTI,"*"));
                    break;
                case '-':
                    result.add(new Token(Token.TYPES.MINS,"-"));
                    break;
                default:
                    StringBuilder sb = new StringBuilder(""+word.charAt(i));
                    for(int j=i+1;j<word.length();j++){
                        if(Character.isDigit(word.charAt(j))){
                            sb.append(word.charAt(j));
                            ++i;
                        }
                        else {
                            result.add(new Token(Token.TYPES.INTEGERS,sb.toString()));
                            break;
                        }
                    }
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "(15+90)*(23-9)";
        List<Token> tokensList=lex(input);
        System.out.println(tokensList.stream()
                .map(Token::toString)
                .collect(Collectors.toList()));
    }
}
